package it.units.project.response;

import java.util.Locale;

public class SuccessfulResponse extends AbstractResponse {

  private final String requestTime;
  private final String result;

  public SuccessfulResponse(double result, double requestTime) {
	super(ResponseType.OK);
	this.result = formatDigitsOfValue(result, 6);
	this.requestTime = formatDigitsOfValue(requestTime, 3);
  }

  @Override
  public String buildResponse() {
	return responseType.name()
			+ SEPARATOR
			+ requestTime
			+ SEPARATOR
			+ result;
  }

  private String formatDigitsOfValue(double value, int numOfDecimalDigits) {
	return String.format(Locale.US, "%." + numOfDecimalDigits + "f", value);
  }

}
