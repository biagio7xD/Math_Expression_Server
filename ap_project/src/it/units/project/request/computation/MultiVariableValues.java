package it.units.project.request.computation;

import java.util.List;

public class MultiVariableValues {

  private final List<String> variableNames;
  private final List<List<Double>> variableValuesTuples;

  public MultiVariableValues(List<String> variableNames, List<List<Double>> variableValuesTuples) {
	this.variableNames = variableNames;
	this.variableValuesTuples = variableValuesTuples;
  }

  public List<String> getVariableNames() {
	return variableNames;
  }

  public int size() {
	return variableValuesTuples.size();
  }

  public double getValueOfVariableNameFromTuple(String variableName, int idxTuple) {
	int idxVariableName = getVariableNameIndex(variableName);
	return variableValuesTuples.get(idxTuple).get(idxVariableName);
  }

  private int getVariableNameIndex(String variableName) {
	return variableNames.indexOf(variableName);
  }

  @Override
  public String toString() {
	StringBuilder stringBuilder = new StringBuilder();
	for (int idxTuple = 0; idxTuple < variableValuesTuples.size(); idxTuple++) {
	  stringBuilder.append("[ ");
	  for (String variableName : variableNames) {
		stringBuilder.append(variableName)
				.append(":")
				.append(getValueOfVariableNameFromTuple(variableName, idxTuple))
				.append(" ");
	  }
	  stringBuilder.append("]\n");
	}
	return stringBuilder.toString();
  }
}