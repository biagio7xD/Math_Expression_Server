package it.units.project.support.visitor;

import it.units.project.support.antlr.grammar.RequestGrammarBaseVisitor;
import it.units.project.support.antlr.grammar.RequestGrammarParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.stream.Collectors;

public class ExpressionsVisitor extends RequestGrammarBaseVisitor<List<String>> {

  @Override
  public List<String> visitExpressions(RequestGrammarParser.ExpressionsContext ctx) {
	return ctx.expression().stream().map(RuleContext::getText).collect(Collectors.toList());
  }
}