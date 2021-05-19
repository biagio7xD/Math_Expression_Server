package it.units.project.support.visitor;

import it.units.project.request.AbstractRequest;
import it.units.project.request.computation.ComputationType;
import it.units.project.request.computation.ComputeRequest;
import it.units.project.request.computation.ValuesType;
import it.units.project.request.quit.QuitRequest;
import it.units.project.request.stats.StatRequest;
import it.units.project.request.stats.StatType;
import it.units.project.support.antlr.grammar.RequestGrammarBaseVisitor;
import it.units.project.support.antlr.grammar.RequestGrammarParser;

public class CommandVisitor extends RequestGrammarBaseVisitor<AbstractRequest> {

  private final double[] stats;
  private final CommandTypeVisitor commandTypeVisitor = new CommandTypeVisitor();

  public CommandVisitor(double[] stats) {
	this.stats = stats;
  }

  @Override
  public AbstractRequest visitComputationRequest(RequestGrammarParser.ComputationRequestContext ctx) {
	ExpressionsVisitor expressionsVisitor = new ExpressionsVisitor();
	VariableValuesFunctionVisitor variableValuesFunctionVisitor = new VariableValuesFunctionVisitor();
	return new ComputeRequest(
			variableValuesFunctionVisitor.visitVariableValuesFunction(ctx.variableValuesFunction()),
			ComputationType.valueOf(commandTypeVisitor.visitComputationType(ctx.computationType())),
			ValuesType.valueOf(commandTypeVisitor.visitValuesType(ctx.valuesType())),
			expressionsVisitor.visitExpressions(ctx.expressions())
	);
  }

  @Override
  public AbstractRequest visitStatRequest(RequestGrammarParser.StatRequestContext ctx) {
	return new StatRequest(StatType.valueOf(commandTypeVisitor.visitStatRequest(ctx)), stats);
  }

  @Override
  public AbstractRequest visitQuitRequest(RequestGrammarParser.QuitRequestContext ctx) {
	return new QuitRequest();
  }
}
