// Generated from ruby.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESCAPED_QUOTE=1, LITERAL=2, COMMA=3, SEMICOLON=4, CRLF=5, REQUIRE=6, END=7, 
		DEF=8, RETURN=9, IF=10, THEN=11, ELSE=12, ELSIF=13, UNLESS=14, WHILE=15, 
		RETRY=16, BREAK=17, FOR=18, CASE=19, WHEN=20, TRUE=21, FALSE=22, PLUS=23, 
		MINUS=24, MUL=25, DIV=26, MOD=27, EXP=28, EQUAL=29, NOT_EQUAL=30, GREATER=31, 
		LESS=32, LESS_EQUAL=33, GREATER_EQUAL=34, ASSIGN=35, PLUS_ASSIGN=36, MINUS_ASSIGN=37, 
		MUL_ASSIGN=38, DIV_ASSIGN=39, MOD_ASSIGN=40, EXP_ASSIGN=41, BIT_AND=42, 
		BIT_OR=43, BIT_XOR=44, BIT_NOT=45, BIT_SHL=46, BIT_SHR=47, AND=48, OR=49, 
		NOT=50, LEFT_RBRACKET=51, RIGHT_RBRACKET=52, LEFT_SBRACKET=53, RIGHT_SBRACKET=54, 
		NIL=55, SL_COMMENT=56, ML_COMMENT=57, WS=58, INT=59, FLOAT=60, ID=61, 
		ID_GLOBAL=62, ID_FUNCTION=63;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", 
		"DEF", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
		"BREAK", "FOR", "CASE", "WHEN", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
		"DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
		"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
		"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
		"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
		"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\\"'", null, "','", "';'", "'\n'", "'require'", "'end'", "'def'", 
		"'return'", "'if'", "'then'", "'else'", "'elsif'", "'unless'", "'while'", 
		"'retry'", "'break'", "'for'", "'case'", "'when'", "'true'", "'false'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'!='", "'>'", "'<'", 
		"'<='", "'>='", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", 
		"'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", null, null, null, "'('", "')'", 
		"'['", "']'", "'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", 
		"END", "DEF", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", 
		"RETRY", "BREAK", "FOR", "CASE", "WHEN", "TRUE", "FALSE", "PLUS", "MINUS", 
		"MUL", "DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
		"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
		"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
		"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
		"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public rubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u019e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b"+
		"\13\3\3\3\3\3\3\3\3\3\7\3\u0091\n\3\f\3\16\3\u0094\13\3\3\3\5\3\u0097"+
		"\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u0140\n\61\3\62\3\62\3\62\3\62\5\62\u0146"+
		"\n\62\3\63\3\63\3\63\3\63\5\63\u014c\n\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\38\38\39\39\79\u015c\n9\f9\169\u015f\139\39\39\39\39"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\7:\u016d\n:\f:\16:\u0170\13:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3;\6;\u017b\n;\r;\16;\u017c\3;\3;\3<\6<\u0182\n<\r<\16<\u0183"+
		"\3=\7=\u0187\n=\f=\16=\u018a\13=\3=\3=\6=\u018e\n=\r=\16=\u018f\3>\3>"+
		"\7>\u0194\n>\f>\16>\u0197\13>\3?\3?\3?\3@\3@\3@\5\u0089\u0092\u016e\2"+
		"A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\3\2\b\4\2\f\f\17\17\4\2\13\13\"\"\3\2\62;\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2##AA\u01ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3"+
		"\u0081\3\2\2\2\5\u0096\3\2\2\2\7\u0098\3\2\2\2\t\u009a\3\2\2\2\13\u009c"+
		"\3\2\2\2\r\u009e\3\2\2\2\17\u00a6\3\2\2\2\21\u00aa\3\2\2\2\23\u00ae\3"+
		"\2\2\2\25\u00b5\3\2\2\2\27\u00b8\3\2\2\2\31\u00bd\3\2\2\2\33\u00c2\3\2"+
		"\2\2\35\u00c8\3\2\2\2\37\u00cf\3\2\2\2!\u00d5\3\2\2\2#\u00db\3\2\2\2%"+
		"\u00e1\3\2\2\2\'\u00e5\3\2\2\2)\u00ea\3\2\2\2+\u00ef\3\2\2\2-\u00f4\3"+
		"\2\2\2/\u00fa\3\2\2\2\61\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0100\3\2\2"+
		"\2\67\u0102\3\2\2\29\u0104\3\2\2\2;\u0107\3\2\2\2=\u010a\3\2\2\2?\u010d"+
		"\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E\u0114\3\2\2\2G\u0117\3\2\2\2I"+
		"\u0119\3\2\2\2K\u011c\3\2\2\2M\u011f\3\2\2\2O\u0122\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0128\3\2\2\2U\u012c\3\2\2\2W\u012e\3\2\2\2Y\u0130\3\2\2\2[\u0132"+
		"\3\2\2\2]\u0134\3\2\2\2_\u0137\3\2\2\2a\u013f\3\2\2\2c\u0145\3\2\2\2e"+
		"\u014b\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2\2\2k\u0151\3\2\2\2m\u0153\3\2"+
		"\2\2o\u0155\3\2\2\2q\u0159\3\2\2\2s\u0164\3\2\2\2u\u017a\3\2\2\2w\u0181"+
		"\3\2\2\2y\u0188\3\2\2\2{\u0191\3\2\2\2}\u0198\3\2\2\2\177\u019b\3\2\2"+
		"\2\u0081\u0082\7^\2\2\u0082\u0083\7$\2\2\u0083\4\3\2\2\2\u0084\u0089\7"+
		"$\2\2\u0085\u0088\5\3\2\2\u0086\u0088\n\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0097\7$\2\2\u008d"+
		"\u0092\7)\2\2\u008e\u0091\5\3\2\2\u008f\u0091\n\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7)"+
		"\2\2\u0096\u0084\3\2\2\2\u0096\u008d\3\2\2\2\u0097\6\3\2\2\2\u0098\u0099"+
		"\7.\2\2\u0099\b\3\2\2\2\u009a\u009b\7=\2\2\u009b\n\3\2\2\2\u009c\u009d"+
		"\7\f\2\2\u009d\f\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7s\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad\22\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7p\2\2"+
		"\u00b4\24\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7h\2\2\u00b7\26\3\2\2"+
		"\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4"+
		"\7n\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7h\2\2\u00c7"+
		"\34\3\2\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7u\2\2\u00ce\36\3\2\2\2\u00cf"+
		"\u00d0\7y\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4 \3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2"+
		"\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7{\2\2\u00da\"\3"+
		"\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7c\2\2\u00df\u00e0\7m\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9(\3\2\2\2\u00ea"+
		"\u00eb\7y\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2"+
		"\u00ee*\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7w\2"+
		"\2\u00f2\u00f3\7g\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7"+
		"c\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9."+
		"\3\2\2\2\u00fa\u00fb\7-\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7/\2\2\u00fd"+
		"\62\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff\64\3\2\2\2\u0100\u0101\7\61\2\2\u0101"+
		"\66\3\2\2\2\u0102\u0103\7\'\2\2\u01038\3\2\2\2\u0104\u0105\7,\2\2\u0105"+
		"\u0106\7,\2\2\u0106:\3\2\2\2\u0107\u0108\7?\2\2\u0108\u0109\7?\2\2\u0109"+
		"<\3\2\2\2\u010a\u010b\7#\2\2\u010b\u010c\7?\2\2\u010c>\3\2\2\2\u010d\u010e"+
		"\7@\2\2\u010e@\3\2\2\2\u010f\u0110\7>\2\2\u0110B\3\2\2\2\u0111\u0112\7"+
		">\2\2\u0112\u0113\7?\2\2\u0113D\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116"+
		"\7?\2\2\u0116F\3\2\2\2\u0117\u0118\7?\2\2\u0118H\3\2\2\2\u0119\u011a\7"+
		"-\2\2\u011a\u011b\7?\2\2\u011bJ\3\2\2\2\u011c\u011d\7/\2\2\u011d\u011e"+
		"\7?\2\2\u011eL\3\2\2\2\u011f\u0120\7,\2\2\u0120\u0121\7?\2\2\u0121N\3"+
		"\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7?\2\2\u0124P\3\2\2\2\u0125\u0126"+
		"\7\'\2\2\u0126\u0127\7?\2\2\u0127R\3\2\2\2\u0128\u0129\7,\2\2\u0129\u012a"+
		"\7,\2\2\u012a\u012b\7?\2\2\u012bT\3\2\2\2\u012c\u012d\7(\2\2\u012dV\3"+
		"\2\2\2\u012e\u012f\7~\2\2\u012fX\3\2\2\2\u0130\u0131\7`\2\2\u0131Z\3\2"+
		"\2\2\u0132\u0133\7\u0080\2\2\u0133\\\3\2\2\2\u0134\u0135\7>\2\2\u0135"+
		"\u0136\7>\2\2\u0136^\3\2\2\2\u0137\u0138\7@\2\2\u0138\u0139\7@\2\2\u0139"+
		"`\3\2\2\2\u013a\u013b\7c\2\2\u013b\u013c\7p\2\2\u013c\u0140\7f\2\2\u013d"+
		"\u013e\7(\2\2\u013e\u0140\7(\2\2\u013f\u013a\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u0140b\3\2\2\2\u0141\u0142\7q\2\2\u0142\u0146\7t\2\2\u0143\u0144\7"+
		"~\2\2\u0144\u0146\7~\2\2\u0145\u0141\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"d\3\2\2\2\u0147\u0148\7p\2\2\u0148\u0149\7q\2\2\u0149\u014c\7v\2\2\u014a"+
		"\u014c\7#\2\2\u014b\u0147\3\2\2\2\u014b\u014a\3\2\2\2\u014cf\3\2\2\2\u014d"+
		"\u014e\7*\2\2\u014eh\3\2\2\2\u014f\u0150\7+\2\2\u0150j\3\2\2\2\u0151\u0152"+
		"\7]\2\2\u0152l\3\2\2\2\u0153\u0154\7_\2\2\u0154n\3\2\2\2\u0155\u0156\7"+
		"p\2\2\u0156\u0157\7k\2\2\u0157\u0158\7n\2\2\u0158p\3\2\2\2\u0159\u015d"+
		"\7%\2\2\u015a\u015c\n\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\7\f\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b9\2\2\u0163"+
		"r\3\2\2\2\u0164\u0165\7?\2\2\u0165\u0166\7d\2\2\u0166\u0167\7g\2\2\u0167"+
		"\u0168\7i\2\2\u0168\u0169\7k\2\2\u0169\u016a\7p\2\2\u016a\u016e\3\2\2"+
		"\2\u016b\u016d\13\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\7?\2\2\u0172\u0173\7g\2\2\u0173\u0174\7p\2\2\u0174\u0175"+
		"\7f\2\2\u0175\u0176\7\f\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b:\2\2\u0178"+
		"t\3\2\2\2\u0179\u017b\t\3\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\b;\2\2\u017fv\3\2\2\2\u0180\u0182\t\4\2\2\u0181\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184x\3\2\2\2\u0185"+
		"\u0187\t\4\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018d\7\60\2\2\u018c\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3"+
		"\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190z\3\2\2\2\u0191\u0195"+
		"\t\5\2\2\u0192\u0194\t\6\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196|\3\2\2\2\u0197\u0195\3\2\2\2"+
		"\u0198\u0199\7&\2\2\u0199\u019a\5{>\2\u019a~\3\2\2\2\u019b\u019c\5{>\2"+
		"\u019c\u019d\t\7\2\2\u019d\u0080\3\2\2\2\22\2\u0087\u0089\u0090\u0092"+
		"\u0096\u013f\u0145\u014b\u015d\u016e\u017c\u0183\u0188\u018f\u0195\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}