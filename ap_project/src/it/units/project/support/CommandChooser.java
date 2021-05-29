package it.units.project.support;

import it.units.project.support.antlr.grammar.RequestGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;

@FunctionalInterface
public interface CommandChooser {
  ParserRuleContext choose(RequestGrammarParser parser);
}

