package it.units.project.server;

import it.units.project.request.AbstractRequest;
import it.units.project.support.RequestParserContext;
import it.units.project.support.antlr.grammar.RequestGrammarBaseListener;
import it.units.project.support.antlr.grammar.RequestGrammarParser;
import it.units.project.support.visitor.CommandVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ClientRequestHandler {

  public ClientRequestHandler() {
  }

  public AbstractRequest parse(String input, double[] stats) {
	RequestParserContext requestParserContext = new RequestParserContext(input);
	ParseTreeWalker.DEFAULT.walk(new RequestGrammarBaseListener(), requestParserContext.parse(RequestGrammarParser::parse));
	ParserRuleContext parserRuleContext = requestParserContext.parse(RequestGrammarParser::command);
	CommandVisitor visitor = new CommandVisitor(stats);
	return visitor.visit(parserRuleContext);
  }

}
