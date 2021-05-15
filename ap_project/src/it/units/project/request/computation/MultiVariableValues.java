package it.units.project.request.computation;

import java.util.List;

public class MultiVariableValues {

  private final List<String> variablesNames;
  private final List<List<Double>> variablesValuesTuples;

  public MultiVariableValues(List<String> variablesNames, List<List<Double>> variablesValuesTuples) {
	this.variablesNames = variablesNames;
	this.variablesValuesTuples = variablesValuesTuples;
  }

  public List<String> getVariablesNames() {
	return variablesNames;
  }

  public int size() {
	return variablesValuesTuples.size();
  }

  public double getValueOfVariableNameFromTuple(String variableName, int idxTuple) {
	int idxVariableName = getVariableNameIndex(variableName);
	return variablesValuesTuples.get(idxTuple).get(idxVariableName);
  }

  private int getVariableNameIndex(String variableName) {
	return variablesNames.indexOf(variableName);
  }

  @Override
  public String toString() {
	StringBuilder stringBuilder = new StringBuilder();
	for (int idxTuple = 0; idxTuple < variablesValuesTuples.size(); idxTuple++) {
	  stringBuilder.append("[ ");
	  for (String variableName : variablesNames) {
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