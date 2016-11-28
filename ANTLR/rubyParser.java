// Generated from ruby.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rubyParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_require_block = 3, 
		RULE_function_definition = 4, RULE_function_definition_body = 5, RULE_function_definition_header = 6, 
		RULE_function_name = 7, RULE_function_definition_params = 8, RULE_function_definition_params_list = 9, 
		RULE_return_statement = 10, RULE_function_call = 11, RULE_function_call_param_list = 12, 
		RULE_function_call_params = 13, RULE_if_elsif_statement = 14, RULE_if_statement = 15, 
		RULE_unless_statement = 16, RULE_while_statement = 17, RULE_while_expression_list = 18, 
		RULE_for_statement = 19, RULE_for_expression_list = 20, RULE_case_statement = 21, 
		RULE_content_case = 22, RULE_when_list = 23, RULE_rvalue_list = 24, RULE_assignment = 25, 
		RULE_array_assignment = 26, RULE_array_definition = 27, RULE_array_definition_elements = 28, 
		RULE_array_selector = 29, RULE_int_result = 30, RULE_float_result = 31, 
		RULE_string_result = 32, RULE_lvalue = 33, RULE_rvalue = 34, RULE_literal_t = 35, 
		RULE_float_t = 36, RULE_int_t = 37, RULE_bool_t = 38, RULE_nil_t = 39, 
		RULE_id = 40, RULE_id_global = 41, RULE_id_function = 42, RULE_terminator = 43, 
		RULE_crlf = 44;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "require_block", "function_definition", 
		"function_definition_body", "function_definition_header", "function_name", 
		"function_definition_params", "function_definition_params_list", "return_statement", 
		"function_call", "function_call_param_list", "function_call_params", "if_elsif_statement", 
		"if_statement", "unless_statement", "while_statement", "while_expression_list", 
		"for_statement", "for_expression_list", "case_statement", "content_case", 
		"when_list", "rvalue_list", "assignment", "array_assignment", "array_definition", 
		"array_definition_elements", "array_selector", "int_result", "float_result", 
		"string_result", "lvalue", "rvalue", "literal_t", "float_t", "int_t", 
		"bool_t", "nil_t", "id", "id_global", "id_function", "terminator", "crlf"
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

	@Override
	public String getGrammarFileName() { return "ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			expression();
			setState(94);
			terminator(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(96);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(97);
					expression();
					setState(98);
					terminator(0);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				function_definition();
				}
				break;
			case REQUIRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				require_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				if_statement();
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				unless_statement();
				}
				break;
			case LITERAL:
			case CASE:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				rvalue(0);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				return_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				for_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(rubyParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterRequire_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitRequire_block(this);
		}
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(REQUIRE);
			setState(116);
			literal_t();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			function_definition_header();
			setState(119);
			function_definition_body();
			setState(120);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_definition_body(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(rubyParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_definition_header(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_definition_header);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(DEF);
				setState(125);
				function_name();
				setState(126);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(DEF);
				setState(129);
				function_name();
				setState(130);
				function_definition_params();
				setState(131);
				crlf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_name);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_definition_params(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_definition_params);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(LEFT_RBRACKET);
				setState(140);
				function_definition_params_list(0);
				setState(141);
				match(RIGHT_RBRACKET);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				function_definition_params_list(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_definition_params_list(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			id();
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					match(COMMA);
					setState(151);
					id();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(rubyParser.RETURN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(RETURN);
			setState(158);
			rvalue(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				function_name();
				setState(161);
				match(LEFT_RBRACKET);
				setState(162);
				function_call_param_list();
				setState(163);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				function_name();
				setState(166);
				function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				function_name();
				setState(169);
				match(LEFT_RBRACKET);
				setState(170);
				match(RIGHT_RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_call_param_list(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			function_call_params(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_paramsContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFunction_call_params(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			rvalue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(180);
					match(COMMA);
					setState(181);
					rvalue(0);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(rubyParser.ELSIF, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(rubyParser.ELSE, 0); }
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitIf_elsif_statement(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_elsif_statement);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ELSIF);
				setState(188);
				rvalue(0);
				setState(189);
				crlf();
				setState(190);
				expression_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(ELSIF);
				setState(193);
				rvalue(0);
				setState(194);
				crlf();
				setState(195);
				expression_list(0);
				setState(196);
				match(ELSE);
				setState(197);
				crlf();
				setState(198);
				expression_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(ELSIF);
				setState(201);
				rvalue(0);
				setState(202);
				crlf();
				setState(203);
				expression_list(0);
				setState(204);
				if_elsif_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(rubyParser.IF, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public TerminalNode THEN() { return getToken(rubyParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(rubyParser.ELSE, 0); }
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(IF);
				setState(209);
				rvalue(0);
				setState(210);
				crlf();
				setState(211);
				expression_list(0);
				setState(212);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(IF);
				setState(215);
				rvalue(0);
				setState(216);
				match(THEN);
				setState(217);
				expression_list(0);
				setState(218);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(IF);
				setState(221);
				rvalue(0);
				setState(222);
				crlf();
				setState(223);
				expression_list(0);
				setState(224);
				match(ELSE);
				setState(225);
				crlf();
				setState(226);
				expression_list(0);
				setState(227);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(IF);
				setState(230);
				rvalue(0);
				setState(231);
				match(THEN);
				setState(232);
				expression_list(0);
				setState(233);
				match(ELSE);
				setState(234);
				expression_list(0);
				setState(235);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(IF);
				setState(238);
				rvalue(0);
				setState(239);
				crlf();
				setState(240);
				expression_list(0);
				setState(241);
				if_elsif_statement();
				setState(242);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(rubyParser.UNLESS, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitUnless_statement(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unless_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(UNLESS);
			setState(247);
			rvalue(0);
			setState(248);
			crlf();
			setState(249);
			expression_list(0);
			setState(250);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(rubyParser.WHILE, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public While_expression_listContext while_expression_list() {
			return getRuleContext(While_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(WHILE);
			setState(253);
			rvalue(0);
			setState(254);
			crlf();
			setState(255);
			while_expression_list(0);
			setState(256);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(rubyParser.RETRY, 0); }
		public TerminalNode BREAK() { return getToken(rubyParser.BREAK, 0); }
		public While_expression_listContext while_expression_list() {
			return getRuleContext(While_expression_listContext.class,0);
		}
		public While_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterWhile_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitWhile_expression_list(this);
		}
	}

	public final While_expression_listContext while_expression_list() throws RecognitionException {
		return while_expression_list(0);
	}

	private While_expression_listContext while_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		While_expression_listContext _localctx = new While_expression_listContext(_ctx, _parentState);
		While_expression_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_while_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case CASE:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(259);
				expression();
				setState(260);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(262);
				match(RETRY);
				setState(263);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(264);
				match(BREAK);
				setState(265);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(268);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(269);
						expression();
						setState(270);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(273);
						match(RETRY);
						setState(274);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(275);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(276);
						match(BREAK);
						setState(277);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(rubyParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(rubyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(rubyParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public For_expression_listContext for_expression_list() {
			return getRuleContext(For_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_statement);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(FOR);
				setState(284);
				match(LEFT_RBRACKET);
				setState(285);
				expression();
				setState(286);
				match(SEMICOLON);
				setState(287);
				expression();
				setState(288);
				match(SEMICOLON);
				setState(289);
				expression();
				setState(290);
				match(RIGHT_RBRACKET);
				setState(291);
				crlf();
				setState(292);
				for_expression_list(0);
				setState(293);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(FOR);
				setState(296);
				expression();
				setState(297);
				match(SEMICOLON);
				setState(298);
				expression();
				setState(299);
				match(SEMICOLON);
				setState(300);
				expression();
				setState(301);
				crlf();
				setState(302);
				for_expression_list(0);
				setState(303);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(rubyParser.RETRY, 0); }
		public TerminalNode BREAK() { return getToken(rubyParser.BREAK, 0); }
		public For_expression_listContext for_expression_list() {
			return getRuleContext(For_expression_listContext.class,0);
		}
		public For_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFor_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFor_expression_list(this);
		}
	}

	public final For_expression_listContext for_expression_list() throws RecognitionException {
		return for_expression_list(0);
	}

	private For_expression_listContext for_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_expression_listContext _localctx = new For_expression_listContext(_ctx, _parentState);
		For_expression_listContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_for_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case CASE:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(308);
				expression();
				setState(309);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(311);
				match(RETRY);
				setState(312);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(313);
				match(BREAK);
				setState(314);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						expression();
						setState(319);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(RETRY);
						setState(323);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						match(BREAK);
						setState(326);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(rubyParser.CASE, 0); }
		public Content_caseContext content_case() {
			return getRuleContext(Content_caseContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitCase_statement(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(CASE);
			setState(333);
			content_case();
			setState(334);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Content_caseContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public When_listContext when_list() {
			return getRuleContext(When_listContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(rubyParser.ELSE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Content_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterContent_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitContent_case(this);
		}
	}

	public final Content_caseContext content_case() throws RecognitionException {
		Content_caseContext _localctx = new Content_caseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_content_case);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				lvalue();
				setState(337);
				when_list();
				setState(338);
				match(ELSE);
				setState(339);
				expression_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				lvalue();
				setState(342);
				when_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_listContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(rubyParser.WHEN, 0); }
		public Rvalue_listContext rvalue_list() {
			return getRuleContext(Rvalue_listContext.class,0);
		}
		public TerminalNode THEN() { return getToken(rubyParser.THEN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public When_listContext when_list() {
			return getRuleContext(When_listContext.class,0);
		}
		public When_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterWhen_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitWhen_list(this);
		}
	}

	public final When_listContext when_list() throws RecognitionException {
		When_listContext _localctx = new When_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_when_list);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(WHEN);
				setState(347);
				rvalue_list();
				setState(348);
				match(THEN);
				setState(349);
				expression_list(0);
				setState(350);
				when_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(WHEN);
				setState(353);
				rvalue_list();
				setState(354);
				match(THEN);
				setState(355);
				expression_list(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rvalue_listContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public Rvalue_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterRvalue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitRvalue_list(this);
		}
	}

	public final Rvalue_listContext rvalue_list() throws RecognitionException {
		Rvalue_listContext _localctx = new Rvalue_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rvalue_list);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				rvalue(0);
				setState(360);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				rvalue(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(rubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(rubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(rubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(rubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(rubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(rubyParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				lvalue();
				setState(366);
				match(ASSIGN);
				setState(367);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				lvalue();
				setState(370);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(371);
				rvalue(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_assignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitArray_assignment(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_assignment);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				lvalue();
				setState(376);
				array_definition();
				setState(377);
				match(ASSIGN);
				setState(378);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				lvalue();
				setState(381);
				match(ASSIGN);
				setState(382);
				array_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(rubyParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(rubyParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitArray_definition(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_definition);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(LEFT_SBRACKET);
				setState(387);
				array_definition_elements(0);
				setState(388);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(LEFT_SBRACKET);
				setState(391);
				match(RIGHT_SBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitArray_definition_elements(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(395);
			rvalue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(397);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(398);
					match(COMMA);
					setState(399);
					rvalue(0);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Array_selectorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(rubyParser.LEFT_SBRACKET, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(rubyParser.RIGHT_SBRACKET, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitArray_selector(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_selector);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				id();
				setState(406);
				match(LEFT_SBRACKET);
				setState(407);
				rvalue(0);
				setState(408);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				id_global();
				setState(411);
				match(LEFT_SBRACKET);
				setState(412);
				rvalue(0);
				setState(413);
				match(RIGHT_SBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				function_call();
				setState(416);
				match(LEFT_SBRACKET);
				setState(417);
				rvalue(0);
				setState(418);
				match(RIGHT_SBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_resultContext extends ParserRuleContext {
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitInt_result(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(423);
			int_t();
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(425);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(426);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(427);
						int_result(4);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(428);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(429);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(430);
						int_result(3);
						}
						break;
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Float_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFloat_result(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(437);
				int_result(0);
				setState(438);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(439);
				float_result(6);
				}
				break;
			case 2:
				{
				setState(441);
				int_result(0);
				setState(442);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(443);
				float_result(3);
				}
				break;
			case 3:
				{
				setState(445);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(448);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(449);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(450);
						float_result(8);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(451);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(452);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(453);
						float_result(5);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(454);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(455);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(456);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(457);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(458);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitString_result(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(465);
				int_result(0);
				setState(466);
				match(MUL);
				setState(467);
				string_result(2);
				}
				break;
			case LITERAL:
				{
				setState(469);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_resultContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_result);
					setState(472);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(473);
					match(MUL);
					setState(474);
					int_result(0);
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lvalue);
		try {
			setState(482);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				id();
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				id_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(rubyParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(rubyParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public TerminalNode EXP() { return getToken(rubyParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(rubyParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(rubyParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(rubyParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(rubyParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(rubyParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(rubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(rubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(rubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(rubyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(rubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(rubyParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(rubyParser.OR, 0); }
		public TerminalNode AND() { return getToken(rubyParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(485);
				lvalue();
				}
				break;
			case 2:
				{
				setState(486);
				array_assignment();
				}
				break;
			case 3:
				{
				setState(487);
				int_result(0);
				}
				break;
			case 4:
				{
				setState(488);
				float_result(0);
				}
				break;
			case 5:
				{
				setState(489);
				string_result(0);
				}
				break;
			case 6:
				{
				setState(490);
				assignment();
				}
				break;
			case 7:
				{
				setState(491);
				function_call();
				}
				break;
			case 8:
				{
				setState(492);
				literal_t();
				}
				break;
			case 9:
				{
				setState(493);
				bool_t();
				}
				break;
			case 10:
				{
				setState(494);
				float_t();
				}
				break;
			case 11:
				{
				setState(495);
				int_t();
				}
				break;
			case 12:
				{
				setState(496);
				nil_t();
				}
				break;
			case 13:
				{
				setState(497);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(498);
				rvalue(11);
				}
				break;
			case 14:
				{
				setState(499);
				match(LEFT_RBRACKET);
				setState(500);
				rvalue(0);
				setState(501);
				match(RIGHT_RBRACKET);
				}
				break;
			case 15:
				{
				setState(503);
				case_statement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(506);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(507);
						match(EXP);
						setState(508);
						rvalue(13);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(509);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(510);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(511);
						rvalue(11);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(512);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(513);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(514);
						rvalue(10);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(515);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(516);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(517);
						rvalue(9);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(518);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(519);
						match(BIT_AND);
						setState(520);
						rvalue(8);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(521);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(522);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(523);
						rvalue(7);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(524);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(525);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(526);
						rvalue(6);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(527);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(528);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(529);
						rvalue(5);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(530);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(531);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(532);
						rvalue(4);
						}
						break;
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(rubyParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitLiteral_t(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(rubyParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitFloat_t(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(rubyParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitInt_t(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(rubyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(rubyParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitBool_t(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(rubyParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitNil_t(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(NIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(rubyParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(rubyParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterId_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitId_global(this);
		}
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(ID_GLOBAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID_FUNCTION() { return getToken(rubyParser.ID_FUNCTION, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterId_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitId_function(this);
		}
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(ID_FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(rubyParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(555);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(556);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(563);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(559);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(560);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(561);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(562);
						crlf();
						}
						break;
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(rubyParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rubyListener ) ((rubyListener)listener).exitCrlf(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(CRLF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 9:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 13:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 18:
			return while_expression_list_sempred((While_expression_listContext)_localctx, predIndex);
		case 20:
			return for_expression_list_sempred((For_expression_listContext)_localctx, predIndex);
		case 28:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 30:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 31:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 32:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 34:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 43:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean while_expression_list_sempred(While_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_expression_list_sempred(For_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 12);
		case 18:
			return precpred(_ctx, 10);
		case 19:
			return precpred(_ctx, 9);
		case 20:
			return precpred(_ctx, 8);
		case 21:
			return precpred(_ctx, 7);
		case 22:
			return precpred(_ctx, 6);
		case 23:
			return precpred(_ctx, 5);
		case 24:
			return precpred(_ctx, 4);
		case 25:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 4);
		case 27:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u023d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3g\n\3\f\3"+
		"\16\3j\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0088\n\b\3"+
		"\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010d\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0119\n\24\f\24"+
		"\16\24\u011c\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0134"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013e\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014a\n\26\f\26\16\26\u014d"+
		"\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u015b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0168\n\31\3\32\3\32\3\32\3\32\5\32\u016e\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0178\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0183\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u018b\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0193\n\36\f\36\16\36\u0196\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\5\37\u01a7\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01b2\n \f \16"+
		" \u01b5\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01c1\n!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\7!\u01ce\n!\f!\16!\u01d1\13!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u01d9\n\"\3\"\3\"\3\"\7\"\u01de\n\"\f\"\16\"\u01e1\13\"\3#\3#\5#"+
		"\u01e5\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\5$\u01fb\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0218\n$\f$\16$\u021b\13$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\5-\u0230\n-\3-\3-\3-\3-\7"+
		"-\u0236\n-\f-\16-\u0239\13-\3.\3.\3.\2\r\4\24\34&*:>@BFX/\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\f"+
		"\3\2&+\3\2\33\35\3\2\31\32\4\2//\64\64\3\2\60\61\3\2-.\3\2!$\3\2\37 \3"+
		"\2\62\63\3\2\27\30\u025d\2\\\3\2\2\2\4^\3\2\2\2\6s\3\2\2\2\bu\3\2\2\2"+
		"\nx\3\2\2\2\f|\3\2\2\2\16\u0087\3\2\2\2\20\u008b\3\2\2\2\22\u0092\3\2"+
		"\2\2\24\u0094\3\2\2\2\26\u009f\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0\3\2\2"+
		"\2\34\u00b2\3\2\2\2\36\u00d0\3\2\2\2 \u00f6\3\2\2\2\"\u00f8\3\2\2\2$\u00fe"+
		"\3\2\2\2&\u010c\3\2\2\2(\u0133\3\2\2\2*\u013d\3\2\2\2,\u014e\3\2\2\2."+
		"\u015a\3\2\2\2\60\u0167\3\2\2\2\62\u016d\3\2\2\2\64\u0177\3\2\2\2\66\u0182"+
		"\3\2\2\28\u018a\3\2\2\2:\u018c\3\2\2\2<\u01a6\3\2\2\2>\u01a8\3\2\2\2@"+
		"\u01c0\3\2\2\2B\u01d8\3\2\2\2D\u01e4\3\2\2\2F\u01fa\3\2\2\2H\u021c\3\2"+
		"\2\2J\u021e\3\2\2\2L\u0220\3\2\2\2N\u0222\3\2\2\2P\u0224\3\2\2\2R\u0226"+
		"\3\2\2\2T\u0228\3\2\2\2V\u022a\3\2\2\2X\u022f\3\2\2\2Z\u023a\3\2\2\2\\"+
		"]\5\4\3\2]\3\3\2\2\2^_\b\3\1\2_`\5\6\4\2`a\5X-\2ah\3\2\2\2bc\f\4\2\2c"+
		"d\5\6\4\2de\5X-\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5"+
		"\3\2\2\2jh\3\2\2\2kt\5\n\6\2lt\5\b\5\2mt\5 \21\2nt\5\"\22\2ot\5F$\2pt"+
		"\5\26\f\2qt\5$\23\2rt\5(\25\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2"+
		"so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\7\3\2\2\2uv\7\b\2\2vw\5H%\2"+
		"w\t\3\2\2\2xy\5\16\b\2yz\5\f\7\2z{\7\t\2\2{\13\3\2\2\2|}\5\4\3\2}\r\3"+
		"\2\2\2~\177\7\n\2\2\177\u0080\5\20\t\2\u0080\u0081\5Z.\2\u0081\u0088\3"+
		"\2\2\2\u0082\u0083\7\n\2\2\u0083\u0084\5\20\t\2\u0084\u0085\5\22\n\2\u0085"+
		"\u0086\5Z.\2\u0086\u0088\3\2\2\2\u0087~\3\2\2\2\u0087\u0082\3\2\2\2\u0088"+
		"\17\3\2\2\2\u0089\u008c\5V,\2\u008a\u008c\5R*\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\21\3\2\2\2\u008d\u008e\7\65\2\2\u008e\u008f\5\24"+
		"\13\2\u008f\u0090\7\66\2\2\u0090\u0093\3\2\2\2\u0091\u0093\5\24\13\2\u0092"+
		"\u008d\3\2\2\2\u0092\u0091\3\2\2\2\u0093\23\3\2\2\2\u0094\u0095\b\13\1"+
		"\2\u0095\u0096\5R*\2\u0096\u009c\3\2\2\2\u0097\u0098\f\3\2\2\u0098\u0099"+
		"\7\5\2\2\u0099\u009b\5R*\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c\3\2\2"+
		"\2\u009f\u00a0\7\13\2\2\u00a0\u00a1\5F$\2\u00a1\27\3\2\2\2\u00a2\u00a3"+
		"\5\20\t\2\u00a3\u00a4\7\65\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\7\66"+
		"\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\5\32\16\2\u00a9"+
		"\u00af\3\2\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\7\65\2\2\u00ac\u00ad\7"+
		"\66\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\5\34\17\2\u00b1\33\3\2\2\2"+
		"\u00b2\u00b3\b\17\1\2\u00b3\u00b4\5F$\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6"+
		"\f\3\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b9\5F$\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\35\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5F$\2\u00bf\u00c0"+
		"\5Z.\2\u00c0\u00c1\5\4\3\2\u00c1\u00d1\3\2\2\2\u00c2\u00c3\7\17\2\2\u00c3"+
		"\u00c4\5F$\2\u00c4\u00c5\5Z.\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\7\16\2"+
		"\2\u00c7\u00c8\5Z.\2\u00c8\u00c9\5\4\3\2\u00c9\u00d1\3\2\2\2\u00ca\u00cb"+
		"\7\17\2\2\u00cb\u00cc\5F$\2\u00cc\u00cd\5Z.\2\u00cd\u00ce\5\4\3\2\u00ce"+
		"\u00cf\5\36\20\2\u00cf\u00d1\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0\u00c2\3"+
		"\2\2\2\u00d0\u00ca\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3"+
		"\u00d4\5F$\2\u00d4\u00d5\5Z.\2\u00d5\u00d6\5\4\3\2\u00d6\u00d7\7\t\2\2"+
		"\u00d7\u00f7\3\2\2\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\5F$\2\u00da\u00db"+
		"\7\r\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\7\t\2\2\u00dd\u00f7\3\2\2\2\u00de"+
		"\u00df\7\f\2\2\u00df\u00e0\5F$\2\u00e0\u00e1\5Z.\2\u00e1\u00e2\5\4\3\2"+
		"\u00e2\u00e3\7\16\2\2\u00e3\u00e4\5Z.\2\u00e4\u00e5\5\4\3\2\u00e5\u00e6"+
		"\7\t\2\2\u00e6\u00f7\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\5F$\2\u00e9"+
		"\u00ea\7\r\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7\16\2\2\u00ec\u00ed\5"+
		"\4\3\2\u00ed\u00ee\7\t\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\7\f\2\2\u00f0"+
		"\u00f1\5F$\2\u00f1\u00f2\5Z.\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\5\36\20"+
		"\2\u00f4\u00f5\7\t\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00d2\3\2\2\2\u00f6\u00d8"+
		"\3\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f7"+
		"!\3\2\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\5F$\2\u00fa\u00fb\5Z.\2\u00fb"+
		"\u00fc\5\4\3\2\u00fc\u00fd\7\t\2\2\u00fd#\3\2\2\2\u00fe\u00ff\7\21\2\2"+
		"\u00ff\u0100\5F$\2\u0100\u0101\5Z.\2\u0101\u0102\5&\24\2\u0102\u0103\7"+
		"\t\2\2\u0103%\3\2\2\2\u0104\u0105\b\24\1\2\u0105\u0106\5\6\4\2\u0106\u0107"+
		"\5X-\2\u0107\u010d\3\2\2\2\u0108\u0109\7\22\2\2\u0109\u010d\5X-\2\u010a"+
		"\u010b\7\23\2\2\u010b\u010d\5X-\2\u010c\u0104\3\2\2\2\u010c\u0108\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u011a\3\2\2\2\u010e\u010f\f\5\2\2\u010f"+
		"\u0110\5\6\4\2\u0110\u0111\5X-\2\u0111\u0119\3\2\2\2\u0112\u0113\f\4\2"+
		"\2\u0113\u0114\7\22\2\2\u0114\u0119\5X-\2\u0115\u0116\f\3\2\2\u0116\u0117"+
		"\7\23\2\2\u0117\u0119\5X-\2\u0118\u010e\3\2\2\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\'\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\24\2\2\u011e\u011f"+
		"\7\65\2\2\u011f\u0120\5\6\4\2\u0120\u0121\7\6\2\2\u0121\u0122\5\6\4\2"+
		"\u0122\u0123\7\6\2\2\u0123\u0124\5\6\4\2\u0124\u0125\7\66\2\2\u0125\u0126"+
		"\5Z.\2\u0126\u0127\5*\26\2\u0127\u0128\7\t\2\2\u0128\u0134\3\2\2\2\u0129"+
		"\u012a\7\24\2\2\u012a\u012b\5\6\4\2\u012b\u012c\7\6\2\2\u012c\u012d\5"+
		"\6\4\2\u012d\u012e\7\6\2\2\u012e\u012f\5\6\4\2\u012f\u0130\5Z.\2\u0130"+
		"\u0131\5*\26\2\u0131\u0132\7\t\2\2\u0132\u0134\3\2\2\2\u0133\u011d\3\2"+
		"\2\2\u0133\u0129\3\2\2\2\u0134)\3\2\2\2\u0135\u0136\b\26\1\2\u0136\u0137"+
		"\5\6\4\2\u0137\u0138\5X-\2\u0138\u013e\3\2\2\2\u0139\u013a\7\22\2\2\u013a"+
		"\u013e\5X-\2\u013b\u013c\7\23\2\2\u013c\u013e\5X-\2\u013d\u0135\3\2\2"+
		"\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u014b\3\2\2\2\u013f\u0140"+
		"\f\5\2\2\u0140\u0141\5\6\4\2\u0141\u0142\5X-\2\u0142\u014a\3\2\2\2\u0143"+
		"\u0144\f\4\2\2\u0144\u0145\7\22\2\2\u0145\u014a\5X-\2\u0146\u0147\f\3"+
		"\2\2\u0147\u0148\7\23\2\2\u0148\u014a\5X-\2\u0149\u013f\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c+\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\7\25\2\2\u014f\u0150\5.\30\2\u0150\u0151\7\t\2\2\u0151-\3\2\2\2\u0152"+
		"\u0153\5D#\2\u0153\u0154\5\60\31\2\u0154\u0155\7\16\2\2\u0155\u0156\5"+
		"\4\3\2\u0156\u015b\3\2\2\2\u0157\u0158\5D#\2\u0158\u0159\5\60\31\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0157\3\2\2\2\u015b/\3\2\2\2"+
		"\u015c\u015d\7\26\2\2\u015d\u015e\5\62\32\2\u015e\u015f\7\r\2\2\u015f"+
		"\u0160\5\4\3\2\u0160\u0161\5\60\31\2\u0161\u0168\3\2\2\2\u0162\u0163\7"+
		"\26\2\2\u0163\u0164\5\62\32\2\u0164\u0165\7\r\2\2\u0165\u0166\5\4\3\2"+
		"\u0166\u0168\3\2\2\2\u0167\u015c\3\2\2\2\u0167\u0162\3\2\2\2\u0168\61"+
		"\3\2\2\2\u0169\u016a\5F$\2\u016a\u016b\7\5\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016e\5F$\2\u016d\u0169\3\2\2\2\u016d\u016c\3\2\2\2\u016e\63\3\2\2\2"+
		"\u016f\u0170\5D#\2\u0170\u0171\7%\2\2\u0171\u0172\5F$\2\u0172\u0178\3"+
		"\2\2\2\u0173\u0174\5D#\2\u0174\u0175\t\2\2\2\u0175\u0176\5F$\2\u0176\u0178"+
		"\3\2\2\2\u0177\u016f\3\2\2\2\u0177\u0173\3\2\2\2\u0178\65\3\2\2\2\u0179"+
		"\u017a\5D#\2\u017a\u017b\58\35\2\u017b\u017c\7%\2\2\u017c\u017d\5F$\2"+
		"\u017d\u0183\3\2\2\2\u017e\u017f\5D#\2\u017f\u0180\7%\2\2\u0180\u0181"+
		"\58\35\2\u0181\u0183\3\2\2\2\u0182\u0179\3\2\2\2\u0182\u017e\3\2\2\2\u0183"+
		"\67\3\2\2\2\u0184\u0185\7\67\2\2\u0185\u0186\5:\36\2\u0186\u0187\78\2"+
		"\2\u0187\u018b\3\2\2\2\u0188\u0189\7\67\2\2\u0189\u018b\78\2\2\u018a\u0184"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018b9\3\2\2\2\u018c\u018d\b\36\1\2\u018d"+
		"\u018e\5F$\2\u018e\u0194\3\2\2\2\u018f\u0190\f\3\2\2\u0190\u0191\7\5\2"+
		"\2\u0191\u0193\5F$\2\u0192\u018f\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195;\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\5R*\2\u0198\u0199\7\67\2\2\u0199\u019a\5F$\2\u019a\u019b\78\2\2"+
		"\u019b\u01a7\3\2\2\2\u019c\u019d\5T+\2\u019d\u019e\7\67\2\2\u019e\u019f"+
		"\5F$\2\u019f\u01a0\78\2\2\u01a0\u01a7\3\2\2\2\u01a1\u01a2\5\30\r\2\u01a2"+
		"\u01a3\7\67\2\2\u01a3\u01a4\5F$\2\u01a4\u01a5\78\2\2\u01a5\u01a7\3\2\2"+
		"\2\u01a6\u0197\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a7="+
		"\3\2\2\2\u01a8\u01a9\b \1\2\u01a9\u01aa\5L\'\2\u01aa\u01b3\3\2\2\2\u01ab"+
		"\u01ac\f\5\2\2\u01ac\u01ad\t\3\2\2\u01ad\u01b2\5> \6\u01ae\u01af\f\4\2"+
		"\2\u01af\u01b0\t\4\2\2\u01b0\u01b2\5> \5\u01b1\u01ab\3\2\2\2\u01b1\u01ae"+
		"\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"?\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\b!\1\2\u01b7\u01b8\5> \2\u01b8"+
		"\u01b9\t\3\2\2\u01b9\u01ba\5@!\b\u01ba\u01c1\3\2\2\2\u01bb\u01bc\5> \2"+
		"\u01bc\u01bd\t\4\2\2\u01bd\u01be\5@!\5\u01be\u01c1\3\2\2\2\u01bf\u01c1"+
		"\5J&\2\u01c0\u01b6\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01cf\3\2\2\2\u01c2\u01c3\f\t\2\2\u01c3\u01c4\t\3\2\2\u01c4\u01ce\5@"+
		"!\n\u01c5\u01c6\f\6\2\2\u01c6\u01c7\t\4\2\2\u01c7\u01ce\5@!\7\u01c8\u01c9"+
		"\f\7\2\2\u01c9\u01ca\t\3\2\2\u01ca\u01ce\5> \2\u01cb\u01cc\f\4\2\2\u01cc"+
		"\u01ce\t\4\2\2\u01cd\u01c2\3\2\2\2\u01cd\u01c5\3\2\2\2\u01cd\u01c8\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0A\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\b\"\1\2"+
		"\u01d3\u01d4\5> \2\u01d4\u01d5\7\33\2\2\u01d5\u01d6\5B\"\4\u01d6\u01d9"+
		"\3\2\2\2\u01d7\u01d9\5H%\2\u01d8\u01d2\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01df\3\2\2\2\u01da\u01db\f\5\2\2\u01db\u01dc\7\33\2\2\u01dc\u01de\5"+
		"> \2\u01dd\u01da\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0C\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\5R*\2\u01e3"+
		"\u01e5\5T+\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5E\3\2\2\2\u01e6"+
		"\u01e7\b$\1\2\u01e7\u01fb\5D#\2\u01e8\u01fb\5\66\34\2\u01e9\u01fb\5> "+
		"\2\u01ea\u01fb\5@!\2\u01eb\u01fb\5B\"\2\u01ec\u01fb\5\64\33\2\u01ed\u01fb"+
		"\5\30\r\2\u01ee\u01fb\5H%\2\u01ef\u01fb\5N(\2\u01f0\u01fb\5J&\2\u01f1"+
		"\u01fb\5L\'\2\u01f2\u01fb\5P)\2\u01f3\u01f4\t\5\2\2\u01f4\u01fb\5F$\r"+
		"\u01f5\u01f6\7\65\2\2\u01f6\u01f7\5F$\2\u01f7\u01f8\7\66\2\2\u01f8\u01fb"+
		"\3\2\2\2\u01f9\u01fb\5,\27\2\u01fa\u01e6\3\2\2\2\u01fa\u01e8\3\2\2\2\u01fa"+
		"\u01e9\3\2\2\2\u01fa\u01ea\3\2\2\2\u01fa\u01eb\3\2\2\2\u01fa\u01ec\3\2"+
		"\2\2\u01fa\u01ed\3\2\2\2\u01fa\u01ee\3\2\2\2\u01fa\u01ef\3\2\2\2\u01fa"+
		"\u01f0\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f2\3\2\2\2\u01fa\u01f3\3\2"+
		"\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u0219\3\2\2\2\u01fc"+
		"\u01fd\f\16\2\2\u01fd\u01fe\7\36\2\2\u01fe\u0218\5F$\17\u01ff\u0200\f"+
		"\f\2\2\u0200\u0201\t\3\2\2\u0201\u0218\5F$\r\u0202\u0203\f\13\2\2\u0203"+
		"\u0204\t\4\2\2\u0204\u0218\5F$\f\u0205\u0206\f\n\2\2\u0206\u0207\t\6\2"+
		"\2\u0207\u0218\5F$\13\u0208\u0209\f\t\2\2\u0209\u020a\7,\2\2\u020a\u0218"+
		"\5F$\n\u020b\u020c\f\b\2\2\u020c\u020d\t\7\2\2\u020d\u0218\5F$\t\u020e"+
		"\u020f\f\7\2\2\u020f\u0210\t\b\2\2\u0210\u0218\5F$\b\u0211\u0212\f\6\2"+
		"\2\u0212\u0213\t\t\2\2\u0213\u0218\5F$\7\u0214\u0215\f\5\2\2\u0215\u0216"+
		"\t\n\2\2\u0216\u0218\5F$\6\u0217\u01fc\3\2\2\2\u0217\u01ff\3\2\2\2\u0217"+
		"\u0202\3\2\2\2\u0217\u0205\3\2\2\2\u0217\u0208\3\2\2\2\u0217\u020b\3\2"+
		"\2\2\u0217\u020e\3\2\2\2\u0217\u0211\3\2\2\2\u0217\u0214\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021aG\3\2\2\2"+
		"\u021b\u0219\3\2\2\2\u021c\u021d\7\4\2\2\u021dI\3\2\2\2\u021e\u021f\7"+
		">\2\2\u021fK\3\2\2\2\u0220\u0221\7=\2\2\u0221M\3\2\2\2\u0222\u0223\t\13"+
		"\2\2\u0223O\3\2\2\2\u0224\u0225\79\2\2\u0225Q\3\2\2\2\u0226\u0227\7?\2"+
		"\2\u0227S\3\2\2\2\u0228\u0229\7@\2\2\u0229U\3\2\2\2\u022a\u022b\7A\2\2"+
		"\u022bW\3\2\2\2\u022c\u022d\b-\1\2\u022d\u0230\7\6\2\2\u022e\u0230\5Z"+
		".\2\u022f\u022c\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0237\3\2\2\2\u0231"+
		"\u0232\f\6\2\2\u0232\u0236\7\6\2\2\u0233\u0234\f\5\2\2\u0234\u0236\5Z"+
		".\2\u0235\u0231\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238Y\3\2\2\2\u0239\u0237\3\2\2\2"+
		"\u023a\u023b\7\7\2\2\u023b[\3\2\2\2)hs\u0087\u008b\u0092\u009c\u00ae\u00ba"+
		"\u00d0\u00f6\u010c\u0118\u011a\u0133\u013d\u0149\u014b\u015a\u0167\u016d"+
		"\u0177\u0182\u018a\u0194\u01a6\u01b1\u01b3\u01c0\u01cd\u01cf\u01d8\u01df"+
		"\u01e4\u01fa\u0217\u0219\u022f\u0235\u0237";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}