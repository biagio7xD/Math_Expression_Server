package it.units.project.request.computation;

import com.google.common.collect.Lists;
import it.units.project.exception.BadDomainDefinition;
import it.units.project.request.computation.variablevaluesfunction.VariableValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComputationDomain {

  private final List<VariableValue> variableValuesList;
  private final ValuesType valuesType;

  public ComputationDomain(List<VariableValue> variableValuesList, ValuesType valuesType) {
	this.variableValuesList = variableValuesList;
	this.valuesType = valuesType;
  }

  public MultiVariableValues buildComputationDomain() {
	if (isVariableNameAlreadyDefined(variableValuesList)) {
	  throw new BadDomainDefinition("Same variable defined twice.");
	}
	final List<String> variablesNames = getVariablesNames();
	final List<List<Double>> valuesSequences = buildVariableValuesSequences();
	return switch (valuesType) {
	  case GRID -> makeGrid(variablesNames, valuesSequences);
	  case LIST -> makeList(variablesNames, valuesSequences);
	};
  }

  private List<List<Double>> buildVariableValuesSequences() {
	return variableValuesList.stream().map(VariableValue::buildVariableValueSequence).collect(Collectors.toList());
  }

  public List<String> getVariablesNames() {
	return variableValuesList.stream().map(VariableValue::getVariableName).collect(Collectors.toList());
  }

  private MultiVariableValues makeGrid(List<String> variablesNames, List<List<Double>> valuesSequences) {
	return new MultiVariableValues(variablesNames, Lists.cartesianProduct(valuesSequences));
  }

  private MultiVariableValues makeList(List<String> variableNames, List<List<Double>> valuesSequences) {
	int domainSize = checkListsHaveSameSize(valuesSequences);
	if (domainSize == -1) {
	  throw new BadDomainDefinition("Variables don't have the same domain size");
	}
	List<List<Double>> mergedListElement = mergeListElement(valuesSequences, domainSize);
	return new MultiVariableValues(variableNames, mergedListElement);
  }


  private List<List<Double>> mergeListElement(List<List<Double>> valuesSequences, int domainSize) {
	List<List<Double>> tuples = new ArrayList<>();
	for (int i = 0; i < domainSize; i++) {
	  List<Double> tuple = new ArrayList<>();
	  for (List<Double> values : valuesSequences) {
		if (values != null) {
		  tuple.add(values.get(i));
		}
	  }
	  tuples.add(tuple);
	}
	return tuples;
  }

  private int checkListsHaveSameSize(List<List<Double>> valuesSequences) {
	int lastSize = -1;
	for (List<Double> values : valuesSequences) {
	  if (values != null) {
		if ((lastSize != values.size()) && (lastSize != -1)) {
		  return -1;
		}
		lastSize = values.size();
	  }
	}
	return lastSize;
  }

  private boolean isVariableNameAlreadyDefined(List<VariableValue> listOfVariableValues) {
	String[] variables = listOfVariableValues.stream()
			.map(VariableValue::getVariableName)
			.toArray(String[]::new);
	return Arrays.stream(variables).distinct().count() != variables.length;
  }
}
