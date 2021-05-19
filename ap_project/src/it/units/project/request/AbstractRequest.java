package it.units.project.request;

import it.units.project.response.CommandResponse;

public abstract class AbstractRequest {

  protected final CommandType commandType;
  private double time;

  public AbstractRequest(CommandType commandType) {
	this.commandType = commandType;
	time = System.nanoTime();
  }

  public abstract CommandResponse process();

  public double finalizeRequestExecutionTime() {
	time = (System.nanoTime() - time) / 1e9;
	return time;
  }

  public double getTime() {
	return this.time;
  }

  public CommandType getCommandType() {
	return commandType;
  }
}
