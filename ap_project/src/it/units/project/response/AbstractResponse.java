package it.units.project.response;

public abstract class AbstractResponse {

  protected static final char SEPARATOR = ';';
  protected final ResponseType responseType;

  public AbstractResponse(ResponseType responseType) {
	this.responseType = responseType;
  }

  protected abstract String buildResponse();
}
