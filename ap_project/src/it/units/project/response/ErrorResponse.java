package it.units.project.response;

import java.util.Locale;

public class ErrorResponse extends AbstractResponse {

  public ErrorResponse(Throwable e) {
	super(e, ResponseType.ERR);
  }

  @Override
  public String buildResponse() {
	return String.format(Locale.US, "%s%s%s", responseType.name(), SEPARATOR, responseMessage);
  }
}
