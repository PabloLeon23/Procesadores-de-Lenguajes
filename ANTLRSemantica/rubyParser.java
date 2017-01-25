// Generated from ruby.g4 by ANTLR 4.6

	import java.util.Hashtable;
	import java.lang.Math;
	

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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

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
		RULE_for_statement = 19, RULE_for_expression_list = 20, RULE_when_list = 21, 
		RULE_rvalue_list = 22, RULE_assignment = 23, RULE_array_assignment = 24, 
		RULE_array_definition = 25, RULE_array_definition_elements = 26, RULE_array_selector = 27, 
		RULE_int_result = 28, RULE_float_result = 29, RULE_string_result = 30, 
		RULE_lvalue = 31, RULE_rvalue = 32, RULE_literal_t = 33, RULE_float_t = 34, 
		RULE_int_t = 35, RULE_bool_t = 36, RULE_nil_t = 37, RULE_id = 38, RULE_id_global = 39, 
		RULE_id_function = 40, RULE_terminator = 41, RULE_crlf = 42;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "require_block", "function_definition", 
		"function_definition_body", "function_definition_header", "function_name", 
		"function_definition_params", "function_definition_params_list", "return_statement", 
		"function_call", "function_call_param_list", "function_call_params", "if_elsif_statement", 
		"if_statement", "unless_statement", "while_statement", "while_expression_list", 
		"for_statement", "for_expression_list", "when_list", "rvalue_list", "assignment", 
		"array_assignment", "array_definition", "array_definition_elements", "array_selector", 
		"int_result", "float_result", "string_result", "lvalue", "rvalue", "literal_t", 
		"float_t", "int_t", "bool_t", "nil_t", "id", "id_global", "id_function", 
		"terminator", "crlf"
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


		/*Tabla de variables*/
		Hashtable<String,VarInfo> varTable=new Hashtable<String,VarInfo>();
		
		/*Funciones auxiliares*/
		
		/*Devuelve el valor booleano de un tipo según el funcionamiento de los mismos en ruby*/
		private boolean getBoolean(VarInfo var){
			boolean r=true;
			if(var.getType()==VarInfo.NIL_TYPE) r=false;
			else if(var.getType()==VarInfo.NIL_TYPE) r=(boolean) var.getContent();
			return r;
		}
		
		/*Multiplica un entero por un String y devuelve un objeto VarInfo con el resultado*/
		private VarInfo multString(String s, int n){
			if(n<0)
				return new VarInfo(VarInfo.ERROR, "Un String no se puede multiplicar por un número negativo");
			else{
				String f="";
				for(int i=0;i<n;i++)
					f+=s;
				return new VarInfo(VarInfo.STRING_TYPE,f);
			}
		}
		
		/*Si i1 e i2 son un error, los combina y los devuelve como un error nuevo, si no, devuelve el que era un error*/
		private VarInfo handleError(VarInfo i1, VarInfo i2){
			VarInfo r=null;
			if(i1.getType()==VarInfo.ERROR && i2.getType()==VarInfo.ERROR)
				r= new VarInfo(VarInfo.ERROR, ((String) i1.getContent()) + "; " + ((String) i2.getContent()));
			else if(i1.getType()==VarInfo.ERROR)
				r= i1;
			else
				r= i2;
			return r;
		}
		
		/*Divide un número entre otro y devuelve un objeto VarInfo con el resultado, teniendo en cuenta la posibilidad de error al dividir entre 0*/
		private VarInfo divide(Number i1, Number i2, int resultType){
			if(resultType==VarInfo.FLOAT_TYPE)
				return new VarInfo(resultType, i1.doubleValue()/i2.doubleValue());
			else if(resultType==VarInfo.INT_TYPE){
				if(i2.intValue()==0)
					return new VarInfo(VarInfo.ERROR, "División entre 0 en enteros");
				else
					return new VarInfo(resultType, i1.intValue()/i1.intValue());
			}
			else
				return new VarInfo(VarInfo.ERROR, "Error desconocido");
		}
		/*Aplica la operación módulo entre los números entrantes y devuelve un objeto VarInfo con el resultado, teniendo en cuenta la posibilidad de error al dividir entre 0*/
		private VarInfo module(Number i1, Number i2, int resultType){
			if(i2.doubleValue()!=0){
				if(resultType==VarInfo.FLOAT_TYPE)
					return new VarInfo(resultType, i1.doubleValue()%i2.doubleValue());
				else if(resultType==VarInfo.INT_TYPE){
					return new VarInfo(resultType, i1.intValue()/i1.intValue());
				}
				else
					return new VarInfo(VarInfo.ERROR, "Error desconocido");
			}
			else
				return new VarInfo(VarInfo.ERROR, "División entre 0 en operación módulo");
		}

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
			setState(86);
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
			setState(89);
			expression();
			setState(90);
			terminator(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
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
					setState(92);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(93);
					expression();
					setState(94);
					terminator(0);
					}
					} 
				}
				setState(100);
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
		public RvalueContext rvalue;
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				function_definition();
				}
				break;
			case REQUIRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				require_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				if_statement();
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				unless_statement();
				}
				break;
			case LITERAL:
			case TRUE:
			case FALSE:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				((ExpressionContext)_localctx).rvalue = rvalue(0);
				System.out.println((((ExpressionContext)_localctx).rvalue!=null?_input.getText(((ExpressionContext)_localctx).rvalue.start,((ExpressionContext)_localctx).rvalue.stop):null)+" -> "+((ExpressionContext)_localctx).rvalue.info);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				return_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
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
			setState(113);
			match(REQUIRE);
			setState(114);
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
			setState(116);
			function_definition_header();
			setState(117);
			function_definition_body();
			setState(118);
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
			setState(120);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(DEF);
				setState(123);
				function_name();
				setState(124);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(DEF);
				setState(127);
				function_name();
				setState(128);
				function_definition_params();
				setState(129);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LEFT_RBRACKET);
				setState(138);
				function_definition_params_list(0);
				setState(139);
				match(RIGHT_RBRACKET);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
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
			setState(145);
			id();
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
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
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148);
					match(COMMA);
					setState(149);
					id();
					}
					} 
				}
				setState(154);
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
			setState(155);
			match(RETURN);
			setState(156);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				function_name();
				setState(159);
				match(LEFT_RBRACKET);
				setState(160);
				function_call_param_list();
				setState(161);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				function_name();
				setState(164);
				function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				function_name();
				setState(167);
				match(LEFT_RBRACKET);
				setState(168);
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
			setState(172);
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
			setState(175);
			rvalue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
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
					setState(177);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(178);
					match(COMMA);
					setState(179);
					rvalue(0);
					}
					} 
				}
				setState(184);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ELSIF);
				setState(186);
				rvalue(0);
				setState(187);
				crlf();
				setState(188);
				expression_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ELSIF);
				setState(191);
				rvalue(0);
				setState(192);
				crlf();
				setState(193);
				expression_list(0);
				setState(194);
				match(ELSE);
				setState(195);
				crlf();
				setState(196);
				expression_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(ELSIF);
				setState(199);
				rvalue(0);
				setState(200);
				crlf();
				setState(201);
				expression_list(0);
				setState(202);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(IF);
				setState(207);
				rvalue(0);
				setState(208);
				crlf();
				setState(209);
				expression_list(0);
				setState(210);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(IF);
				setState(213);
				rvalue(0);
				setState(214);
				match(THEN);
				setState(215);
				expression_list(0);
				setState(216);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(IF);
				setState(219);
				rvalue(0);
				setState(220);
				crlf();
				setState(221);
				expression_list(0);
				setState(222);
				match(ELSE);
				setState(223);
				crlf();
				setState(224);
				expression_list(0);
				setState(225);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(IF);
				setState(228);
				rvalue(0);
				setState(229);
				match(THEN);
				setState(230);
				expression_list(0);
				setState(231);
				match(ELSE);
				setState(232);
				expression_list(0);
				setState(233);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(IF);
				setState(236);
				rvalue(0);
				setState(237);
				crlf();
				setState(238);
				expression_list(0);
				setState(239);
				if_elsif_statement();
				setState(240);
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
			setState(244);
			match(UNLESS);
			setState(245);
			rvalue(0);
			setState(246);
			crlf();
			setState(247);
			expression_list(0);
			setState(248);
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
			setState(250);
			match(WHILE);
			setState(251);
			rvalue(0);
			setState(252);
			crlf();
			setState(253);
			while_expression_list(0);
			setState(254);
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
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
				{
				setState(257);
				expression();
				setState(258);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(260);
				match(RETRY);
				setState(261);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(262);
				match(BREAK);
				setState(263);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						expression();
						setState(268);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						match(RETRY);
						setState(272);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(273);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(274);
						match(BREAK);
						setState(275);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(280);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(FOR);
				setState(282);
				match(LEFT_RBRACKET);
				setState(283);
				expression();
				setState(284);
				match(SEMICOLON);
				setState(285);
				expression();
				setState(286);
				match(SEMICOLON);
				setState(287);
				expression();
				setState(288);
				match(RIGHT_RBRACKET);
				setState(289);
				crlf();
				setState(290);
				for_expression_list(0);
				setState(291);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(FOR);
				setState(294);
				expression();
				setState(295);
				match(SEMICOLON);
				setState(296);
				expression();
				setState(297);
				match(SEMICOLON);
				setState(298);
				expression();
				setState(299);
				crlf();
				setState(300);
				for_expression_list(0);
				setState(301);
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
				{
				setState(306);
				expression();
				setState(307);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(309);
				match(RETRY);
				setState(310);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(311);
				match(BREAK);
				setState(312);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(315);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(316);
						expression();
						setState(317);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						match(RETRY);
						setState(321);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(322);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(323);
						match(BREAK);
						setState(324);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(329);
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
		enterRule(_localctx, 42, RULE_when_list);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(WHEN);
				setState(331);
				rvalue_list();
				setState(332);
				match(THEN);
				setState(333);
				expression_list(0);
				setState(334);
				when_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(WHEN);
				setState(337);
				rvalue_list();
				setState(338);
				match(THEN);
				setState(339);
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
		enterRule(_localctx, 44, RULE_rvalue_list);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				rvalue(0);
				setState(344);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
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
		public VarInfo info;
		public LvalueContext lvalue;
		public RvalueContext rvalue;
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
		enterRule(_localctx, 46, RULE_assignment);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((AssignmentContext)_localctx).lvalue = lvalue();
				setState(350);
				match(ASSIGN);
				setState(351);
				((AssignmentContext)_localctx).rvalue = rvalue(0);
				((AssignmentContext)_localctx).info = ((AssignmentContext)_localctx).rvalue.info;varTable.put((((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null), ((AssignmentContext)_localctx).rvalue.info); System.out.println("Asignación a "+(((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null)+" de ("+((AssignmentContext)_localctx).rvalue.info+")");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				((AssignmentContext)_localctx).lvalue = lvalue();
				int operation=0;
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_ASSIGN:
					{
					setState(356);
					match(PLUS_ASSIGN);
					}
					break;
				case MINUS_ASSIGN:
					{
					setState(357);
					match(MINUS_ASSIGN);
					operation=1;
					}
					break;
				case MUL_ASSIGN:
					{
					setState(359);
					match(MUL_ASSIGN);
					operation=2;
					}
					break;
				case DIV_ASSIGN:
					{
					setState(361);
					match(DIV_ASSIGN);
					operation=3;
					}
					break;
				case MOD_ASSIGN:
					{
					setState(363);
					match(MOD_ASSIGN);
					operation=4;
					}
					break;
				case EXP_ASSIGN:
					{
					setState(365);
					match(EXP_ASSIGN);
					operation=5;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(369);
				((AssignmentContext)_localctx).rvalue = rvalue(0);

					if(varTable.containsKey((((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null))){
						VarInfo info2=((AssignmentContext)_localctx).rvalue.info,info1=varTable.get((((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null));
						
						if(info1.getType()==VarInfo.ERROR || info2.getType()==VarInfo.ERROR){
							((AssignmentContext)_localctx).info = handleError(info1,info2);
						}
						else if((info1.getType()==VarInfo.INT_TYPE || info1.getType()==VarInfo.FLOAT_TYPE) && (info2.getType()==VarInfo.INT_TYPE || info2.getType()==VarInfo.FLOAT_TYPE)){
							int resultType=VarInfo.FLOAT_TYPE;
							if(info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.INT_TYPE)
								resultType=VarInfo.INT_TYPE;
							switch(operation){
								case 0:
									if(resultType==VarInfo.INT_TYPE)
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,((int) info1.getContent())+((int) info2.getContent()));
									else
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,((Number) info1.getContent()).doubleValue()+((Number) info2.getContent()).doubleValue());
								break;
								case 1:
									if(resultType==VarInfo.INT_TYPE)
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,((int) info1.getContent())-((int) info2.getContent()));
									else
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,((Number) info1.getContent()).doubleValue()-((Number) info2.getContent()).doubleValue());
								break;
								case 2:
									if(resultType==VarInfo.INT_TYPE)
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,((int) info1.getContent())*((int) info2.getContent()));
									else
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,((Number) info1.getContent()).doubleValue()*((Number) info2.getContent()).doubleValue());
								break;
								case 3:
									((AssignmentContext)_localctx).info = divide((Number) info1.getContent(),(Number) info2.getContent(),resultType);
								break;
								case 4:
									((AssignmentContext)_localctx).info = module((Number) info1.getContent(),(Number) info2.getContent(),resultType);
								break;
								case 5:
									if(resultType==VarInfo.INT_TYPE)
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(int) (Math.pow((int) info1.getContent(),(int) info2.getContent())));
									else
										((AssignmentContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,Math.pow(((Number) info1.getContent()).doubleValue(),((Number) info2.getContent()).doubleValue()));
								break;
							}
						}
						else if((info1.getType()==VarInfo.STRING_TYPE && info2.getType()==VarInfo.STRING_TYPE) && operation==0){
							((AssignmentContext)_localctx).info = new VarInfo(VarInfo.STRING_TYPE,((String) info1.getContent())+((String) info2.getContent()));
						}
						else if(((info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.STRING_TYPE) || (info2.getType()==VarInfo.INT_TYPE && info1.getType()==VarInfo.STRING_TYPE)) && operation==2){
							if(info1.getType()==VarInfo.INT_TYPE)
								((AssignmentContext)_localctx).info = multString((String)info2.getContent(),(int)info1.getContent());
							else
								((AssignmentContext)_localctx).info = multString((String)info1.getContent(),(int)info2.getContent());
						}
						else{
							((AssignmentContext)_localctx).info = new VarInfo(VarInfo.ERROR,"Tipos incompatibles");
						}
					}
					else
						((AssignmentContext)_localctx).info = new VarInfo(VarInfo.ERROR,"Variable utilizada sin inicializar: "+(((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null));
					varTable.put((((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null),_localctx.info);

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
		enterRule(_localctx, 48, RULE_array_assignment);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				lvalue();
				setState(375);
				array_definition();
				setState(376);
				match(ASSIGN);
				setState(377);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				lvalue();
				setState(380);
				match(ASSIGN);
				setState(381);
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
		enterRule(_localctx, 50, RULE_array_definition);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(LEFT_SBRACKET);
				setState(386);
				array_definition_elements(0);
				setState(387);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(LEFT_SBRACKET);
				setState(390);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			rvalue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
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
					setState(396);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(397);
					match(COMMA);
					setState(398);
					rvalue(0);
					}
					} 
				}
				setState(403);
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
		enterRule(_localctx, 54, RULE_array_selector);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				id();
				setState(405);
				match(LEFT_SBRACKET);
				setState(406);
				rvalue(0);
				setState(407);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				id_global();
				setState(410);
				match(LEFT_SBRACKET);
				setState(411);
				rvalue(0);
				setState(412);
				match(RIGHT_SBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				function_call();
				setState(415);
				match(LEFT_SBRACKET);
				setState(416);
				rvalue(0);
				setState(417);
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
		public VarInfo info;
		public Int_resultContext i1;
		public Int_tContext int_t;
		public Token signo;
		public Int_resultContext i2;
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(422);
			((Int_resultContext)_localctx).int_t = int_t();
			((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,((Int_resultContext)_localctx).int_t.value);
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						_localctx.i1 = _prevctx;
						_localctx.i1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(425);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(426);
						((Int_resultContext)_localctx).signo = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(427);
						((Int_resultContext)_localctx).i2 = int_result(4);

						          	if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR || ((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = handleError(((Int_resultContext)_localctx).i1.info,((Int_resultContext)_localctx).i2.info);
						          	else if(getVocabulary().getSymbolicName((((Int_resultContext)_localctx).signo!=null?((Int_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Int_resultContext)_localctx).i1.info.getContent()*(Integer)((Int_resultContext)_localctx).i2.info.getContent());
						          	else if(getVocabulary().getSymbolicName((((Int_resultContext)_localctx).signo!=null?((Int_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						          			((Int_resultContext)_localctx).info = divide((Number) ((Int_resultContext)_localctx).i1.info.getContent(),(Number) ((Int_resultContext)_localctx).i2.info.getContent(),VarInfo.INT_TYPE);
						          	else
						          			((Int_resultContext)_localctx).info = module((Number) ((Int_resultContext)_localctx).i1.info.getContent(),(Number) ((Int_resultContext)_localctx).i2.info.getContent(),VarInfo.INT_TYPE);
						          
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						_localctx.i1 = _prevctx;
						_localctx.i1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(430);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(431);
						((Int_resultContext)_localctx).signo = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(432);
						((Int_resultContext)_localctx).i2 = int_result(3);

						          	if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR || ((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = handleError(((Int_resultContext)_localctx).i1.info,((Int_resultContext)_localctx).i2.info);
						          	else if(getVocabulary().getSymbolicName((((Int_resultContext)_localctx).signo!=null?((Int_resultContext)_localctx).signo.getType():0)).equals("PLUS"))
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Int_resultContext)_localctx).i1.info.getContent()+(Integer)((Int_resultContext)_localctx).i2.info.getContent());
						          	else{
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Int_resultContext)_localctx).i1.info.getContent()-(Integer)((Int_resultContext)_localctx).i2.info.getContent());
						          	}
						          
						}
						break;
					}
					} 
				}
				setState(439);
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
		public VarInfo info;
		public Float_resultContext f1;
		public Int_resultContext i1;
		public Token signo;
		public Float_resultContext f2;
		public Float_tContext float_t;
		public Int_resultContext i2;
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(441);
				((Float_resultContext)_localctx).i1 = int_result(0);
				setState(442);
				((Float_resultContext)_localctx).signo = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(443);
				((Float_resultContext)_localctx).f2 = float_result(6);

					if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR || ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = handleError(((Float_resultContext)_localctx).i1.info,((Float_resultContext)_localctx).f2.info);
					else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double) ((Float_resultContext)_localctx).i1.info.getContent()* (Double) ((Float_resultContext)_localctx).f2.info.getContent());
					else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						((Float_resultContext)_localctx).info = divide((Number) ((Float_resultContext)_localctx).i1.info.getContent(),(Number) ((Float_resultContext)_localctx).i2.info.getContent(),VarInfo.FLOAT_TYPE);
					else
						((Float_resultContext)_localctx).info = module((Number) ((Float_resultContext)_localctx).i1.info.getContent(),(Number) ((Float_resultContext)_localctx).i2.info.getContent(),VarInfo.FLOAT_TYPE);

				}
				break;
			case 2:
				{
				setState(446);
				((Float_resultContext)_localctx).i1 = int_result(0);
				setState(447);
				((Float_resultContext)_localctx).signo = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				((Float_resultContext)_localctx).f2 = float_result(3);

					if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR || ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = handleError(((Float_resultContext)_localctx).i1.info,((Float_resultContext)_localctx).f2.info);
					else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("PLUS"))
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Float_resultContext)_localctx).i1.info.getContent()+(Double)((Float_resultContext)_localctx).f2.info.getContent());
					else{
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Float_resultContext)_localctx).i1.info.getContent()-(Double)((Float_resultContext)_localctx).f2.info.getContent());
					}

				}
				break;
			case 3:
				{
				setState(451);
				((Float_resultContext)_localctx).float_t = float_t();
				((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,((Float_resultContext)_localctx).float_t.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(476);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(456);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(457);
						((Float_resultContext)_localctx).signo = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(458);
						((Float_resultContext)_localctx).f2 = float_result(8);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = handleError(((Float_resultContext)_localctx).f1.info,((Float_resultContext)_localctx).f2.info);
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double) ((Float_resultContext)_localctx).f1.info.getContent()* (Double) ((Float_resultContext)_localctx).f2.info.getContent());
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						          			((Float_resultContext)_localctx).info = divide((Number) ((Float_resultContext)_localctx).i1.info.getContent(),(Number) ((Float_resultContext)_localctx).i2.info.getContent(),VarInfo.FLOAT_TYPE);
						          	else
						          			((Float_resultContext)_localctx).info = module((Number) ((Float_resultContext)_localctx).i1.info.getContent(),(Number) ((Float_resultContext)_localctx).i2.info.getContent(),VarInfo.FLOAT_TYPE);
						          
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(461);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(462);
						((Float_resultContext)_localctx).signo = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(463);
						((Float_resultContext)_localctx).f2 = float_result(5);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR || ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = handleError(((Float_resultContext)_localctx).f1.info,((Float_resultContext)_localctx).f2.info);
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("PLUS"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()+(Double)((Float_resultContext)_localctx).f2.info.getContent());
						          	else{
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()-(Double)((Float_resultContext)_localctx).f2.info.getContent());
						          	}
						          
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(466);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(467);
						((Float_resultContext)_localctx).signo = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(468);
						((Float_resultContext)_localctx).i2 = int_result(0);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR || ((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = handleError(((Float_resultContext)_localctx).f1.info,((Float_resultContext)_localctx).i2.info);
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double) ((Float_resultContext)_localctx).f1.info.getContent()* (Double) ((Float_resultContext)_localctx).i2.info.getContent());
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						          		((Float_resultContext)_localctx).info = divide((Number) ((Float_resultContext)_localctx).i1.info.getContent(),(Number) ((Float_resultContext)_localctx).i2.info.getContent(),VarInfo.FLOAT_TYPE);
						          	else
						          		((Float_resultContext)_localctx).info = module((Number) ((Float_resultContext)_localctx).i1.info.getContent(),(Number) ((Float_resultContext)_localctx).i2.info.getContent(),VarInfo.FLOAT_TYPE);
						          
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(471);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(472);
						((Float_resultContext)_localctx).signo = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(473);
						((Float_resultContext)_localctx).i2 = int_result(0);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR || ((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = handleError(((Float_resultContext)_localctx).f1.info,((Float_resultContext)_localctx).i2.info);
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("PLUS"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()+(Integer)((Float_resultContext)_localctx).i2.info.getContent());
						          	else{
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()-(Integer)((Float_resultContext)_localctx).i2.info.getContent());
						          	}
						          
						}
						break;
					}
					} 
				}
				setState(480);
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
		public VarInfo info;
		public Int_resultContext int_result;
		public String_resultContext string_result;
		public Literal_tContext literal_t;
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(482);
				((String_resultContext)_localctx).int_result = int_result(0);
				setState(483);
				match(MUL);
				setState(484);
				((String_resultContext)_localctx).string_result = string_result(2);

					if(((String_resultContext)_localctx).int_result.info.getType()==VarInfo.ERROR || ((String_resultContext)_localctx).string_result.info.getType()==VarInfo.ERROR)
						((String_resultContext)_localctx).info = handleError(((String_resultContext)_localctx).int_result.info,((String_resultContext)_localctx).string_result.info);
					else{
						int n=(Integer) ((String_resultContext)_localctx).int_result.info.getContent();
						String s=(String) ((String_resultContext)_localctx).string_result.info.getContent();
						((String_resultContext)_localctx).info = multString(s,n);
					}

				}
				break;
			case LITERAL:
				{
				setState(487);
				((String_resultContext)_localctx).literal_t = literal_t();
				((String_resultContext)_localctx).info = new VarInfo(VarInfo.STRING_TYPE, (((String_resultContext)_localctx).literal_t!=null?_input.getText(((String_resultContext)_localctx).literal_t.start,((String_resultContext)_localctx).literal_t.stop):null).substring(1,(((String_resultContext)_localctx).literal_t!=null?_input.getText(((String_resultContext)_localctx).literal_t.start,((String_resultContext)_localctx).literal_t.stop):null).length()-1));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
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
					setState(492);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(493);
					match(MUL);
					setState(494);
					((String_resultContext)_localctx).int_result = int_result(0);

					          	if(((String_resultContext)_localctx).int_result.info.getType()==VarInfo.ERROR || ((String_resultContext)_localctx).string_result.info.getType()==VarInfo.ERROR)
					          		((String_resultContext)_localctx).info = handleError(((String_resultContext)_localctx).int_result.info,((String_resultContext)_localctx).string_result.info);
					          	else{
					          		int n=(Integer) ((String_resultContext)_localctx).int_result.info.getContent();
					          		String s=(String) ((String_resultContext)_localctx).string_result.info.getContent();
					          		((String_resultContext)_localctx).info = multString(s,n);
					          	}
					          
					}
					} 
				}
				setState(501);
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
		enterRule(_localctx, 62, RULE_lvalue);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				id();
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
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
		public VarInfo info;
		public RvalueContext r1;
		public LvalueContext lvalue;
		public Int_resultContext int_result;
		public Float_resultContext float_result;
		public String_resultContext string_result;
		public AssignmentContext assignment;
		public Bool_tContext bool_t;
		public RvalueContext rvalue;
		public RvalueContext r2;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
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
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public TerminalNode NOT() { return getToken(rubyParser.NOT, 0); }
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(rubyParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_rvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(507);
				((RvalueContext)_localctx).lvalue = lvalue();
				if(varTable.containsKey((((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null))) ((RvalueContext)_localctx).info = varTable.get((((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null)); else ((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR,"Variable utilizada sin inicializar: "+(((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null));
				}
				break;
			case 2:
				{
				setState(510);
				((RvalueContext)_localctx).int_result = int_result(0);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).int_result.info;
				}
				break;
			case 3:
				{
				setState(513);
				((RvalueContext)_localctx).float_result = float_result(0);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).float_result.info;
				}
				break;
			case 4:
				{
				setState(516);
				((RvalueContext)_localctx).string_result = string_result(0);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).string_result.info;
				}
				break;
			case 5:
				{
				setState(519);
				((RvalueContext)_localctx).assignment = assignment();
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).assignment.info;
				}
				break;
			case 6:
				{
				setState(522);
				((RvalueContext)_localctx).bool_t = bool_t();
				((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,((RvalueContext)_localctx).bool_t.value);
				}
				break;
			case 7:
				{
				setState(525);
				nil_t();
				((RvalueContext)_localctx).info = new VarInfo(VarInfo.NIL_TYPE,null);
				}
				break;
			case 8:
				{
				setState(528);
				match(NOT);
				setState(529);
				((RvalueContext)_localctx).rvalue = rvalue(7);

					if(((RvalueContext)_localctx).rvalue.info.getType()==VarInfo.ERROR)
						((RvalueContext)_localctx).info = ((RvalueContext)_localctx).rvalue.info;
					else
						((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,!getBoolean(((RvalueContext)_localctx).rvalue.info));

				}
				break;
			case 9:
				{
				setState(532);
				match(LEFT_RBRACKET);
				setState(533);
				((RvalueContext)_localctx).rvalue = rvalue(0);
				setState(534);
				match(RIGHT_RBRACKET);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).rvalue.info;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(600);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(539);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(540);
						match(EXP);
						setState(541);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(9);

						          	if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR || ((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = handleError(((RvalueContext)_localctx).r1.info,((RvalueContext)_localctx).r2.info);
						          	else if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.INT_TYPE && ((RvalueContext)_localctx).r2.info.getType()==VarInfo.INT_TYPE)
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE, (int) Math.pow((int)((RvalueContext)_localctx).r1.info.getContent(),(int)((RvalueContext)_localctx).r2.info.getContent()));
						          	else if((((RvalueContext)_localctx).r1.info.getType()==VarInfo.INT_TYPE || ((RvalueContext)_localctx).r1.info.getType()==VarInfo.FLOAT_TYPE) && (((RvalueContext)_localctx).r2.info.getType()==VarInfo.INT_TYPE || ((RvalueContext)_localctx).r2.info.getType()==VarInfo.FLOAT_TYPE))
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,Math.pow(((Number)((RvalueContext)_localctx).r1.info.getContent()).doubleValue(),((Number)((RvalueContext)_localctx).r2.info.getContent()).doubleValue()));
						          	else
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR, "Tipos incompatibles");
						          
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(544);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						int operation=0;
						setState(551);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(546);
							match(MUL);
							}
							break;
						case DIV:
							{
							setState(547);
							match(DIV);
							operation=1;
							}
							break;
						case MOD:
							{
							setState(549);
							match(MOD);
							operation=2;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(553);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(7);

						          	VarInfo info1=((RvalueContext)_localctx).r1.info, info2=((RvalueContext)_localctx).r2.info;
						          	if((info1.getType()==VarInfo.INT_TYPE||info1.getType()==VarInfo.FLOAT_TYPE) && (info2.getType()==VarInfo.INT_TYPE||info2.getType()==VarInfo.FLOAT_TYPE)){
						          		int resultType=VarInfo.FLOAT_TYPE;
						          		if(info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.INT_TYPE){
						          			resultType=VarInfo.INT_TYPE;
						          		}
						          		switch(operation){
						          		case 0:
						          			if(resultType==VarInfo.INT_TYPE)
						          				((RvalueContext)_localctx).info = new VarInfo(resultType,((int)info1.getContent())*((int)info2.getContent()));
						          			else
						          				((RvalueContext)_localctx).info = new VarInfo(resultType,((Number)info1.getContent()).doubleValue()*((Number)info2.getContent()).doubleValue());
						          		break;
						          		case 1:
						          			((RvalueContext)_localctx).info = divide((Number) info1.getContent(),(Number) info1.getContent(),resultType);
						          		break;
						          		case 2:
						          			((RvalueContext)_localctx).info = module((Number) info1.getContent(),(Number) info1.getContent(),resultType);
						          		break;
						          		}
						          	}
						          	else if(((info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.STRING_TYPE)||(info2.getType()==VarInfo.INT_TYPE && info1.getType()==VarInfo.STRING_TYPE))&&operation==0){
						          		if(info1.getType()==VarInfo.INT_TYPE)
						          			((RvalueContext)_localctx).info = multString((String) info2.getContent(),(int) info1.getContent());
						          		else
						          			((RvalueContext)_localctx).info = multString((String) info1.getContent(),(int) info2.getContent());
						          	}
						          	else if(info1.getType()==VarInfo.ERROR || info2.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = handleError(info1,info2);
						          	else ((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR,"Tipos incompatibles para esa operación");
						          
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(556);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						int operation=0;
						setState(561);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(558);
							match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(559);
							match(MINUS);
							operation=1;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(563);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(6);

						          	VarInfo info1=((RvalueContext)_localctx).r1.info, info2=((RvalueContext)_localctx).r2.info;
						          	if((info1.getType()==VarInfo.INT_TYPE||info1.getType()==VarInfo.FLOAT_TYPE) && (info2.getType()==VarInfo.INT_TYPE||info2.getType()==VarInfo.FLOAT_TYPE)){
						          		int resultType=VarInfo.FLOAT_TYPE;
						          		if(info1.getType()==VarInfo.INT_TYPE && info2.getType()==VarInfo.INT_TYPE)
						          			resultType=VarInfo.INT_TYPE;
						          		switch(operation){
						          		case 0:
						          			if(resultType==VarInfo.INT_TYPE)
						          				((RvalueContext)_localctx).info = new VarInfo(resultType,((int)info1.getContent())+((int)info2.getContent()));
						          			else
						          				((RvalueContext)_localctx).info = new VarInfo(resultType,((Number)info1.getContent()).doubleValue()+((Number)info2.getContent()).doubleValue());
						          		break;
						          		case 1:
						          			if(resultType==VarInfo.INT_TYPE)
						          				((RvalueContext)_localctx).info = new VarInfo(resultType,((int)info1.getContent())-((int)info2.getContent()));
						          			else
						          				((RvalueContext)_localctx).info = new VarInfo(resultType,((Number)info1.getContent()).doubleValue()-((Number)info2.getContent()).doubleValue());
						          		break;
						          		}
						          	}
						          	else if(info1.getType()==VarInfo.STRING_TYPE && info2.getType()==VarInfo.STRING_TYPE&& operation==0){
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.STRING_TYPE,((String) info1.getContent())+((String) info2.getContent()));
						          	}
						          	else if(info1.getType()==VarInfo.ERROR || info2.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = handleError(info1,info2);
						          	else ((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR,"Tipos incompatibles para esa operación");
						          
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(566);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						int selector=0;
						setState(575);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS:
							{
							setState(568);
							match(LESS);
							}
							break;
						case GREATER:
							{
							setState(569);
							match(GREATER);
							selector=1;
							}
							break;
						case LESS_EQUAL:
							{
							setState(571);
							match(LESS_EQUAL);
							selector=2;
							}
							break;
						case GREATER_EQUAL:
							{
							setState(573);
							match(GREATER_EQUAL);
							selector=3;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(577);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(5);

						          	boolean val=false;
						          	if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR || ((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = handleError(((RvalueContext)_localctx).r1.info,((RvalueContext)_localctx).r1.info);
						          	else{
						          		if(((RvalueContext)_localctx).r1.info.getType()==((RvalueContext)_localctx).r2.info.getType() && !(((RvalueContext)_localctx).r1.info.getType()==VarInfo.NIL_TYPE)){
						          			int comp=((Comparable) ((RvalueContext)_localctx).r1.info.getContent()).compareTo(((RvalueContext)_localctx).r2.info.getContent());
						          			switch(selector){
						          			case 0:
						          				val=comp<0;
						          				break;
						          			case 1:
						          				val=comp>0;
						          				break;
						          			case 2:
						          				val=comp<=0;
						          				break;
						          			case 3:
						          				val=comp>=0;
						          				break;
						          			}
						          			((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE, val);
						          		}
						          		else if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.INT_TYPE && ((RvalueContext)_localctx).r2.info.getType()==VarInfo.FLOAT_TYPE || ((RvalueContext)_localctx).r2.info.getType()==VarInfo.INT_TYPE && ((RvalueContext)_localctx).r1.info.getType()==VarInfo.FLOAT_TYPE){
						          			double v1=((Number) ((RvalueContext)_localctx).r1.info.getContent()).doubleValue(),v2=((Number) ((RvalueContext)_localctx).r2.info.getContent()).doubleValue();
						          			switch(selector){
						          			case 0:
						          				val=v1<v2;
						          				break;
						          			case 1:
						          				val=v1>v2;
						          				break;
						          			case 2:
						          				val=v1<=v2;
						          				break;
						          			case 3:
						          				val=v1>=v2;
						          				break;
						          			}
						          			((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE, val);
						          		}
						          		else{
						          			((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR, "Tipos incompatibles para comparar");
						          		}
						          	}
						          
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(580);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						boolean eq=false;
						setState(585);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(582);
							match(EQUAL);
							eq=true;
							}
							break;
						case NOT_EQUAL:
							{
							setState(584);
							match(NOT_EQUAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(587);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(4);

						          	boolean val=false;
						          	if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR && ((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((RvalueContext)_localctx).r1.info.getContent()) + "; " + ((String) ((RvalueContext)_localctx).r2.info.getContent()));
						          	else if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = ((RvalueContext)_localctx).r1.info;
						          	else if(((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = ((RvalueContext)_localctx).r2.info;
						          	else{
						          		if(((RvalueContext)_localctx).r1.info.getType()==((RvalueContext)_localctx).r2.info.getType()){
						          			if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.NIL_TYPE || ((RvalueContext)_localctx).r1.info.getContent().equals(((RvalueContext)_localctx).r2.info.getContent()))
						          				val=true;
						          		}
						          		else if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.INT_TYPE && ((RvalueContext)_localctx).r2.info.getType()==VarInfo.FLOAT_TYPE){
						          			val=(int) ((RvalueContext)_localctx).r1.info.getContent()==(double) ((RvalueContext)_localctx).r2.info.getContent();
						          		}
						          		else if(((RvalueContext)_localctx).r2.info.getType()==VarInfo.INT_TYPE && ((RvalueContext)_localctx).r1.info.getType()==VarInfo.FLOAT_TYPE){
						          			val=(int) ((RvalueContext)_localctx).r2.info.getContent()==(double) ((RvalueContext)_localctx).r1.info.getContent();
						          		}
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,eq?val:!val);
						          	}
						          
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(590);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						boolean modeOr=false;
						setState(595);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OR:
							{
							setState(592);
							match(OR);
							modeOr=false;
							}
							break;
						case AND:
							{
							setState(594);
							match(AND);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(597);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(3);

						          	if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR && ((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((RvalueContext)_localctx).r1.info.getContent()) + "; " + ((String) ((RvalueContext)_localctx).r2.info.getContent()));
						          	else if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = ((RvalueContext)_localctx).r1.info;
						          	else if(((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = ((RvalueContext)_localctx).r2.info;
						          	else if(modeOr)((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,getBoolean(((RvalueContext)_localctx).r1.info) || getBoolean(((RvalueContext)_localctx).r2.info));
						          	else ((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,getBoolean(((RvalueContext)_localctx).r1.info) && getBoolean(((RvalueContext)_localctx).r2.info));
						          
						}
						break;
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 66, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		public double value;
		public Token FLOAT;
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
		enterRule(_localctx, 68, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			((Float_tContext)_localctx).FLOAT = match(FLOAT);
			((Float_tContext)_localctx).value = Double.parseDouble((((Float_tContext)_localctx).FLOAT!=null?((Float_tContext)_localctx).FLOAT.getText():null));
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
		public int value;
		public Token INT;
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
		enterRule(_localctx, 70, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((Int_tContext)_localctx).INT = match(INT);
			((Int_tContext)_localctx).value = (((Int_tContext)_localctx).INT!=null?Integer.valueOf(((Int_tContext)_localctx).INT.getText()):0);
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
		public boolean value;
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
		enterRule(_localctx, 72, RULE_bool_t);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(TRUE);
				((Bool_tContext)_localctx).value = true;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(FALSE);
				((Bool_tContext)_localctx).value = false;
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
		enterRule(_localctx, 74, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
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
		enterRule(_localctx, 76, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
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
		enterRule(_localctx, 78, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
		enterRule(_localctx, 80, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(628);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(629);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(636);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(632);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(633);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(634);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(635);
						crlf();
						}
						break;
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 84, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		case 26:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 28:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 29:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 30:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 32:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 41:
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
			return precpred(_ctx, 8);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0286\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3c\n\3\f\3\16\3f\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3"+
		"\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00f5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010b\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0117\n\24\f\24\16"+
		"\24\u011a\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0132\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0148\n\26\f\26\16\26\u014b\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0158"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u015e\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0172"+
		"\n\31\3\31\3\31\3\31\5\31\u0177\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0182\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018a\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0192\n\34\f\34\16\34\u0195\13"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01a6\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u01b6\n\36\f\36\16\36\u01b9\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01c9\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01df\n\37\f\37\16\37\u01e2"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ed\n \3 \3 \3 \3 \3 \7 \u01f4"+
		"\n \f \16 \u01f7\13 \3!\3!\5!\u01fb\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u021c\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u022a\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0234"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0242\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u024c\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0256\n\"\3\"\3\"\3\"\7\"\u025b\n\"\f\"\16\"\u025e\13\"\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\5&\u026c\n&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3+\5+\u0279\n+\3+\3+\3+\3+\7+\u027f\n+\f+\16+\u0282\13+\3,\3,\3"+
		",\2\r\4\24\34&*\66:<>BT-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTV\2\4\3\2\33\35\3\2\31\32\u02ac\2X\3\2\2"+
		"\2\4Z\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\nv\3\2\2\2\fz\3\2\2\2\16\u0085\3\2"+
		"\2\2\20\u0089\3\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2\2\26\u009d\3\2\2"+
		"\2\30\u00ac\3\2\2\2\32\u00ae\3\2\2\2\34\u00b0\3\2\2\2\36\u00ce\3\2\2\2"+
		" \u00f4\3\2\2\2\"\u00f6\3\2\2\2$\u00fc\3\2\2\2&\u010a\3\2\2\2(\u0131\3"+
		"\2\2\2*\u013b\3\2\2\2,\u0157\3\2\2\2.\u015d\3\2\2\2\60\u0176\3\2\2\2\62"+
		"\u0181\3\2\2\2\64\u0189\3\2\2\2\66\u018b\3\2\2\28\u01a5\3\2\2\2:\u01a7"+
		"\3\2\2\2<\u01c8\3\2\2\2>\u01ec\3\2\2\2@\u01fa\3\2\2\2B\u021b\3\2\2\2D"+
		"\u025f\3\2\2\2F\u0261\3\2\2\2H\u0264\3\2\2\2J\u026b\3\2\2\2L\u026d\3\2"+
		"\2\2N\u026f\3\2\2\2P\u0271\3\2\2\2R\u0273\3\2\2\2T\u0278\3\2\2\2V\u0283"+
		"\3\2\2\2XY\5\4\3\2Y\3\3\2\2\2Z[\b\3\1\2[\\\5\6\4\2\\]\5T+\2]d\3\2\2\2"+
		"^_\f\4\2\2_`\5\6\4\2`a\5T+\2ac\3\2\2\2b^\3\2\2\2cf\3\2\2\2db\3\2\2\2d"+
		"e\3\2\2\2e\5\3\2\2\2fd\3\2\2\2gr\5\n\6\2hr\5\b\5\2ir\5 \21\2jr\5\"\22"+
		"\2kl\5B\"\2lm\b\4\1\2mr\3\2\2\2nr\5\26\f\2or\5$\23\2pr\5(\25\2qg\3\2\2"+
		"\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2"+
		"\2r\7\3\2\2\2st\7\b\2\2tu\5D#\2u\t\3\2\2\2vw\5\16\b\2wx\5\f\7\2xy\7\t"+
		"\2\2y\13\3\2\2\2z{\5\4\3\2{\r\3\2\2\2|}\7\n\2\2}~\5\20\t\2~\177\5V,\2"+
		"\177\u0086\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0082\5\20\t\2\u0082\u0083"+
		"\5\22\n\2\u0083\u0084\5V,\2\u0084\u0086\3\2\2\2\u0085|\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0086\17\3\2\2\2\u0087\u008a\5R*\2\u0088\u008a\5N(\2\u0089\u0087"+
		"\3\2\2\2\u0089\u0088\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\7\65\2\2\u008c"+
		"\u008d\5\24\13\2\u008d\u008e\7\66\2\2\u008e\u0091\3\2\2\2\u008f\u0091"+
		"\5\24\13\2\u0090\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091\23\3\2\2\2\u0092"+
		"\u0093\b\13\1\2\u0093\u0094\5N(\2\u0094\u009a\3\2\2\2\u0095\u0096\f\3"+
		"\2\2\u0096\u0097\7\5\2\2\u0097\u0099\5N(\2\u0098\u0095\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\13\2\2\u009e\u009f\5B\"\2\u009f\27\3\2\2"+
		"\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\65\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7\66\2\2\u00a4\u00ad\3\2\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00a7\5"+
		"\32\16\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\65\2\2"+
		"\u00aa\u00ab\7\66\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a5"+
		"\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af\5\34\17\2\u00af"+
		"\33\3\2\2\2\u00b0\u00b1\b\17\1\2\u00b1\u00b2\5B\"\2\u00b2\u00b8\3\2\2"+
		"\2\u00b3\u00b4\f\3\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b7\5B\"\2\u00b6\u00b3"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\35\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\5B\""+
		"\2\u00bd\u00be\5V,\2\u00be\u00bf\5\4\3\2\u00bf\u00cf\3\2\2\2\u00c0\u00c1"+
		"\7\17\2\2\u00c1\u00c2\5B\"\2\u00c2\u00c3\5V,\2\u00c3\u00c4\5\4\3\2\u00c4"+
		"\u00c5\7\16\2\2\u00c5\u00c6\5V,\2\u00c6\u00c7\5\4\3\2\u00c7\u00cf\3\2"+
		"\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\5B\"\2\u00ca\u00cb\5V,\2\u00cb\u00cc"+
		"\5\4\3\2\u00cc\u00cd\5\36\20\2\u00cd\u00cf\3\2\2\2\u00ce\u00bb\3\2\2\2"+
		"\u00ce\u00c0\3\2\2\2\u00ce\u00c8\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00d1"+
		"\7\f\2\2\u00d1\u00d2\5B\"\2\u00d2\u00d3\5V,\2\u00d3\u00d4\5\4\3\2\u00d4"+
		"\u00d5\7\t\2\2\u00d5\u00f5\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\5B"+
		"\"\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\5\4\3\2\u00da\u00db\7\t\2\2\u00db"+
		"\u00f5\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\5B\"\2\u00de\u00df\5V,"+
		"\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2\5V,\2\u00e2\u00e3"+
		"\5\4\3\2\u00e3\u00e4\7\t\2\2\u00e4\u00f5\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6"+
		"\u00e7\5B\"\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea\7\16"+
		"\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7\t\2\2\u00ec\u00f5\3\2\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\5B\"\2\u00ef\u00f0\5V,\2\u00f0\u00f1\5\4\3"+
		"\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\t\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00d0\3\2\2\2\u00f4\u00d6\3\2\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00e5\3\2"+
		"\2\2\u00f4\u00ed\3\2\2\2\u00f5!\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8"+
		"\5B\"\2\u00f8\u00f9\5V,\2\u00f9\u00fa\5\4\3\2\u00fa\u00fb\7\t\2\2\u00fb"+
		"#\3\2\2\2\u00fc\u00fd\7\21\2\2\u00fd\u00fe\5B\"\2\u00fe\u00ff\5V,\2\u00ff"+
		"\u0100\5&\24\2\u0100\u0101\7\t\2\2\u0101%\3\2\2\2\u0102\u0103\b\24\1\2"+
		"\u0103\u0104\5\6\4\2\u0104\u0105\5T+\2\u0105\u010b\3\2\2\2\u0106\u0107"+
		"\7\22\2\2\u0107\u010b\5T+\2\u0108\u0109\7\23\2\2\u0109\u010b\5T+\2\u010a"+
		"\u0102\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0118\3\2"+
		"\2\2\u010c\u010d\f\5\2\2\u010d\u010e\5\6\4\2\u010e\u010f\5T+\2\u010f\u0117"+
		"\3\2\2\2\u0110\u0111\f\4\2\2\u0111\u0112\7\22\2\2\u0112\u0117\5T+\2\u0113"+
		"\u0114\f\3\2\2\u0114\u0115\7\23\2\2\u0115\u0117\5T+\2\u0116\u010c\3\2"+
		"\2\2\u0116\u0110\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\'\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011c\7\24\2\2\u011c\u011d\7\65\2\2\u011d\u011e\5\6\4\2\u011e\u011f"+
		"\7\6\2\2\u011f\u0120\5\6\4\2\u0120\u0121\7\6\2\2\u0121\u0122\5\6\4\2\u0122"+
		"\u0123\7\66\2\2\u0123\u0124\5V,\2\u0124\u0125\5*\26\2\u0125\u0126\7\t"+
		"\2\2\u0126\u0132\3\2\2\2\u0127\u0128\7\24\2\2\u0128\u0129\5\6\4\2\u0129"+
		"\u012a\7\6\2\2\u012a\u012b\5\6\4\2\u012b\u012c\7\6\2\2\u012c\u012d\5\6"+
		"\4\2\u012d\u012e\5V,\2\u012e\u012f\5*\26\2\u012f\u0130\7\t\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u011b\3\2\2\2\u0131\u0127\3\2\2\2\u0132)\3\2\2\2\u0133"+
		"\u0134\b\26\1\2\u0134\u0135\5\6\4\2\u0135\u0136\5T+\2\u0136\u013c\3\2"+
		"\2\2\u0137\u0138\7\22\2\2\u0138\u013c\5T+\2\u0139\u013a\7\23\2\2\u013a"+
		"\u013c\5T+\2\u013b\u0133\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0139\3\2\2"+
		"\2\u013c\u0149\3\2\2\2\u013d\u013e\f\5\2\2\u013e\u013f\5\6\4\2\u013f\u0140"+
		"\5T+\2\u0140\u0148\3\2\2\2\u0141\u0142\f\4\2\2\u0142\u0143\7\22\2\2\u0143"+
		"\u0148\5T+\2\u0144\u0145\f\3\2\2\u0145\u0146\7\23\2\2\u0146\u0148\5T+"+
		"\2\u0147\u013d\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a+\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\7\26\2\2\u014d\u014e\5.\30\2\u014e\u014f\7"+
		"\r\2\2\u014f\u0150\5\4\3\2\u0150\u0151\5,\27\2\u0151\u0158\3\2\2\2\u0152"+
		"\u0153\7\26\2\2\u0153\u0154\5.\30\2\u0154\u0155\7\r\2\2\u0155\u0156\5"+
		"\4\3\2\u0156\u0158\3\2\2\2\u0157\u014c\3\2\2\2\u0157\u0152\3\2\2\2\u0158"+
		"-\3\2\2\2\u0159\u015a\5B\"\2\u015a\u015b\7\5\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015e\5B\"\2\u015d\u0159\3\2\2\2\u015d\u015c\3\2\2\2\u015e/\3\2\2\2\u015f"+
		"\u0160\5@!\2\u0160\u0161\7%\2\2\u0161\u0162\5B\"\2\u0162\u0163\b\31\1"+
		"\2\u0163\u0177\3\2\2\2\u0164\u0165\5@!\2\u0165\u0171\b\31\1\2\u0166\u0172"+
		"\7&\2\2\u0167\u0168\7\'\2\2\u0168\u0172\b\31\1\2\u0169\u016a\7(\2\2\u016a"+
		"\u0172\b\31\1\2\u016b\u016c\7)\2\2\u016c\u0172\b\31\1\2\u016d\u016e\7"+
		"*\2\2\u016e\u0172\b\31\1\2\u016f\u0170\7+\2\2\u0170\u0172\b\31\1\2\u0171"+
		"\u0166\3\2\2\2\u0171\u0167\3\2\2\2\u0171\u0169\3\2\2\2\u0171\u016b\3\2"+
		"\2\2\u0171\u016d\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\5B\"\2\u0174\u0175\b\31\1\2\u0175\u0177\3\2\2\2\u0176\u015f\3\2"+
		"\2\2\u0176\u0164\3\2\2\2\u0177\61\3\2\2\2\u0178\u0179\5@!\2\u0179\u017a"+
		"\5\64\33\2\u017a\u017b\7%\2\2\u017b\u017c\5B\"\2\u017c\u0182\3\2\2\2\u017d"+
		"\u017e\5@!\2\u017e\u017f\7%\2\2\u017f\u0180\5\64\33\2\u0180\u0182\3\2"+
		"\2\2\u0181\u0178\3\2\2\2\u0181\u017d\3\2\2\2\u0182\63\3\2\2\2\u0183\u0184"+
		"\7\67\2\2\u0184\u0185\5\66\34\2\u0185\u0186\78\2\2\u0186\u018a\3\2\2\2"+
		"\u0187\u0188\7\67\2\2\u0188\u018a\78\2\2\u0189\u0183\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\65\3\2\2\2\u018b\u018c\b\34\1\2\u018c\u018d\5B\"\2\u018d"+
		"\u0193\3\2\2\2\u018e\u018f\f\3\2\2\u018f\u0190\7\5\2\2\u0190\u0192\5B"+
		"\"\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\67\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\5N(\2"+
		"\u0197\u0198\7\67\2\2\u0198\u0199\5B\"\2\u0199\u019a\78\2\2\u019a\u01a6"+
		"\3\2\2\2\u019b\u019c\5P)\2\u019c\u019d\7\67\2\2\u019d\u019e\5B\"\2\u019e"+
		"\u019f\78\2\2\u019f\u01a6\3\2\2\2\u01a0\u01a1\5\30\r\2\u01a1\u01a2\7\67"+
		"\2\2\u01a2\u01a3\5B\"\2\u01a3\u01a4\78\2\2\u01a4\u01a6\3\2\2\2\u01a5\u0196"+
		"\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a69\3\2\2\2\u01a7"+
		"\u01a8\b\36\1\2\u01a8\u01a9\5H%\2\u01a9\u01aa\b\36\1\2\u01aa\u01b7\3\2"+
		"\2\2\u01ab\u01ac\f\5\2\2\u01ac\u01ad\t\2\2\2\u01ad\u01ae\5:\36\6\u01ae"+
		"\u01af\b\36\1\2\u01af\u01b6\3\2\2\2\u01b0\u01b1\f\4\2\2\u01b1\u01b2\t"+
		"\3\2\2\u01b2\u01b3\5:\36\5\u01b3\u01b4\b\36\1\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01ab\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8;\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb"+
		"\b\37\1\2\u01bb\u01bc\5:\36\2\u01bc\u01bd\t\2\2\2\u01bd\u01be\5<\37\b"+
		"\u01be\u01bf\b\37\1\2\u01bf\u01c9\3\2\2\2\u01c0\u01c1\5:\36\2\u01c1\u01c2"+
		"\t\3\2\2\u01c2\u01c3\5<\37\5\u01c3\u01c4\b\37\1\2\u01c4\u01c9\3\2\2\2"+
		"\u01c5\u01c6\5F$\2\u01c6\u01c7\b\37\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01ba"+
		"\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9\u01e0\3\2\2\2\u01ca"+
		"\u01cb\f\t\2\2\u01cb\u01cc\t\2\2\2\u01cc\u01cd\5<\37\n\u01cd\u01ce\b\37"+
		"\1\2\u01ce\u01df\3\2\2\2\u01cf\u01d0\f\6\2\2\u01d0\u01d1\t\3\2\2\u01d1"+
		"\u01d2\5<\37\7\u01d2\u01d3\b\37\1\2\u01d3\u01df\3\2\2\2\u01d4\u01d5\f"+
		"\7\2\2\u01d5\u01d6\t\2\2\2\u01d6\u01d7\5:\36\2\u01d7\u01d8\b\37\1\2\u01d8"+
		"\u01df\3\2\2\2\u01d9\u01da\f\4\2\2\u01da\u01db\t\3\2\2\u01db\u01dc\5:"+
		"\36\2\u01dc\u01dd\b\37\1\2\u01dd\u01df\3\2\2\2\u01de\u01ca\3\2\2\2\u01de"+
		"\u01cf\3\2\2\2\u01de\u01d4\3\2\2\2\u01de\u01d9\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1=\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e3\u01e4\b \1\2\u01e4\u01e5\5:\36\2\u01e5\u01e6\7\33\2\2\u01e6"+
		"\u01e7\5> \4\u01e7\u01e8\b \1\2\u01e8\u01ed\3\2\2\2\u01e9\u01ea\5D#\2"+
		"\u01ea\u01eb\b \1\2\u01eb\u01ed\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e9"+
		"\3\2\2\2\u01ed\u01f5\3\2\2\2\u01ee\u01ef\f\5\2\2\u01ef\u01f0\7\33\2\2"+
		"\u01f0\u01f1\5:\36\2\u01f1\u01f2\b \1\2\u01f2\u01f4\3\2\2\2\u01f3\u01ee"+
		"\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"?\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\5N(\2\u01f9\u01fb\5P)\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbA\3\2\2\2\u01fc\u01fd\b\"\1\2"+
		"\u01fd\u01fe\5@!\2\u01fe\u01ff\b\"\1\2\u01ff\u021c\3\2\2\2\u0200\u0201"+
		"\5:\36\2\u0201\u0202\b\"\1\2\u0202\u021c\3\2\2\2\u0203\u0204\5<\37\2\u0204"+
		"\u0205\b\"\1\2\u0205\u021c\3\2\2\2\u0206\u0207\5> \2\u0207\u0208\b\"\1"+
		"\2\u0208\u021c\3\2\2\2\u0209\u020a\5\60\31\2\u020a\u020b\b\"\1\2\u020b"+
		"\u021c\3\2\2\2\u020c\u020d\5J&\2\u020d\u020e\b\"\1\2\u020e\u021c\3\2\2"+
		"\2\u020f\u0210\5L\'\2\u0210\u0211\b\"\1\2\u0211\u021c\3\2\2\2\u0212\u0213"+
		"\7\64\2\2\u0213\u0214\5B\"\t\u0214\u0215\b\"\1\2\u0215\u021c\3\2\2\2\u0216"+
		"\u0217\7\65\2\2\u0217\u0218\5B\"\2\u0218\u0219\7\66\2\2\u0219\u021a\b"+
		"\"\1\2\u021a\u021c\3\2\2\2\u021b\u01fc\3\2\2\2\u021b\u0200\3\2\2\2\u021b"+
		"\u0203\3\2\2\2\u021b\u0206\3\2\2\2\u021b\u0209\3\2\2\2\u021b\u020c\3\2"+
		"\2\2\u021b\u020f\3\2\2\2\u021b\u0212\3\2\2\2\u021b\u0216\3\2\2\2\u021c"+
		"\u025c\3\2\2\2\u021d\u021e\f\n\2\2\u021e\u021f\7\36\2\2\u021f\u0220\5"+
		"B\"\13\u0220\u0221\b\"\1\2\u0221\u025b\3\2\2\2\u0222\u0223\f\b\2\2\u0223"+
		"\u0229\b\"\1\2\u0224\u022a\7\33\2\2\u0225\u0226\7\34\2\2\u0226\u022a\b"+
		"\"\1\2\u0227\u0228\7\35\2\2\u0228\u022a\b\"\1\2\u0229\u0224\3\2\2\2\u0229"+
		"\u0225\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\5B"+
		"\"\t\u022c\u022d\b\"\1\2\u022d\u025b\3\2\2\2\u022e\u022f\f\7\2\2\u022f"+
		"\u0233\b\"\1\2\u0230\u0234\7\31\2\2\u0231\u0232\7\32\2\2\u0232\u0234\b"+
		"\"\1\2\u0233\u0230\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0236\5B\"\b\u0236\u0237\b\"\1\2\u0237\u025b\3\2\2\2\u0238\u0239\f\6"+
		"\2\2\u0239\u0241\b\"\1\2\u023a\u0242\7\"\2\2\u023b\u023c\7!\2\2\u023c"+
		"\u0242\b\"\1\2\u023d\u023e\7#\2\2\u023e\u0242\b\"\1\2\u023f\u0240\7$\2"+
		"\2\u0240\u0242\b\"\1\2\u0241\u023a\3\2\2\2\u0241\u023b\3\2\2\2\u0241\u023d"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5B\"\7\u0244"+
		"\u0245\b\"\1\2\u0245\u025b\3\2\2\2\u0246\u0247\f\5\2\2\u0247\u024b\b\""+
		"\1\2\u0248\u0249\7\37\2\2\u0249\u024c\b\"\1\2\u024a\u024c\7 \2\2\u024b"+
		"\u0248\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5B"+
		"\"\6\u024e\u024f\b\"\1\2\u024f\u025b\3\2\2\2\u0250\u0251\f\4\2\2\u0251"+
		"\u0255\b\"\1\2\u0252\u0253\7\63\2\2\u0253\u0256\b\"\1\2\u0254\u0256\7"+
		"\62\2\2\u0255\u0252\3\2\2\2\u0255\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0258\5B\"\5\u0258\u0259\b\"\1\2\u0259\u025b\3\2\2\2\u025a\u021d\3\2"+
		"\2\2\u025a\u0222\3\2\2\2\u025a\u022e\3\2\2\2\u025a\u0238\3\2\2\2\u025a"+
		"\u0246\3\2\2\2\u025a\u0250\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025dC\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260"+
		"\7\4\2\2\u0260E\3\2\2\2\u0261\u0262\7>\2\2\u0262\u0263\b$\1\2\u0263G\3"+
		"\2\2\2\u0264\u0265\7=\2\2\u0265\u0266\b%\1\2\u0266I\3\2\2\2\u0267\u0268"+
		"\7\27\2\2\u0268\u026c\b&\1\2\u0269\u026a\7\30\2\2\u026a\u026c\b&\1\2\u026b"+
		"\u0267\3\2\2\2\u026b\u0269\3\2\2\2\u026cK\3\2\2\2\u026d\u026e\79\2\2\u026e"+
		"M\3\2\2\2\u026f\u0270\7?\2\2\u0270O\3\2\2\2\u0271\u0272\7@\2\2\u0272Q"+
		"\3\2\2\2\u0273\u0274\7A\2\2\u0274S\3\2\2\2\u0275\u0276\b+\1\2\u0276\u0279"+
		"\7\6\2\2\u0277\u0279\5V,\2\u0278\u0275\3\2\2\2\u0278\u0277\3\2\2\2\u0279"+
		"\u0280\3\2\2\2\u027a\u027b\f\6\2\2\u027b\u027f\7\6\2\2\u027c\u027d\f\5"+
		"\2\2\u027d\u027f\5V,\2\u027e\u027a\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0282"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281U\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0284\7\7\2\2\u0284W\3\2\2\2/dq\u0085\u0089\u0090"+
		"\u009a\u00ac\u00b8\u00ce\u00f4\u010a\u0116\u0118\u0131\u013b\u0147\u0149"+
		"\u0157\u015d\u0171\u0176\u0181\u0189\u0193\u01a5\u01b5\u01b7\u01c8\u01de"+
		"\u01e0\u01ec\u01f5\u01fa\u021b\u0229\u0233\u0241\u024b\u0255\u025a\u025c"+
		"\u026b\u0278\u027e\u0280";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}