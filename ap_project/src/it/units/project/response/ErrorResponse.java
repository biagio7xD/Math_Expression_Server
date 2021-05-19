package it.units.project.response;

import java.util.Locale;

public class ErrorResponse extends AbstractResponse {
  private final String response;

  public ErrorResponse(Throwable e) {
	super(ResponseType.ERR);
	response = String.format("(%s) %s", e.getClass().getSimpleName(), e.getMessage());
  }

  @Override
  public String buildResponse() {
	return String.format(Locale.US, "%s%s%s", responseType.name(), SEPARATOR, response);
  }
}
