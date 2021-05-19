// Generated from /Users/biagiolicari/Documents/ap_project_Licari/ap_project/src/it/units/project/support/antlr/RequestGrammar.g4 by ANTLR 4.9.1
package it.units.project.support.antlr.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RequestGrammarParser extends Parser {
  public static final int
		  T__0 = 1, T__1 = 2, T__2 = 3, BYE = 4, STAT_REQS = 5, STAT_AVG_TIME = 6, STAT_MAX_TIME = 7,
		  GRID = 8, LIST = 9, MIN = 10, MAX = 11, AVG = 12, COUNT = 13, PAR_OPEN = 14, PAR_CLOSE = 15,
		  OP_ADD = 16, OP_MINUS = 17, OP_MUL = 18, OP_DIV = 19, OP_POW = 20, UNDER = 21, SEMI_COLUMN = 22,
		  COLUMN = 23, COMMA = 24, DIGIT = 25, LETTER = 26;
  public static final int
		  RULE_parse = 0, RULE_command = 1, RULE_quitRequest = 2, RULE_statRequest = 3,
		  RULE_statReqsCommand = 4, RULE_statAvgCommand = 5, RULE_statMaxCommand = 6,
		  RULE_computationRequest = 7, RULE_computationType = 8, RULE_valuesType = 9,
		  RULE_variableValuesFunction = 10, RULE_variableValues = 11, RULE_variableLowerValue = 12,
		  RULE_variableStepValue = 13, RULE_variableUpperValue = 14, RULE_javaNumber = 15,
		  RULE_javaNumberExponential = 16, RULE_javaNumberSign = 17, RULE_expressions = 18,
		  RULE_expression = 19, RULE_operator = 20, RULE_variable = 21, RULE_number = 22;
  public static final String[] ruleNames = makeRuleNames();
  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  public static final String _serializedATN =
		  "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00d6\4\2\t\2" +
				  "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
				  "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
				  "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3" +
				  "\2\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\7\3\7" +
				  "\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f" +
				  "\7\fU\n\f\f\f\16\fX\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17" +
				  "\3\17\3\20\3\20\3\21\5\21i\n\21\3\21\6\21l\n\21\r\21\16\21m\3\21\5\21" +
				  "q\n\21\3\21\7\21t\n\21\f\21\16\21w\13\21\3\21\5\21z\n\21\3\21\5\21}\n" +
				  "\21\3\21\6\21\u0080\n\21\r\21\16\21\u0081\3\21\5\21\u0085\n\21\3\21\6" +
				  "\21\u0088\n\21\r\21\16\21\u0089\3\21\5\21\u008d\n\21\3\21\5\21\u0090\n" +
				  "\21\3\21\7\21\u0093\n\21\f\21\16\21\u0096\13\21\3\21\3\21\6\21\u009a\n" +
				  "\21\r\21\16\21\u009b\3\21\5\21\u009f\n\21\5\21\u00a1\n\21\3\22\3\22\5" +
				  "\22\u00a5\n\22\3\22\6\22\u00a8\n\22\r\22\16\22\u00a9\3\23\3\23\3\24\3" +
				  "\24\3\24\7\24\u00b1\n\24\f\24\16\24\u00b4\13\24\3\25\3\25\3\25\3\25\3" +
				  "\25\3\25\3\25\3\25\5\25\u00be\n\25\3\26\3\26\3\27\3\27\7\27\u00c4\n\27" +
				  "\f\27\16\27\u00c7\13\27\3\30\6\30\u00ca\n\30\r\30\16\30\u00cb\3\30\3\30" +
				  "\6\30\u00d0\n\30\r\30\16\30\u00d1\5\30\u00d4\n\30\3\30\2\2\31\2\4\6\b" +
				  "\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\b\3\2\f\17\3\2\n\13\3\2\4\5" +
				  "\3\2\22\23\3\2\22\26\3\2\33\34\2\u00dc\2\60\3\2\2\2\4\66\3\2\2\2\68\3" +
				  "\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22M\3" +
				  "\2\2\2\24O\3\2\2\2\26Q\3\2\2\2\30Y\3\2\2\2\32a\3\2\2\2\34c\3\2\2\2\36" +
				  "e\3\2\2\2 \u00a0\3\2\2\2\"\u00a2\3\2\2\2$\u00ab\3\2\2\2&\u00ad\3\2\2\2" +
				  "(\u00bd\3\2\2\2*\u00bf\3\2\2\2,\u00c1\3\2\2\2.\u00c9\3\2\2\2\60\61\5\4" +
				  "\3\2\61\62\7\2\2\3\62\3\3\2\2\2\63\67\5\6\4\2\64\67\5\b\5\2\65\67\5\20" +
				  "\t\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\7\6\2\2" +
				  "9\7\3\2\2\2:>\5\n\6\2;>\5\f\7\2<>\5\16\b\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2" +
				  "\2>\t\3\2\2\2?@\7\7\2\2@\13\3\2\2\2AB\7\b\2\2B\r\3\2\2\2CD\7\t\2\2D\17" +
				  "\3\2\2\2EF\5\22\n\2FG\7\27\2\2GH\5\24\13\2HI\7\30\2\2IJ\5\26\f\2JK\7\30" +
				  "\2\2KL\5&\24\2L\21\3\2\2\2MN\t\2\2\2N\23\3\2\2\2OP\t\3\2\2P\25\3\2\2\2" +
				  "QV\5\30\r\2RS\7\32\2\2SU\5\30\r\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2" +
				  "\2\2W\27\3\2\2\2XV\3\2\2\2YZ\5,\27\2Z[\7\31\2\2[\\\5\32\16\2\\]\7\31\2" +
				  "\2]^\5\34\17\2^_\7\31\2\2_`\5\36\20\2`\31\3\2\2\2ab\5 \21\2b\33\3\2\2" +
				  "\2cd\5 \21\2d\35\3\2\2\2ef\5 \21\2f\37\3\2\2\2gi\5$\23\2hg\3\2\2\2hi\3" +
				  "\2\2\2ik\3\2\2\2jl\7\33\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np" +
				  "\3\2\2\2oq\7\3\2\2po\3\2\2\2pq\3\2\2\2qu\3\2\2\2rt\7\33\2\2sr\3\2\2\2" +
				  "tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\5\"\22\2yx\3\2\2" +
				  "\2yz\3\2\2\2z\u00a1\3\2\2\2{}\5$\23\2|{\3\2\2\2|}\3\2\2\2}\u0084\3\2\2" +
				  "\2~\u0080\7\33\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2" +
				  "\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\3\2\2\u0084\177" +
				  "\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\7\33\2\2" +
				  "\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a" +
				  "\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\"\22\2\u008c\u008b\3\2\2\2" +
				  "\u008c\u008d\3\2\2\2\u008d\u00a1\3\2\2\2\u008e\u0090\5$\23\2\u008f\u008e" +
				  "\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2\2\2\u0091\u0093\7\33\2\2" +
				  "\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095" +
				  "\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7\3\2\2\u0098" +
				  "\u009a\7\33\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3" +
				  "\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5\"\22\2\u009e" +
				  "\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0h\3\2\2\2" +
				  "\u00a0|\3\2\2\2\u00a0\u008f\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a4\t\4\2\2" +
				  "\u00a3\u00a5\5$\23\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7" +
				  "\3\2\2\2\u00a6\u00a8\7\33\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2" +
				  "\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa#\3\2\2\2\u00ab\u00ac\t" +
				  "\5\2\2\u00ac%\3\2\2\2\u00ad\u00b2\5(\25\2\u00ae\u00af\7\30\2\2\u00af\u00b1" +
				  "\5(\25\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2" +
				  "\u00b3\3\2\2\2\u00b3\'\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00be\5,\27\2" +
				  "\u00b6\u00be\5.\30\2\u00b7\u00b8\7\20\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba" +
				  "\5*\26\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\7\21\2\2\u00bc\u00be\3\2\2\2" +
				  "\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be)\3" +
				  "\2\2\2\u00bf\u00c0\t\6\2\2\u00c0+\3\2\2\2\u00c1\u00c5\7\34\2\2\u00c2\u00c4" +
				  "\t\7\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5" +
				  "\u00c6\3\2\2\2\u00c6-\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\33\2\2" +
				  "\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc" +
				  "\3\2\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00cf\7\3\2\2\u00ce\u00d0\7\33\2\2" +
				  "\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2" +
				  "\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4" +
				  "/\3\2\2\2\34\66=Vhmpuy|\u0081\u0084\u0089\u008c\u008f\u0094\u009b\u009e" +
				  "\u00a0\u00a4\u00a9\u00b2\u00bd\u00c5\u00cb\u00d1\u00d3";
  public static final ATN _ATN =
		  new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
		  new PredictionContextCache();
  private static final String[] _LITERAL_NAMES = makeLiteralNames();
  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  static {
	RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION);
  }

  static {
	tokenNames = new String[_SYMBOLIC_NAMES.length];
	for (int i = 0; i < tokenNames.length; i++) {
	  tokenNames[i] = VOCABULARY.getLiteralName(i);
	  if (tokenNames[i] == null) {
		tokenNames[i] = VOCABULARY.getSymbolicName(i);
	  }

	  if (tokenNames[i] == null) {
		tokenNames[i] = "<INVALID>";
	  }
	}
  }

  static {
	_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
	  _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
	}
  }

  public RequestGrammarParser(TokenStream input) {
	super(input);
	_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  private static String[] makeRuleNames() {
	return new String[]{
			"parse", "command", "quitRequest", "statRequest", "statReqsCommand",
			"statAvgCommand", "statMaxCommand", "computationRequest", "computationType",
			"valuesType", "variableValuesFunction", "variableValues", "variableLowerValue",
			"variableStepValue", "variableUpperValue", "javaNumber", "javaNumberExponential",
			"javaNumberSign", "expressions", "expression", "operator", "variable",
			"number"
	};
  }

  private static String[] makeLiteralNames() {
	return new String[]{
			null, "'.'", "'e'", "'E'", null, null, null, null, null, null, null,
			null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'", "'_'",
			"';'", "':'", "','"
	};
  }

  private static String[] makeSymbolicNames() {
	return new String[]{
			null, null, null, null, "BYE", "STAT_REQS", "STAT_AVG_TIME", "STAT_MAX_TIME",
			"GRID", "LIST", "MIN", "MAX", "AVG", "COUNT", "PAR_OPEN", "PAR_CLOSE",
			"OP_ADD", "OP_MINUS", "OP_MUL", "OP_DIV", "OP_POW", "UNDER", "SEMI_COLUMN",
			"COLUMN", "COMMA", "DIGIT", "LETTER"
	};
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
	return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
	return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
	return "RequestGrammar.g4";
  }

  @Override
  public String[] getRuleNames() {
	return ruleNames;
  }

  @Override
  public String getSerializedATN() {
	return _serializedATN;
  }

  @Override
  public ATN getATN() {
	return _ATN;
  }

  public final ParseContext parse() throws RecognitionException {
	ParseContext _localctx = new ParseContext(_ctx, getState());
	enterRule(_localctx, 0, RULE_parse);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(46);
		command();
		setState(47);
		match(EOF);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final CommandContext command() throws RecognitionException {
	CommandContext _localctx = new CommandContext(_ctx, getState());
	enterRule(_localctx, 2, RULE_command);
	try {
	  setState(52);
	  _errHandler.sync(this);
	  switch (_input.LA(1)) {
		case BYE:
		  enterOuterAlt(_localctx, 1);
		{
		  setState(49);
		  quitRequest();
		}
		break;
		case STAT_REQS:
		case STAT_AVG_TIME:
		case STAT_MAX_TIME:
		  enterOuterAlt(_localctx, 2);
		{
		  setState(50);
		  statRequest();
		}
		break;
		case MIN:
		case MAX:
		case AVG:
		case COUNT:
		  enterOuterAlt(_localctx, 3);
		{
		  setState(51);
		  computationRequest();
		}
		break;
		default:
		  throw new NoViableAltException(this);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final QuitRequestContext quitRequest() throws RecognitionException {
	QuitRequestContext _localctx = new QuitRequestContext(_ctx, getState());
	enterRule(_localctx, 4, RULE_quitRequest);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(54);
		match(BYE);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final StatRequestContext statRequest() throws RecognitionException {
	StatRequestContext _localctx = new StatRequestContext(_ctx, getState());
	enterRule(_localctx, 6, RULE_statRequest);
	try {
	  setState(59);
	  _errHandler.sync(this);
	  switch (_input.LA(1)) {
		case STAT_REQS:
		  enterOuterAlt(_localctx, 1);
		{
		  setState(56);
		  statReqsCommand();
		}
		break;
		case STAT_AVG_TIME:
		  enterOuterAlt(_localctx, 2);
		{
		  setState(57);
		  statAvgCommand();
		}
		break;
		case STAT_MAX_TIME:
		  enterOuterAlt(_localctx, 3);
		{
		  setState(58);
		  statMaxCommand();
		}
		break;
		default:
		  throw new NoViableAltException(this);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final StatReqsCommandContext statReqsCommand() throws RecognitionException {
	StatReqsCommandContext _localctx = new StatReqsCommandContext(_ctx, getState());
	enterRule(_localctx, 8, RULE_statReqsCommand);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(61);
		match(STAT_REQS);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final StatAvgCommandContext statAvgCommand() throws RecognitionException {
	StatAvgCommandContext _localctx = new StatAvgCommandContext(_ctx, getState());
	enterRule(_localctx, 10, RULE_statAvgCommand);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(63);
		match(STAT_AVG_TIME);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final StatMaxCommandContext statMaxCommand() throws RecognitionException {
	StatMaxCommandContext _localctx = new StatMaxCommandContext(_ctx, getState());
	enterRule(_localctx, 12, RULE_statMaxCommand);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(65);
		match(STAT_MAX_TIME);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final ComputationRequestContext computationRequest() throws RecognitionException {
	ComputationRequestContext _localctx = new ComputationRequestContext(_ctx, getState());
	enterRule(_localctx, 14, RULE_computationRequest);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(67);
		computationType();
		setState(68);
		match(UNDER);
		setState(69);
		valuesType();
		setState(70);
		match(SEMI_COLUMN);
		setState(71);
		variableValuesFunction();
		setState(72);
		match(SEMI_COLUMN);
		setState(73);
		expressions();
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final ComputationTypeContext computationType() throws RecognitionException {
	ComputationTypeContext _localctx = new ComputationTypeContext(_ctx, getState());
	enterRule(_localctx, 16, RULE_computationType);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(75);
		_la = _input.LA(1);
		if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MIN) | (1L << MAX) | (1L << AVG) | (1L << COUNT))) != 0))) {
		  _errHandler.recoverInline(this);
		} else {
		  if (_input.LA(1) == Token.EOF) matchedEOF = true;
		  _errHandler.reportMatch(this);
		  consume();
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final ValuesTypeContext valuesType() throws RecognitionException {
	ValuesTypeContext _localctx = new ValuesTypeContext(_ctx, getState());
	enterRule(_localctx, 18, RULE_valuesType);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(77);
		_la = _input.LA(1);
		if (!(_la == GRID || _la == LIST)) {
		  _errHandler.recoverInline(this);
		} else {
		  if (_input.LA(1) == Token.EOF) matchedEOF = true;
		  _errHandler.reportMatch(this);
		  consume();
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final VariableValuesFunctionContext variableValuesFunction() throws RecognitionException {
	VariableValuesFunctionContext _localctx = new VariableValuesFunctionContext(_ctx, getState());
	enterRule(_localctx, 20, RULE_variableValuesFunction);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(79);
		variableValues();
		setState(84);
		_errHandler.sync(this);
		_la = _input.LA(1);
		while (_la == COMMA) {
		  {
			{
			  setState(80);
			  match(COMMA);
			  setState(81);
			  variableValues();
			}
		  }
		  setState(86);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final VariableValuesContext variableValues() throws RecognitionException {
	VariableValuesContext _localctx = new VariableValuesContext(_ctx, getState());
	enterRule(_localctx, 22, RULE_variableValues);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(87);
		variable();
		setState(88);
		match(COLUMN);
		setState(89);
		variableLowerValue();
		setState(90);
		match(COLUMN);
		setState(91);
		variableStepValue();
		setState(92);
		match(COLUMN);
		setState(93);
		variableUpperValue();
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final VariableLowerValueContext variableLowerValue() throws RecognitionException {
	VariableLowerValueContext _localctx = new VariableLowerValueContext(_ctx, getState());
	enterRule(_localctx, 24, RULE_variableLowerValue);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(95);
		javaNumber();
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final VariableStepValueContext variableStepValue() throws RecognitionException {
	VariableStepValueContext _localctx = new VariableStepValueContext(_ctx, getState());
	enterRule(_localctx, 26, RULE_variableStepValue);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(97);
		javaNumber();
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final VariableUpperValueContext variableUpperValue() throws RecognitionException {
	VariableUpperValueContext _localctx = new VariableUpperValueContext(_ctx, getState());
	enterRule(_localctx, 28, RULE_variableUpperValue);
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(99);
		javaNumber();
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final JavaNumberContext javaNumber() throws RecognitionException {
	JavaNumberContext _localctx = new JavaNumberContext(_ctx, getState());
	enterRule(_localctx, 30, RULE_javaNumber);
	int _la;
	try {
	  int _alt;
	  setState(158);
	  _errHandler.sync(this);
	  switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
		case 1:
		  enterOuterAlt(_localctx, 1);
		{
		  setState(102);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == OP_ADD || _la == OP_MINUS) {
			{
			  setState(101);
			  javaNumberSign();
			}
		  }

		  setState(105);
		  _errHandler.sync(this);
		  _alt = 1;
		  do {
			switch (_alt) {
			  case 1: {
				{
				  setState(104);
				  match(DIGIT);
				}
			  }
			  break;
			  default:
				throw new NoViableAltException(this);
			}
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
		  } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
		  setState(110);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == T__0) {
			{
			  setState(109);
			  match(T__0);
			}
		  }

		  setState(115);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  while (_la == DIGIT) {
			{
			  {
				setState(112);
				match(DIGIT);
			  }
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
		  }
		  setState(119);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == T__1 || _la == T__2) {
			{
			  setState(118);
			  javaNumberExponential();
			}
		  }

		}
		break;
		case 2:
		  enterOuterAlt(_localctx, 2);
		{
		  setState(122);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == OP_ADD || _la == OP_MINUS) {
			{
			  setState(121);
			  javaNumberSign();
			}
		  }

		  setState(130);
		  _errHandler.sync(this);
		  switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
			case 1: {
			  setState(125);
			  _errHandler.sync(this);
			  _la = _input.LA(1);
			  do {
				{
				  {
					setState(124);
					match(DIGIT);
				  }
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			  } while (_la == DIGIT);
			  setState(129);
			  match(T__0);
			}
			break;
		  }
		  setState(133);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  do {
			{
			  {
				setState(132);
				match(DIGIT);
			  }
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
		  } while (_la == DIGIT);
		  setState(138);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == T__1 || _la == T__2) {
			{
			  setState(137);
			  javaNumberExponential();
			}
		  }

		}
		break;
		case 3:
		  enterOuterAlt(_localctx, 3);
		{
		  setState(141);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == OP_ADD || _la == OP_MINUS) {
			{
			  setState(140);
			  javaNumberSign();
			}
		  }

		  setState(146);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  while (_la == DIGIT) {
			{
			  {
				setState(143);
				match(DIGIT);
			  }
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
		  }
		  setState(149);
		  match(T__0);
		  setState(151);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  do {
			{
			  {
				setState(150);
				match(DIGIT);
			  }
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
		  } while (_la == DIGIT);
		  setState(156);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		  if (_la == T__1 || _la == T__2) {
			{
			  setState(155);
			  javaNumberExponential();
			}
		  }

		}
		break;
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final JavaNumberExponentialContext javaNumberExponential() throws RecognitionException {
	JavaNumberExponentialContext _localctx = new JavaNumberExponentialContext(_ctx, getState());
	enterRule(_localctx, 32, RULE_javaNumberExponential);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(160);
		_la = _input.LA(1);
		if (!(_la == T__1 || _la == T__2)) {
		  _errHandler.recoverInline(this);
		} else {
		  if (_input.LA(1) == Token.EOF) matchedEOF = true;
		  _errHandler.reportMatch(this);
		  consume();
		}
		setState(162);
		_errHandler.sync(this);
		_la = _input.LA(1);
		if (_la == OP_ADD || _la == OP_MINUS) {
		  {
			setState(161);
			javaNumberSign();
		  }
		}

		setState(165);
		_errHandler.sync(this);
		_la = _input.LA(1);
		do {
		  {
			{
			  setState(164);
			  match(DIGIT);
			}
		  }
		  setState(167);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		} while (_la == DIGIT);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final JavaNumberSignContext javaNumberSign() throws RecognitionException {
	JavaNumberSignContext _localctx = new JavaNumberSignContext(_ctx, getState());
	enterRule(_localctx, 34, RULE_javaNumberSign);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(169);
		_la = _input.LA(1);
		if (!(_la == OP_ADD || _la == OP_MINUS)) {
		  _errHandler.recoverInline(this);
		} else {
		  if (_input.LA(1) == Token.EOF) matchedEOF = true;
		  _errHandler.reportMatch(this);
		  consume();
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final ExpressionsContext expressions() throws RecognitionException {
	ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
	enterRule(_localctx, 36, RULE_expressions);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(171);
		expression();
		setState(176);
		_errHandler.sync(this);
		_la = _input.LA(1);
		while (_la == SEMI_COLUMN) {
		  {
			{
			  setState(172);
			  match(SEMI_COLUMN);
			  setState(173);
			  expression();
			}
		  }
		  setState(178);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final ExpressionContext expression() throws RecognitionException {
	ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
	enterRule(_localctx, 38, RULE_expression);
	try {
	  setState(187);
	  _errHandler.sync(this);
	  switch (_input.LA(1)) {
		case LETTER:
		  enterOuterAlt(_localctx, 1);
		{
		  setState(179);
		  variable();
		}
		break;
		case DIGIT:
		  enterOuterAlt(_localctx, 2);
		{
		  setState(180);
		  number();
		}
		break;
		case PAR_OPEN:
		  enterOuterAlt(_localctx, 3);
		{
		  setState(181);
		  match(PAR_OPEN);
		  setState(182);
		  expression();
		  setState(183);
		  operator();
		  setState(184);
		  expression();
		  setState(185);
		  match(PAR_CLOSE);
		}
		break;
		default:
		  throw new NoViableAltException(this);
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final OperatorContext operator() throws RecognitionException {
	OperatorContext _localctx = new OperatorContext(_ctx, getState());
	enterRule(_localctx, 40, RULE_operator);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(189);
		_la = _input.LA(1);
		if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_MINUS) | (1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_POW))) != 0))) {
		  _errHandler.recoverInline(this);
		} else {
		  if (_input.LA(1) == Token.EOF) matchedEOF = true;
		  _errHandler.reportMatch(this);
		  consume();
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final VariableContext variable() throws RecognitionException {
	VariableContext _localctx = new VariableContext(_ctx, getState());
	enterRule(_localctx, 42, RULE_variable);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(191);
		match(LETTER);
		setState(195);
		_errHandler.sync(this);
		_la = _input.LA(1);
		while (_la == DIGIT || _la == LETTER) {
		  {
			{
			  setState(192);
			  _la = _input.LA(1);
			  if (!(_la == DIGIT || _la == LETTER)) {
				_errHandler.recoverInline(this);
			  } else {
				if (_input.LA(1) == Token.EOF) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			  }
			}
		  }
		  setState(197);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		}
	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public final NumberContext number() throws RecognitionException {
	NumberContext _localctx = new NumberContext(_ctx, getState());
	enterRule(_localctx, 44, RULE_number);
	int _la;
	try {
	  enterOuterAlt(_localctx, 1);
	  {
		setState(199);
		_errHandler.sync(this);
		_la = _input.LA(1);
		do {
		  {
			{
			  setState(198);
			  match(DIGIT);
			}
		  }
		  setState(201);
		  _errHandler.sync(this);
		  _la = _input.LA(1);
		} while (_la == DIGIT);
		setState(209);
		_errHandler.sync(this);
		_la = _input.LA(1);
		if (_la == T__0) {
		  {
			setState(203);
			match(T__0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
			  {
				{
				  setState(204);
				  match(DIGIT);
				}
			  }
			  setState(207);
			  _errHandler.sync(this);
			  _la = _input.LA(1);
			} while (_la == DIGIT);
		  }
		}

	  }
	} catch (RecognitionException re) {
	  _localctx.exception = re;
	  _errHandler.reportError(this, re);
	  _errHandler.recover(this, re);
	} finally {
	  exitRule();
	}
	return _localctx;
  }

  public static class ParseContext extends ParserRuleContext {
	public ParseContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public CommandContext command() {
	  return getRuleContext(CommandContext.class, 0);
	}

	public TerminalNode EOF() {
	  return getToken(RequestGrammarParser.EOF, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_parse;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterParse(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitParse(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitParse(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class CommandContext extends ParserRuleContext {
	public CommandContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public QuitRequestContext quitRequest() {
	  return getRuleContext(QuitRequestContext.class, 0);
	}

	public StatRequestContext statRequest() {
	  return getRuleContext(StatRequestContext.class, 0);
	}

	public ComputationRequestContext computationRequest() {
	  return getRuleContext(ComputationRequestContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_command;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterCommand(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitCommand(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitCommand(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class QuitRequestContext extends ParserRuleContext {
	public QuitRequestContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode BYE() {
	  return getToken(RequestGrammarParser.BYE, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_quitRequest;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterQuitRequest(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitQuitRequest(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitQuitRequest(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class StatRequestContext extends ParserRuleContext {
	public StatRequestContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public StatReqsCommandContext statReqsCommand() {
	  return getRuleContext(StatReqsCommandContext.class, 0);
	}

	public StatAvgCommandContext statAvgCommand() {
	  return getRuleContext(StatAvgCommandContext.class, 0);
	}

	public StatMaxCommandContext statMaxCommand() {
	  return getRuleContext(StatMaxCommandContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_statRequest;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterStatRequest(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitStatRequest(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitStatRequest(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class StatReqsCommandContext extends ParserRuleContext {
	public StatReqsCommandContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode STAT_REQS() {
	  return getToken(RequestGrammarParser.STAT_REQS, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_statReqsCommand;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterStatReqsCommand(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitStatReqsCommand(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitStatReqsCommand(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class StatAvgCommandContext extends ParserRuleContext {
	public StatAvgCommandContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode STAT_AVG_TIME() {
	  return getToken(RequestGrammarParser.STAT_AVG_TIME, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_statAvgCommand;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterStatAvgCommand(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitStatAvgCommand(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitStatAvgCommand(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class StatMaxCommandContext extends ParserRuleContext {
	public StatMaxCommandContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode STAT_MAX_TIME() {
	  return getToken(RequestGrammarParser.STAT_MAX_TIME, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_statMaxCommand;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterStatMaxCommand(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitStatMaxCommand(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitStatMaxCommand(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class ComputationRequestContext extends ParserRuleContext {
	public ComputationRequestContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public ComputationTypeContext computationType() {
	  return getRuleContext(ComputationTypeContext.class, 0);
	}

	public TerminalNode UNDER() {
	  return getToken(RequestGrammarParser.UNDER, 0);
	}

	public ValuesTypeContext valuesType() {
	  return getRuleContext(ValuesTypeContext.class, 0);
	}

	public List<TerminalNode> SEMI_COLUMN() {
	  return getTokens(RequestGrammarParser.SEMI_COLUMN);
	}

	public TerminalNode SEMI_COLUMN(int i) {
	  return getToken(RequestGrammarParser.SEMI_COLUMN, i);
	}

	public VariableValuesFunctionContext variableValuesFunction() {
	  return getRuleContext(VariableValuesFunctionContext.class, 0);
	}

	public ExpressionsContext expressions() {
	  return getRuleContext(ExpressionsContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_computationRequest;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterComputationRequest(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitComputationRequest(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitComputationRequest(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class ComputationTypeContext extends ParserRuleContext {
	public ComputationTypeContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode MIN() {
	  return getToken(RequestGrammarParser.MIN, 0);
	}

	public TerminalNode MAX() {
	  return getToken(RequestGrammarParser.MAX, 0);
	}

	public TerminalNode AVG() {
	  return getToken(RequestGrammarParser.AVG, 0);
	}

	public TerminalNode COUNT() {
	  return getToken(RequestGrammarParser.COUNT, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_computationType;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterComputationType(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitComputationType(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitComputationType(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class ValuesTypeContext extends ParserRuleContext {
	public ValuesTypeContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode GRID() {
	  return getToken(RequestGrammarParser.GRID, 0);
	}

	public TerminalNode LIST() {
	  return getToken(RequestGrammarParser.LIST, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_valuesType;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterValuesType(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitValuesType(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitValuesType(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class VariableValuesFunctionContext extends ParserRuleContext {
	public VariableValuesFunctionContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public List<VariableValuesContext> variableValues() {
	  return getRuleContexts(VariableValuesContext.class);
	}

	public VariableValuesContext variableValues(int i) {
	  return getRuleContext(VariableValuesContext.class, i);
	}

	public List<TerminalNode> COMMA() {
	  return getTokens(RequestGrammarParser.COMMA);
	}

	public TerminalNode COMMA(int i) {
	  return getToken(RequestGrammarParser.COMMA, i);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_variableValuesFunction;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener)
		((RequestGrammarListener) listener).enterVariableValuesFunction(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener)
		((RequestGrammarListener) listener).exitVariableValuesFunction(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitVariableValuesFunction(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class VariableValuesContext extends ParserRuleContext {
	public VariableValuesContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public VariableContext variable() {
	  return getRuleContext(VariableContext.class, 0);
	}

	public List<TerminalNode> COLUMN() {
	  return getTokens(RequestGrammarParser.COLUMN);
	}

	public TerminalNode COLUMN(int i) {
	  return getToken(RequestGrammarParser.COLUMN, i);
	}

	public VariableLowerValueContext variableLowerValue() {
	  return getRuleContext(VariableLowerValueContext.class, 0);
	}

	public VariableStepValueContext variableStepValue() {
	  return getRuleContext(VariableStepValueContext.class, 0);
	}

	public VariableUpperValueContext variableUpperValue() {
	  return getRuleContext(VariableUpperValueContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_variableValues;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterVariableValues(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitVariableValues(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitVariableValues(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class VariableLowerValueContext extends ParserRuleContext {
	public VariableLowerValueContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public JavaNumberContext javaNumber() {
	  return getRuleContext(JavaNumberContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_variableLowerValue;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterVariableLowerValue(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitVariableLowerValue(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitVariableLowerValue(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class VariableStepValueContext extends ParserRuleContext {
	public VariableStepValueContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public JavaNumberContext javaNumber() {
	  return getRuleContext(JavaNumberContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_variableStepValue;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterVariableStepValue(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitVariableStepValue(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitVariableStepValue(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class VariableUpperValueContext extends ParserRuleContext {
	public VariableUpperValueContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public JavaNumberContext javaNumber() {
	  return getRuleContext(JavaNumberContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_variableUpperValue;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterVariableUpperValue(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitVariableUpperValue(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitVariableUpperValue(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class JavaNumberContext extends ParserRuleContext {
	public JavaNumberContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public JavaNumberSignContext javaNumberSign() {
	  return getRuleContext(JavaNumberSignContext.class, 0);
	}

	public List<TerminalNode> DIGIT() {
	  return getTokens(RequestGrammarParser.DIGIT);
	}

	public TerminalNode DIGIT(int i) {
	  return getToken(RequestGrammarParser.DIGIT, i);
	}

	public JavaNumberExponentialContext javaNumberExponential() {
	  return getRuleContext(JavaNumberExponentialContext.class, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_javaNumber;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterJavaNumber(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitJavaNumber(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitJavaNumber(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class JavaNumberExponentialContext extends ParserRuleContext {
	public JavaNumberExponentialContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public JavaNumberSignContext javaNumberSign() {
	  return getRuleContext(JavaNumberSignContext.class, 0);
	}

	public List<TerminalNode> DIGIT() {
	  return getTokens(RequestGrammarParser.DIGIT);
	}

	public TerminalNode DIGIT(int i) {
	  return getToken(RequestGrammarParser.DIGIT, i);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_javaNumberExponential;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener)
		((RequestGrammarListener) listener).enterJavaNumberExponential(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener)
		((RequestGrammarListener) listener).exitJavaNumberExponential(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitJavaNumberExponential(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class JavaNumberSignContext extends ParserRuleContext {
	public JavaNumberSignContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode OP_MINUS() {
	  return getToken(RequestGrammarParser.OP_MINUS, 0);
	}

	public TerminalNode OP_ADD() {
	  return getToken(RequestGrammarParser.OP_ADD, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_javaNumberSign;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterJavaNumberSign(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitJavaNumberSign(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitJavaNumberSign(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class ExpressionsContext extends ParserRuleContext {
	public ExpressionsContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public List<ExpressionContext> expression() {
	  return getRuleContexts(ExpressionContext.class);
	}

	public ExpressionContext expression(int i) {
	  return getRuleContext(ExpressionContext.class, i);
	}

	public List<TerminalNode> SEMI_COLUMN() {
	  return getTokens(RequestGrammarParser.SEMI_COLUMN);
	}

	public TerminalNode SEMI_COLUMN(int i) {
	  return getToken(RequestGrammarParser.SEMI_COLUMN, i);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_expressions;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterExpressions(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitExpressions(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitExpressions(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class ExpressionContext extends ParserRuleContext {
	public ExpressionContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public VariableContext variable() {
	  return getRuleContext(VariableContext.class, 0);
	}

	public NumberContext number() {
	  return getRuleContext(NumberContext.class, 0);
	}

	public TerminalNode PAR_OPEN() {
	  return getToken(RequestGrammarParser.PAR_OPEN, 0);
	}

	public List<ExpressionContext> expression() {
	  return getRuleContexts(ExpressionContext.class);
	}

	public ExpressionContext expression(int i) {
	  return getRuleContext(ExpressionContext.class, i);
	}

	public OperatorContext operator() {
	  return getRuleContext(OperatorContext.class, 0);
	}

	public TerminalNode PAR_CLOSE() {
	  return getToken(RequestGrammarParser.PAR_CLOSE, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_expression;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterExpression(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitExpression(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitExpression(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class OperatorContext extends ParserRuleContext {
	public OperatorContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public TerminalNode OP_ADD() {
	  return getToken(RequestGrammarParser.OP_ADD, 0);
	}

	public TerminalNode OP_MINUS() {
	  return getToken(RequestGrammarParser.OP_MINUS, 0);
	}

	public TerminalNode OP_MUL() {
	  return getToken(RequestGrammarParser.OP_MUL, 0);
	}

	public TerminalNode OP_DIV() {
	  return getToken(RequestGrammarParser.OP_DIV, 0);
	}

	public TerminalNode OP_POW() {
	  return getToken(RequestGrammarParser.OP_POW, 0);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_operator;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterOperator(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitOperator(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitOperator(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class VariableContext extends ParserRuleContext {
	public VariableContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public List<TerminalNode> LETTER() {
	  return getTokens(RequestGrammarParser.LETTER);
	}

	public TerminalNode LETTER(int i) {
	  return getToken(RequestGrammarParser.LETTER, i);
	}

	public List<TerminalNode> DIGIT() {
	  return getTokens(RequestGrammarParser.DIGIT);
	}

	public TerminalNode DIGIT(int i) {
	  return getToken(RequestGrammarParser.DIGIT, i);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_variable;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterVariable(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitVariable(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitVariable(this);
	  else return visitor.visitChildren(this);
	}
  }

  public static class NumberContext extends ParserRuleContext {
	public NumberContext(ParserRuleContext parent, int invokingState) {
	  super(parent, invokingState);
	}

	public List<TerminalNode> DIGIT() {
	  return getTokens(RequestGrammarParser.DIGIT);
	}

	public TerminalNode DIGIT(int i) {
	  return getToken(RequestGrammarParser.DIGIT, i);
	}

	@Override
	public int getRuleIndex() {
	  return RULE_number;
	}

	@Override
	public void enterRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).enterNumber(this);
	}

	@Override
	public void exitRule(ParseTreeListener listener) {
	  if (listener instanceof RequestGrammarListener) ((RequestGrammarListener) listener).exitNumber(this);
	}

	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
	  if (visitor instanceof RequestGrammarVisitor)
		return ((RequestGrammarVisitor<? extends T>) visitor).visitNumber(this);
	  else return visitor.visitChildren(this);
	}
  }
}