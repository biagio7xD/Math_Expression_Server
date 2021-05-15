package it.units.project.support.visitor;

import it.units.project.exception.MalformedVariableValueDefinition;
import it.units.project.request.computation.variablevaluesfunction.VariableValue;
import it.units.project.support.antlr.grammar.RequestGrammarBaseVisitor;
import it.units.project.support.antlr.grammar.RequestGrammarParser;

import java.util.List;
import java.util.stream.Collectors;

public class VariableValuesFunctionVisitor extends RequestGrammarBaseVisitor<List<VariableValue>> {

  @Override
  public List<VariableValue> visitVariableValuesFunction(RequestGrammarParser.VariableValuesFunctionContext ctx) {
	VariableValuesVisitor variableValuesVisitor = new VariableValuesVisitor();
	return ctx.variableValues()
			.stream()
			.map(variableValuesVisitor::visitVariableValues)
			.collect(Collectors.toList());
  }

  private static class VariableValuesVisitor extends RequestGrammarBaseVisitor<VariableValue> {
	private static final String REGEX_VARIABLE_NAME = "[a-z][a-z0-9]*";

	@Override
	public VariableValue visitVariableValues(RequestGrammarParser.VariableValuesContext ctx) {
	  String variableName = ctx.variable().getText();
	  double lower = Double.parseDouble(ctx.variableLowerValue().getText());
	  double step = Double.parseDouble(ctx.variableStepValue().getText());
	  double upper = Double.parseDouble(ctx.variableUpperValue().getText());
	  if (!variableName.matches(REGEX_VARIABLE_NAME)) {
		throw new MalformedVariableValueDefinition("Variable's name must begin with a letter!");
	  }
	  if (step <= 0) {
		throw new MalformedVariableValueDefinition("Variable's STEP :" + step + " must NOT be less or equal to zero !");
	  }
	  if ((upper < lower)) {
		throw new MalformedVariableValueDefinition("Variable's UPPER :" + upper + " can't be less then the LOWER :" + lower);
	  }
	  if (((upper - lower) / step) < 0) {
		throw new MalformedVariableValueDefinition("Variable Value don't match protocol specification");
	  }
	  return new VariableValue(variableName, lower, step, upper);
	}
  }
}
