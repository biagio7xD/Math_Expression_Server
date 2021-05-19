package it.units.project.response;

import it.units.project.request.CommandType;

public class CommandResponse {
  private final AbstractResponse abstractResponse;
  private final CommandType commandType;

  public CommandResponse(AbstractResponse abstractResponse, CommandType commandType) {
	this.abstractResponse = abstractResponse;
	this.commandType = commandType;
  }

  public CommandResponse(CommandType commandType) {
	this.commandType = commandType;
	this.abstractResponse = null;
  }

  public CommandType getCommandType() {
	return commandType;
  }

  public String getResponse() {
	if (abstractResponse != null) {
	  return abstractResponse.buildResponse();
	} else {
	  throw new NullPointerException("Response doesn't exist.");
	}
  }
}
