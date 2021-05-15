package it.units.project.server;

import it.units.project.exception.*;
import it.units.project.request.AbstractRequest;
import it.units.project.request.CommandType;
import it.units.project.response.CommandResponse;
import it.units.project.response.ErrorResponse;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ProcessingServer extends Server {

  private final ClientRequestHandler clientRequestHandler;
  private final double[] stats;
  private final Object lock = new Object();

  public ProcessingServer(int port) {
	super(port);
	stats = new double[3];
	clientRequestHandler = new ClientRequestHandler();
  }

  @Override
  public CommandResponse process(String input) {
	AbstractRequest request;
	try {
	  request = clientRequestHandler.parse(input, stats);
	} catch (MalformedInputRequest | MalformedVariableValueDefinition e) {
	  return new CommandResponse(new ErrorResponse(e), null);
	}
	return execute(request, request.getCommandType());
  }

  private CommandResponse execute(AbstractRequest request, CommandType commandType) {
	return switch (commandType) {
	  case BYE -> new CommandResponse(null, commandType);
	  case STATS -> {
		synchronized (lock) {
		  yield execute(request);
		}
	  }
	  case COMPUTATION -> {
		Future<CommandResponse> future = executorService.submit(() -> execute(request));
		try {
		  yield future.get();
		} catch (InterruptedException | ExecutionException | CancellationException e) {
		  yield new CommandResponse(new ErrorResponse(e), request.getCommandType());
		}
	  }
	};
  }

  private CommandResponse execute(AbstractRequest request) {
	CommandResponse response;
	try {
	  response = request.compute();
	  updateStats(request.getTime());
	} catch (CommandException | BadDomainDefinition | ComputationException | IllegalArgumentException e) {
	  response = new CommandResponse(new ErrorResponse(e), request.getCommandType());
	}
	return response;
  }

  private synchronized void updateStats(double requestExecutionTime) {
	stats[0] += 1;
	stats[1] += requestExecutionTime;
	if (requestExecutionTime > stats[2]) {
	  stats[2] = requestExecutionTime;
	}
  }

}
