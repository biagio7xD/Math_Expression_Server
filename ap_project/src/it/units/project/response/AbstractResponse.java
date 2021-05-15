package it.units.project.response;

public abstract class AbstractResponse {

  protected static final char SEPARATOR = ';';
  protected final ResponseType responseType;
  protected String responseMessage;

  public AbstractResponse(String responseMessage, ResponseType responseType) {
	this.responseType = responseType;
	this.responseMessage = responseMessage;
  }

  public AbstractResponse(Throwable e, ResponseType responseType) {
	this.responseType = responseType;
	responseMessage = String.format("(%s) %s", e.getClass().getSimpleName(), e.getMessage());
  }

  protected abstract String buildResponse();
}
