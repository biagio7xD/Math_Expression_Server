package it.units.project.request.computation;

import it.units.project.exception.ComputationException;
import it.units.project.request.AbstractRequest;
import it.units.project.request.CommandType;
import it.units.project.request.computation.expression.*;
import it.units.project.request.computation.variablevaluesfunction.VariableValue;
import it.units.project.response.AbstractResponse;
import it.units.project.response.CommandResponse;
import it.units.project.response.SuccessfulResponse;

import java.util.List;
import java.util.function.Function;

public class ComputeRequest extends AbstractRequest {

  private static final int CHILDREN_SIZE = 2;
  private final List<VariableValue> variableValueList;
  private final ComputationType computationKind;
  private final ValuesType valuesKind;
  private final List<String> expressions;

  public ComputeRequest(List<VariableValue> variableValueList, ComputationType computationKind, ValuesType valuesKind, List<String> expressions) {
	super(CommandType.COMPUTATION);
	this.variableValueList = variableValueList;
	this.computationKind = computationKind;
	this.valuesKind = valuesKind;
	this.expressions = expressions;
  }

  @Override
  public CommandResponse compute() {
	final ComputationDomain computationDomain = new ComputationDomain(variableValueList, valuesKind);
	String result = switch (computationKind) {
	  case MAX, MIN -> determineComputationResult(computationDomain, expressions);
	  case AVG -> determineComputationResult(computationDomain, expressions.subList(0, 1));
	  case COUNT -> determineComputationResult(computationDomain);
	};
	final AbstractResponse response = new SuccessfulResponse(result, this.finalizeRequestExecutionTime());
	return new CommandResponse(response, commandType);
  }

  private String determineComputationResult(ComputationDomain computationDomain, List<String> expressionList) {
	double result = setInitialResultValue();
	MultiVariableValues multiVariableValues = computationDomain.buildComputationDomain();
	for (String expression : expressionList) {
	  Node node = new Parser(expression).parse();
	  for (int idxTuple = 0; idxTuple < multiVariableValues.size(); idxTuple++) {
		double tmpResult = evaluateExpression(node, multiVariableValues, idxTuple);
		result = mergeResult(result, tmpResult);
	  }
	}
	return finalizeComputationResult(result, multiVariableValues.size());
  }

  private String determineComputationResult(ComputationDomain computationDomain) {
	double size = computationDomain.buildComputationDomain().size();
	return formatValue(size, 6);
  }

  private String finalizeComputationResult(double currentResult, int size) {
	return switch (computationKind) {
	  case MAX, MIN -> formatValue(currentResult, 6);
	  case AVG -> {
		double result = currentResult / size;
		yield formatValue(result, 6);
	  }
	  default -> throw new IllegalStateException("Unexpected value: " + computationKind);
	};

  }

  private double mergeResult(double currentResult, double tmpResult) {
	return switch (computationKind) {
	  case MAX -> Math.max(currentResult, tmpResult);
	  case MIN -> Math.min(currentResult, tmpResult);
	  case AVG -> currentResult + tmpResult;
	  default -> throw new IllegalStateException("Unexpected value in method mergeResult(): " + computationKind);
	};
  }

  private double setInitialResultValue() {
	return switch (computationKind) {
	  case MAX -> Double.MIN_VALUE;
	  case MIN -> Double.MAX_VALUE;
	  case AVG -> 0.0;
	  default -> throw new IllegalStateException("Unexpected value in method setInitialResultValue(): " + computationKind);
	};
  }

  private double evaluateExpression(Node node, MultiVariableValues multiVariableValues, int idxTuple) {
	double value = 0.0;
	if (node.getClass() == Variable.class) {
	  boolean control = false;
	  for (String variableName : multiVariableValues.getVariablesNames()) {
		if (variableName.equals(((Variable) node).getName())) {
		  value = multiVariableValues.getValueOfVariableNameFromTuple(variableName, idxTuple);
		  control = true;
		}
	  }
	  if (!control) {
		throw new ComputationException("Unevaluated variable " + ((Variable) node).getName());
	  }
	  return value;
	}
	if (node.getClass() == Constant.class) {
	  value = ((Constant) node).getValue();
	  return value;
	}
	if (node.getClass() == Operator.class) {
	  Function<double[], Double> function = ((Operator) node).getType().getFunction();
	  double[] values = new double[CHILDREN_SIZE];
	  values[0] = evaluateExpression(node.getChildren().get(0), multiVariableValues, idxTuple);
	  values[1] = evaluateExpression(node.getChildren().get(1), multiVariableValues, idxTuple);
	  return function.apply(values);
	}
	return value;
  }
}
