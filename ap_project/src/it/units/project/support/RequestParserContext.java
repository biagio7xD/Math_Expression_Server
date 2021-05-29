package it.units.project.support;

import it.units.project.exception.MalformedInputRequest;
import it.units.project.support.antlr.grammar.RequestGrammarLexer;
import it.units.project.support.antlr.grammar.RequestGrammarParser;
import org.antlr.v4.runtime.*;

public class RequestParserContext {

  private final String request;

  public RequestParserContext(String request) {
	this.request = request;
  }

  public ParserRuleContext parse(CommandChooser commandChooser) {
	RequestGrammarLexer requestGrammarLexer = new RequestGrammarLexer(CharStreams.fromString(request));
	RequestGrammarParser requestGrammarParser = new RequestGrammarParser(new CommonTokenStream(requestGrammarLexer));
	requestGrammarLexer.removeErrorListeners();
	requestGrammarLexer.addErrorListener(new BaseErrorListener() {
	  @Override
	  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
							  int charPositionInLine, String msg, RecognitionException e) {
		throw new MalformedInputRequest(
				"The request doesn't respect the protocol specifications. "
						+ String.format("Unexpected char at pos %s.", charPositionInLine)
		);
	  }
	});
	requestGrammarParser.removeErrorListeners();
	requestGrammarParser.addErrorListener(new BaseErrorListener() {
	  @Override
	  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
							  int charPositionInLine, String msg, RecognitionException e) {
		throw new MalformedInputRequest(
				"The request doesn't respect the protocol specifications. "
						+ String.format("Unexpected char at pos %s.", charPositionInLine)
		);
	  }
	});
	return commandChooser.choose(requestGrammarParser);
  }
}
