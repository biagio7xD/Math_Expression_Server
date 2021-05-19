package it.units.project.request.quit;

import it.units.project.request.AbstractRequest;
import it.units.project.request.CommandType;
import it.units.project.response.CommandResponse;

public class QuitRequest extends AbstractRequest {
  public QuitRequest() {
	super(CommandType.BYE);
  }

  @Override
  public CommandResponse process() {
	return new CommandResponse(null, commandType);
  }
}
