package it.units.project.request.computation;

import it.units.project.exception.ComputationException;
import it.units.project.request.AbstractRequest;
import it.units.project.request.CommandType;
import it.units.project.request.computation.expression.*;
import it.units.project.request.computation.variablevalue.VariableValue;
import it.units.project.response.AbstractResponse;
import it.units.project.response.CommandResponse;
import it.units.project.response.SuccessfulResponse;

import java.util.List;
import java.util.function.Function;

public class ComputeRequest extends AbstractRequest {

  private static final int CHILDREN_SIZE = 2;
  private final List<VariableValue> variableValueList;
  private final ComputationType computationType;
  private final ValuesType valuesType;
  private final List<String> expressions;

  public ComputeRequest(List<VariableValue> variableValueList, ComputationType computationType, ValuesType valuesType, List<String> expressions) {
	super(CommandType.COMPUTATION);
	this.variableValueList = variableValueList;
	this.computationType = computationType;
	this.valuesType = valuesType;
	this.expressions = expressions;
  }

  @Override
  public CommandResponse process() {
	final ComputationDomain computationDomain = new ComputationDomain(variableValueList, valuesType);
	double result = switch (computationType) {
	  case MAX, MIN -> computeResult(computationDomain, expressions);
	  case AVG -> computeResult(computationDomain, expressions.subList(0, 1));
	  case COUNT -> computeResult(computationDomain);
	};
	final AbstractResponse response = new SuccessfulResponse(result, this.finalizeRequestExecutionTime());
	return new CommandResponse(response, commandType);
  }

  private double computeResult(ComputationDomain computationDomain, List<String> expressionList) {
	double result = setInitialResult();
	MultiVariableValues multiVariableValues = computationDomain.buildComputationDomain();
	for (String expression : expressionList) {
	  Node node = new Parser(expression).parse();
	  for (int idxTuple = 0; idxTuple < multiVariableValues.size(); idxTuple++) {
		double tmpResult = evaluateExpression(node, multiVariableValues, idxTuple);
		result = mergeResult(result, tmpResult);
	  }
	}
	return finalizeResult(result, multiVariableValues.size());
  }

  private double computeResult(ComputationDomain computationDomain) {
	return computationDomain.buildComputationDomain().size();
  }

  private double finalizeResult(double currentResult, int size) {
	return switch (computationType) {
	  case MAX, MIN -> currentResult;
	  case AVG -> currentResult / size;
	  default -> throw new IllegalStateException("Unexpected value: " + computationType);
	};
  }

  private double mergeResult(double currentResult, double tmpResult) {
	return switch (computationType) {
	  case MAX -> Math.max(currentResult, tmpResult);
	  case MIN -> Math.min(currentResult, tmpResult);
	  case AVG -> currentResult + tmpResult;
	  default -> throw new IllegalStateException("Unexpected value to merge current and tmp result: " + computationType);
	};
  }

  private double setInitialResult() {
	return switch (computationType) {
	  case MAX -> Double.MIN_VALUE;
	  case MIN -> Double.MAX_VALUE;
	  case AVG -> 0.0;
	  default -> throw new IllegalStateException("Unexpected value to set initial value for computation: " + computationType);
	};
  }

  private double evaluateExpression(Node node, MultiVariableValues multiVariableValues, int idxTuple) {
	double value = 0.0;
	if (node.getClass() == Variable.class) {
	  boolean control = false;
	  for (String variableName : multiVariableValues.getVariableNames()) {
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
