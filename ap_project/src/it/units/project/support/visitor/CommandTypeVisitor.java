package it.units.project.support.visitor;

import it.units.project.support.antlr.grammar.RequestGrammarBaseVisitor;
import it.units.project.support.antlr.grammar.RequestGrammarParser;

public class CommandTypeVisitor extends RequestGrammarBaseVisitor<String> {

  @Override
  public String visitStatAvgCommand(RequestGrammarParser.StatAvgCommandContext ctx) {
	return ctx.getText();
  }

  @Override
  public String visitStatMaxCommand(RequestGrammarParser.StatMaxCommandContext ctx) {
	return ctx.getText();
  }

  @Override
  public String visitStatReqsCommand(RequestGrammarParser.StatReqsCommandContext ctx) {
	return ctx.getText();
  }

  @Override
  public String visitValuesType(RequestGrammarParser.ValuesTypeContext ctx) {
	return ctx.getText();
  }

  @Override
  public String visitComputationType(RequestGrammarParser.ComputationTypeContext ctx) {
	return ctx.getText();
  }

}
