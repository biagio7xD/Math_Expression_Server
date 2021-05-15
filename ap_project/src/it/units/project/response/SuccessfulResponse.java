package it.units.project.response;

import java.util.Locale;

public class SuccessfulResponse extends AbstractResponse {

  private static final int DECIMAL_PRECISION = 3;
  private final double requestTime;

  public SuccessfulResponse(String response, double requestTime) {
	super(response, ResponseType.OK);
	this.requestTime = requestTime;
  }

  @Override
  public String buildResponse() {
	return responseType.name()
			+ SEPARATOR
			+ String.format(Locale.US, "%." + DECIMAL_PRECISION + "f", requestTime)
			+ SEPARATOR
			+ responseMessage;
  }
}
