package it.units.project.response;

import it.units.project.request.CommandType;

public class CommandResponse {
  private AbstractResponse abstractResponse;
  private final CommandType commandType;

  public CommandResponse(AbstractResponse abstractResponse, CommandType commandType) {
	this.abstractResponse = abstractResponse;
	this.commandType = commandType;
  }

  public CommandResponse(CommandType commandType) {
	this.commandType = commandType;
  }

  public CommandType getCommandType() {
	return commandType;
  }

  public String getResponse() {
	return abstractResponse.buildResponse();
  }
}
