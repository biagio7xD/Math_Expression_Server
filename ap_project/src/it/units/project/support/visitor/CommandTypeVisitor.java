package it.units.project.support.visitor;

import it.units.project.support.antlr.grammar.RequestGrammarBaseVisitor;
import it.units.project.support.antlr.grammar.RequestGrammarParser;

public class CommandTypeVisitor extends RequestGrammarBaseVisitor<String> {

  @Override
  public String visitStatRequest(RequestGrammarParser.StatRequestContext ctx) {
	return ctx.getText();
  }

  @Override
  public String visitValuesKind(RequestGrammarParser.ValuesKindContext ctx) {
	return ctx.getText();
  }

  @Override
  public String visitComputationKind(RequestGrammarParser.ComputationKindContext ctx) {
	return ctx.getText();
  }

}
