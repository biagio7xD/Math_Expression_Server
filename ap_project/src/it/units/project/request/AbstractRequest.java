package it.units.project.request;

import it.units.project.response.CommandResponse;

import java.util.Locale;

public abstract class AbstractRequest {

  protected final CommandType commandType;
  protected double[] stats;
  private double time;

  public AbstractRequest(CommandType commandType) {
	this.commandType = commandType;
	time = System.nanoTime();
  }

  public AbstractRequest(double[] stats, CommandType commandType) {
	this.stats = stats;
	this.commandType = commandType;
	time = System.nanoTime();
  }

  public abstract CommandResponse compute();

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

  public String formatValue(double value, int numOfDecimalDigits) {
	return String.format(Locale.US, "%." + numOfDecimalDigits + "f", value);
  }
}
