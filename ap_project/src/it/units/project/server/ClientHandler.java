package it.units.project.server;

import it.units.project.request.CommandType;
import it.units.project.response.CommandResponse;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class ClientHandler extends Thread {

  private final Socket socket;
  private final CommandProcessor commandProcessor;

  public ClientHandler(Socket socket, CommandProcessor commandProcessor) {
	this.socket = socket;
	this.commandProcessor = commandProcessor;
  }

  @Override
  public void run() {
	try (socket;
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
	  int requestCounter = 0;
	  while (true) {
		String request = bufferedReader.readLine();
		if (isNullRequest(request)) {
		  System.err.print(forcedCloseConnectionMessage(socket));
		  break;
		}
		CommandResponse response = handleRequest(request);
		if (isQuitRequest(response)) {
		  socket.close();
		  System.out.print(closeConnectionMessage(socket, requestCounter));
		  break;
		}
		sendResponse(bufferedWriter, response);
		requestCounter++;
	  }
	} catch (IOException e) {
	  System.err.print(forcedCloseConnectionMessage(socket));
	}
  }

  private CommandResponse handleRequest(String request) {
	return commandProcessor.process(request);
  }

  private void sendResponse(BufferedWriter bufferedWriter, CommandResponse response) throws IOException {
	bufferedWriter.write(response.getResponse() + System.lineSeparator());
	bufferedWriter.flush();
  }

  private boolean isNullRequest(String request) {
	return request == null;
  }

  private boolean isQuitRequest(CommandResponse response) {
	return response.getCommandType() == CommandType.BYE;
  }

  private String closeConnectionMessage(Socket socket, int counter) {
	return String.format(
			"[%1$tH:%1$tM:%1$tS %1$tA, %1$td %1$tB %1$tY] Client: %2$s:%3$d disconnected after %4$d request.%5$s",
			new Date(), socket.getInetAddress(), socket.getPort(), counter, System.lineSeparator()
	);
  }

  private String forcedCloseConnectionMessage(Socket socket) {
	return String.format(
			"[%1$tH:%1$tM:%1$tS %1$tA, %1$td %1$tB %1$tY] Client: %2$s:%3$d abruptly closed connection.%4$s",
			new Date(), socket.getInetAddress(), socket.getPort(), System.lineSeparator()
	);
  }
}
