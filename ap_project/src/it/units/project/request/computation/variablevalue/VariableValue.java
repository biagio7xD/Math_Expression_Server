package it.units.project.request.computation.variablevalue;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.math.MathContext.DECIMAL32;

public class VariableValue {

  private final String variableName;
  private final double lower;
  private final double step;
  private final double upper;

  public VariableValue(String variableName, double lower, double step, double upper) {
	this.variableName = variableName;
	this.lower = lower;
	this.step = step;
	this.upper = upper;
  }

  public String getVariableName() {
	return variableName;
  }

  public List<Double> buildVariableValueSequence() {
	final BigDecimal lowerValue = new BigDecimal(lower, DECIMAL32);
	final BigDecimal stepValue = new BigDecimal(step, DECIMAL32);
	final BigDecimal upperValue = new BigDecimal(upper, DECIMAL32);
	return Stream.iterate(lowerValue, value -> value.compareTo(upperValue) <= 0, value -> value.add(stepValue))
			.mapToDouble(BigDecimal::doubleValue)
			.boxed()
			.collect(Collectors.toList());
  }
}
