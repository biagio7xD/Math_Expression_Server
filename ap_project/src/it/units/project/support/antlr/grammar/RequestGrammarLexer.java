// Generated from /Users/biagiolicari/Documents/ap_project_Licari/ap_project/src/it/units/project/support/antlr/RequestGrammar.g4 by ANTLR 4.9.1
package it.units.project.support.antlr.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RequestGrammarLexer extends Lexer {
  public static final int
		  T__0 = 1, T__1 = 2, T__2 = 3, BYE = 4, STAT_REQS = 5, STAT_AVG_TIME = 6, STAT_MAX_TIME = 7,
		  GRID = 8, LIST = 9, MIN = 10, MAX = 11, AVG = 12, COUNT = 13, PAR_OPEN = 14, PAR_CLOSE = 15,
		  OP_ADD = 16, OP_MINUS = 17, OP_MUL = 18, OP_DIV = 19, OP_POW = 20, UNDER = 21, SEMI_COLUMN = 22,
		  COLUMN = 23, COMMA = 24, DIGIT = 25, LETTER = 26;
  public static final String[] ruleNames = makeRuleNames();
  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  public static final String _serializedATN =
		  "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0105\b\1\4\2" +
				  "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
				  "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
				  "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
				  "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
				  " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
				  "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
				  "\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3" +
				  "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
				  "\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
				  "\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f" +
				  "\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20" +
				  "\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27" +
				  "\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36" +
				  "\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3" +
				  ")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62" +
				  "\3\63\3\63\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21" +
				  "\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30" +
				  "/\31\61\32\63\33\65\34\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2" +
				  "U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2\3\2\36\3\2\62;\3\2c|\3\2CC\3\2DD\3\2" +
				  "EE\3\2FF\3\2GG\3\2HH\3\2II\3\2JJ\3\2KK\3\2LL\3\2MM\3\2NN\3\2OO\3\2PP\3" +
				  "\2QQ\3\2RR\3\2SS\3\2TT\3\2UU\3\2VV\3\2WW\3\2XX\3\2YY\3\2ZZ\3\2[[\3\2\\" +
				  "\\\2\u00ea\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
				  "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
				  "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
				  "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
				  "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3k\3\2\2\2\5m\3\2\2" +
				  "\2\7o\3\2\2\2\tq\3\2\2\2\13u\3\2\2\2\r\177\3\2\2\2\17\u008d\3\2\2\2\21" +
				  "\u009b\3\2\2\2\23\u00a0\3\2\2\2\25\u00a5\3\2\2\2\27\u00a9\3\2\2\2\31\u00ad" +
				  "\3\2\2\2\33\u00b1\3\2\2\2\35\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00bb\3\2" +
				  "\2\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c1\3\2\2\2)\u00c3\3\2\2\2+\u00c5" +
				  "\3\2\2\2-\u00c7\3\2\2\2/\u00c9\3\2\2\2\61\u00cb\3\2\2\2\63\u00cd\3\2\2" +
				  "\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2\2=\u00d7" +
				  "\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G" +
				  "\u00e1\3\2\2\2I\u00e3\3\2\2\2K\u00e5\3\2\2\2M\u00e7\3\2\2\2O\u00e9\3\2" +
				  "\2\2Q\u00eb\3\2\2\2S\u00ed\3\2\2\2U\u00ef\3\2\2\2W\u00f1\3\2\2\2Y\u00f3" +
				  "\3\2\2\2[\u00f5\3\2\2\2]\u00f7\3\2\2\2_\u00f9\3\2\2\2a\u00fb\3\2\2\2c" +
				  "\u00fd\3\2\2\2e\u00ff\3\2\2\2g\u0101\3\2\2\2i\u0103\3\2\2\2kl\7\60\2\2" +
				  "l\4\3\2\2\2mn\7g\2\2n\6\3\2\2\2op\7G\2\2p\b\3\2\2\2qr\59\35\2rs\5g\64" +
				  "\2st\5? \2t\n\3\2\2\2uv\5[.\2vw\5]/\2wx\5\67\34\2xy\5]/\2yz\7a\2\2z{\5" +
				  "Y-\2{|\5? \2|}\5W,\2}~\5[.\2~\f\3\2\2\2\177\u0080\5[.\2\u0080\u0081\5" +
				  "]/\2\u0081\u0082\5\67\34\2\u0082\u0083\5]/\2\u0083\u0084\7a\2\2\u0084" +
				  "\u0085\5\67\34\2\u0085\u0086\5a\61\2\u0086\u0087\5C\"\2\u0087\u0088\7" +
				  "a\2\2\u0088\u0089\5]/\2\u0089\u008a\5G$\2\u008a\u008b\5O(\2\u008b\u008c" +
				  "\5? \2\u008c\16\3\2\2\2\u008d\u008e\5[.\2\u008e\u008f\5]/\2\u008f\u0090" +
				  "\5\67\34\2\u0090\u0091\5]/\2\u0091\u0092\7a\2\2\u0092\u0093\5O(\2\u0093" +
				  "\u0094\5\67\34\2\u0094\u0095\5e\63\2\u0095\u0096\7a\2\2\u0096\u0097\5" +
				  "]/\2\u0097\u0098\5G$\2\u0098\u0099\5O(\2\u0099\u009a\5? \2\u009a\20\3" +
				  "\2\2\2\u009b\u009c\5C\"\2\u009c\u009d\5Y-\2\u009d\u009e\5G$\2\u009e\u009f" +
				  "\5=\37\2\u009f\22\3\2\2\2\u00a0\u00a1\5M\'\2\u00a1\u00a2\5G$\2\u00a2\u00a3" +
				  "\5[.\2\u00a3\u00a4\5]/\2\u00a4\24\3\2\2\2\u00a5\u00a6\5O(\2\u00a6\u00a7" +
				  "\5G$\2\u00a7\u00a8\5Q)\2\u00a8\26\3\2\2\2\u00a9\u00aa\5O(\2\u00aa\u00ab" +
				  "\5\67\34\2\u00ab\u00ac\5e\63\2\u00ac\30\3\2\2\2\u00ad\u00ae\5\67\34\2" +
				  "\u00ae\u00af\5a\61\2\u00af\u00b0\5C\"\2\u00b0\32\3\2\2\2\u00b1\u00b2\5" +
				  ";\36\2\u00b2\u00b3\5S*\2\u00b3\u00b4\5_\60\2\u00b4\u00b5\5Q)\2\u00b5\u00b6" +
				  "\5]/\2\u00b6\34\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\36\3\2\2\2\u00b9\u00ba" +
				  "\7+\2\2\u00ba \3\2\2\2\u00bb\u00bc\7-\2\2\u00bc\"\3\2\2\2\u00bd\u00be" +
				  "\7/\2\2\u00be$\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7" +
				  "\61\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7`\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7" +
				  "a\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7<" +
				  "\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc\62\3\2\2\2\u00cd\u00ce" +
				  "\t\2\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0\66\3\2\2\2\u00d1\u00d2" +
				  "\t\4\2\2\u00d28\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4:\3\2\2\2\u00d5\u00d6" +
				  "\t\6\2\2\u00d6<\3\2\2\2\u00d7\u00d8\t\7\2\2\u00d8>\3\2\2\2\u00d9\u00da" +
				  "\t\b\2\2\u00da@\3\2\2\2\u00db\u00dc\t\t\2\2\u00dcB\3\2\2\2\u00dd\u00de" +
				  "\t\n\2\2\u00deD\3\2\2\2\u00df\u00e0\t\13\2\2\u00e0F\3\2\2\2\u00e1\u00e2" +
				  "\t\f\2\2\u00e2H\3\2\2\2\u00e3\u00e4\t\r\2\2\u00e4J\3\2\2\2\u00e5\u00e6" +
				  "\t\16\2\2\u00e6L\3\2\2\2\u00e7\u00e8\t\17\2\2\u00e8N\3\2\2\2\u00e9\u00ea" +
				  "\t\20\2\2\u00eaP\3\2\2\2\u00eb\u00ec\t\21\2\2\u00ecR\3\2\2\2\u00ed\u00ee" +
				  "\t\22\2\2\u00eeT\3\2\2\2\u00ef\u00f0\t\23\2\2\u00f0V\3\2\2\2\u00f1\u00f2" +
				  "\t\24\2\2\u00f2X\3\2\2\2\u00f3\u00f4\t\25\2\2\u00f4Z\3\2\2\2\u00f5\u00f6" +
				  "\t\26\2\2\u00f6\\\3\2\2\2\u00f7\u00f8\t\27\2\2\u00f8^\3\2\2\2\u00f9\u00fa" +
				  "\t\30\2\2\u00fa`\3\2\2\2\u00fb\u00fc\t\31\2\2\u00fcb\3\2\2\2\u00fd\u00fe" +
				  "\t\32\2\2\u00fed\3\2\2\2\u00ff\u0100\t\33\2\2\u0100f\3\2\2\2\u0101\u0102" +
				  "\t\34\2\2\u0102h\3\2\2\2\u0103\u0104\t\35\2\2\u0104j\3\2\2\2\3\2\2";
  public static final ATN _ATN =
		  new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
		  new PredictionContextCache();
  private static final String[] _LITERAL_NAMES = makeLiteralNames();
  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
  public static String[] channelNames = {
		  "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
  };
  public static String[] modeNames = {
		  "DEFAULT_MODE"
  };

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

  public RequestGrammarLexer(CharStream input) {
	super(input);
	_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  private static String[] makeRuleNames() {
	return new String[]{
			"T__0", "T__1", "T__2", "BYE", "STAT_REQS", "STAT_AVG_TIME", "STAT_MAX_TIME",
			"GRID", "LIST", "MIN", "MAX", "AVG", "COUNT", "PAR_OPEN", "PAR_CLOSE",
			"OP_ADD", "OP_MINUS", "OP_MUL", "OP_DIV", "OP_POW", "UNDER", "SEMI_COLUMN",
			"COLUMN", "COMMA", "DIGIT", "LETTER", "A", "B", "C", "D", "E", "F", "G",
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
			"V", "W", "X", "Y", "Z"
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
  public String[] getChannelNames() {
	return channelNames;
  }

  @Override
  public String[] getModeNames() {
	return modeNames;
  }

  @Override
  public ATN getATN() {
	return _ATN;
  }
}