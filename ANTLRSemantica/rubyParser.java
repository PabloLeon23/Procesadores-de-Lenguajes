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
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_assignment = 3, 
		RULE_int_result = 4, RULE_float_result = 5, RULE_string_result = 6, RULE_lvalue = 7, 
		RULE_rvalue = 8, RULE_literal_t = 9, RULE_float_t = 10, RULE_int_t = 11, 
		RULE_bool_t = 12, RULE_nil_t = 13, RULE_id = 14, RULE_id_global = 15, 
		RULE_id_function = 16, RULE_terminator = 17, RULE_crlf = 18;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "assignment", "int_result", "float_result", 
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


		Hashtable<String,VarInfo> varTable=new Hashtable<String,VarInfo>();
		
		private boolean getBoolean(VarInfo var){
			boolean r=true;
			if(var.getType()==VarInfo.NIL_TYPE) r=false;
			else if(var.getType()==VarInfo.NIL_TYPE) r=(boolean) var.getContent();
			return r;
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
			setState(38);
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
			setState(41);
			expression();
			setState(42);
			terminator(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
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
					setState(44);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(45);
					expression();
					setState(46);
					terminator(0);
					}
					} 
				}
				setState(52);
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
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((ExpressionContext)_localctx).rvalue = rvalue(0);
			System.out.println((((ExpressionContext)_localctx).rvalue!=null?_input.getText(((ExpressionContext)_localctx).rvalue.start,((ExpressionContext)_localctx).rvalue.stop):null)+" -> "+((ExpressionContext)_localctx).rvalue.info);
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
		public Token signo;
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
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((AssignmentContext)_localctx).lvalue = lvalue();
				setState(57);
				match(ASSIGN);
				setState(58);
				((AssignmentContext)_localctx).rvalue = rvalue(0);
				((AssignmentContext)_localctx).info = ((AssignmentContext)_localctx).rvalue.info;varTable.put((((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null), ((AssignmentContext)_localctx).rvalue.info); System.out.println("Asignación a "+(((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null)+" de ("+((AssignmentContext)_localctx).rvalue.info+")");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				lvalue();
				setState(62);
				((AssignmentContext)_localctx).signo = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
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

	public static class Int_resultContext extends ParserRuleContext {
		public VarInfo info;
		public Int_resultContext i1;
		public Int_resultContext int_result;
		public Int_tContext int_t;
		public Int_resultContext i2;
		public Token signo;
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode EXP() { return getToken(rubyParser.EXP, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(68);
				match(LEFT_RBRACKET);
				setState(69);
				((Int_resultContext)_localctx).int_result = int_result(0);
				setState(70);
				match(RIGHT_RBRACKET);
				((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).int_result.info;
				}
				break;
			case INT:
				{
				setState(73);
				((Int_resultContext)_localctx).int_t = int_t();
				((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,((Int_resultContext)_localctx).int_t.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						_localctx.i1 = _prevctx;
						_localctx.i1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						match(EXP);
						setState(80);
						((Int_resultContext)_localctx).i2 = ((Int_resultContext)_localctx).int_result = int_result(6);

						          	if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR && ((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Int_resultContext)_localctx).i1.info.getContent()) + "; " + ((String) ((Int_resultContext)_localctx).i2.info.getContent()));
						          	else if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).i1.info;
						          	else if(((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).i2.info;
						          	else 
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE, (int) Math.pow((int)((Int_resultContext)_localctx).i1.info.getContent(),(int)((Int_resultContext)_localctx).i2.info.getContent()));
						          
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						_localctx.i1 = _prevctx;
						_localctx.i1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(83);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(84);
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
						setState(85);
						((Int_resultContext)_localctx).i2 = ((Int_resultContext)_localctx).int_result = int_result(5);

						          	if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR && ((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Int_resultContext)_localctx).i1.info.getContent()) + "; " + ((String) ((Int_resultContext)_localctx).i2.info.getContent()));
						          	else if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).i1.info;
						          	else if(((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).i2.info;
						          	else if(getVocabulary().getSymbolicName((((Int_resultContext)_localctx).signo!=null?((Int_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Int_resultContext)_localctx).i1.info.getContent()*(Integer)((Int_resultContext)_localctx).i2.info.getContent());
						          	else{
						          		if((Integer)((Int_resultContext)_localctx).i2.info.getContent()==0)
						          			((Int_resultContext)_localctx).info =  new VarInfo(VarInfo.ERROR,"División por 0");
						          		else if(getVocabulary().getSymbolicName((((Int_resultContext)_localctx).signo!=null?((Int_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						          			((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Int_resultContext)_localctx).i1.info.getContent()/(Integer)((Int_resultContext)_localctx).i2.info.getContent());
						          		else
						          			((Int_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Int_resultContext)_localctx).i1.info.getContent()%(Integer)((Int_resultContext)_localctx).i2.info.getContent());
						          	}
						          
						}
						break;
					case 3:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						_localctx.i1 = _prevctx;
						_localctx.i1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
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
						setState(90);
						((Int_resultContext)_localctx).i2 = ((Int_resultContext)_localctx).int_result = int_result(4);

						          	if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR && ((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Int_resultContext)_localctx).i1.info.getContent()) + "; " + ((String) ((Int_resultContext)_localctx).i2.info.getContent()));
						          	else if(((Int_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).i1.info;
						          	else if(((Int_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Int_resultContext)_localctx).info = ((Int_resultContext)_localctx).i2.info;
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
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public Float_resultContext f2;
		public Float_resultContext float_result;
		public Token signo;
		public Float_tContext float_t;
		public Int_resultContext i2;
		public TerminalNode EXP() { return getToken(rubyParser.EXP, 0); }
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
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				((Float_resultContext)_localctx).i1 = int_result(0);
				setState(100);
				match(EXP);
				setState(101);
				((Float_resultContext)_localctx).f2 = ((Float_resultContext)_localctx).float_result = float_result(10);

					if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).i1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).f2.info.getContent()));
					else if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).i1.info;
					else if(((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f2.info;
					else 
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE, (double) Math.pow((int)((Float_resultContext)_localctx).i1.info.getContent(),(double)((Float_resultContext)_localctx).f2.info.getContent()));

				}
				break;
			case 2:
				{
				setState(104);
				((Float_resultContext)_localctx).i1 = int_result(0);
				setState(105);
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
				setState(106);
				((Float_resultContext)_localctx).f2 = ((Float_resultContext)_localctx).float_result = float_result(7);

					if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).i1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).f2.info.getContent()));
					else if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).i1.info;
					else if(((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f2.info;
					else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double) ((Float_resultContext)_localctx).i1.info.getContent()* (Double) ((Float_resultContext)_localctx).f2.info.getContent());
					else{
						if((Double)((Float_resultContext)_localctx).f2.info.getContent()==0)
							((Float_resultContext)_localctx).info =  new VarInfo(VarInfo.ERROR,"División por 0");
						else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("DIV"))
							((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Float_resultContext)_localctx).i1.info.getContent()/(Double)((Float_resultContext)_localctx).f2.info.getContent());
						else
							((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Float_resultContext)_localctx).i1.info.getContent()%(Double)((Float_resultContext)_localctx).f2.info.getContent());
					}

				}
				break;
			case 3:
				{
				setState(109);
				((Float_resultContext)_localctx).i1 = int_result(0);
				setState(110);
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
				setState(111);
				((Float_resultContext)_localctx).f2 = ((Float_resultContext)_localctx).float_result = float_result(4);

					if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).i1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).f2.info.getContent()));
					else if(((Float_resultContext)_localctx).i1.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).i1.info;
					else if(((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f2.info;
					else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("PLUS"))
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Float_resultContext)_localctx).i1.info.getContent()+(Double)((Float_resultContext)_localctx).f2.info.getContent());
					else{
						((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Integer)((Float_resultContext)_localctx).i1.info.getContent()-(Double)((Float_resultContext)_localctx).f2.info.getContent());
					}

				}
				break;
			case 4:
				{
				setState(114);
				match(LEFT_RBRACKET);
				setState(115);
				((Float_resultContext)_localctx).float_result = float_result(0);
				setState(116);
				match(RIGHT_RBRACKET);
				((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).float_result.info;
				}
				break;
			case 5:
				{
				setState(119);
				((Float_resultContext)_localctx).float_t = float_t();
				((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,((Float_resultContext)_localctx).float_t.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(124);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(125);
						match(EXP);
						setState(126);
						((Float_resultContext)_localctx).f2 = ((Float_resultContext)_localctx).float_result = float_result(12);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).f1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).f2.info.getContent()));
						          	else if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f1.info;
						          	else if(((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f2.info;
						          	else 
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE, (double) Math.pow((double)((Float_resultContext)_localctx).f1.info.getContent(),(double)((Float_resultContext)_localctx).f2.info.getContent()));
						          
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(129);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(130);
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
						setState(131);
						((Float_resultContext)_localctx).f2 = ((Float_resultContext)_localctx).float_result = float_result(9);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).f1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).f2.info.getContent()));
						          	else if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f1.info;
						          	else if(((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f2.info;
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double) ((Float_resultContext)_localctx).f1.info.getContent()* (Double) ((Float_resultContext)_localctx).f2.info.getContent());
						          	else{
						          		if((Double)((Float_resultContext)_localctx).f2.info.getContent()==0)
						          			((Float_resultContext)_localctx).info =  new VarInfo(VarInfo.ERROR,"División por 0");
						          		else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						          			((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()/(Double)((Float_resultContext)_localctx).f2.info.getContent());
						          		else
						          			((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()%(Double)((Float_resultContext)_localctx).f2.info.getContent());
						          	}
						          
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(134);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(135);
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
						setState(136);
						((Float_resultContext)_localctx).f2 = ((Float_resultContext)_localctx).float_result = float_result(6);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).f1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).f2.info.getContent()));
						          	else if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f1.info;
						          	else if(((Float_resultContext)_localctx).f2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f2.info;
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("PLUS"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()+(Double)((Float_resultContext)_localctx).f2.info.getContent());
						          	else{
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()-(Double)((Float_resultContext)_localctx).f2.info.getContent());
						          	}
						          
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(139);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(140);
						match(EXP);
						setState(141);
						((Float_resultContext)_localctx).i2 = int_result(0);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).f1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).i2.info.getContent()));
						          	else if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f1.info;
						          	else if(((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).i2.info;
						          	else 
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE, (double) Math.pow((double)((Float_resultContext)_localctx).f1.info.getContent(),(int)((Float_resultContext)_localctx).i2.info.getContent()));
						          
						}
						break;
					case 5:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
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
						setState(146);
						((Float_resultContext)_localctx).i2 = int_result(0);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).f1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).i2.info.getContent()));
						          	else if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f1.info;
						          	else if(((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).i2.info;
						          	else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("MUL"))
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.FLOAT_TYPE,(Double) ((Float_resultContext)_localctx).f1.info.getContent()* (Double) ((Float_resultContext)_localctx).i2.info.getContent());
						          	else{
						          		if((Integer)((Float_resultContext)_localctx).i2.info.getContent()==0)
						          			((Float_resultContext)_localctx).info =  new VarInfo(VarInfo.ERROR,"División por 0");
						          		else if(getVocabulary().getSymbolicName((((Float_resultContext)_localctx).signo!=null?((Float_resultContext)_localctx).signo.getType():0)).equals("DIV"))
						          			((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()/(Integer)((Float_resultContext)_localctx).i2.info.getContent());
						          		else
						          			((Float_resultContext)_localctx).info = new VarInfo(VarInfo.INT_TYPE,(Double)((Float_resultContext)_localctx).f1.info.getContent()%(Integer)((Float_resultContext)_localctx).i2.info.getContent());
						          	}
						          
						}
						break;
					case 6:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
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
						setState(151);
						((Float_resultContext)_localctx).i2 = int_result(0);

						          	if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR && ((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((Float_resultContext)_localctx).f1.info.getContent()) + "; " + ((String) ((Float_resultContext)_localctx).i2.info.getContent()));
						          	else if(((Float_resultContext)_localctx).f1.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).f1.info;
						          	else if(((Float_resultContext)_localctx).i2.info.getType()==VarInfo.ERROR)
						          		((Float_resultContext)_localctx).info = ((Float_resultContext)_localctx).i2.info;
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
				setState(158);
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
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(160);
				((String_resultContext)_localctx).int_result = int_result(0);
				setState(161);
				match(MUL);
				setState(162);
				((String_resultContext)_localctx).string_result = string_result(3);

					if(((String_resultContext)_localctx).int_result.info.getType()==VarInfo.ERROR && ((String_resultContext)_localctx).string_result.info.getType()==VarInfo.ERROR)
						((String_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((String_resultContext)_localctx).int_result.info.getContent()) + "; " + ((String) ((String_resultContext)_localctx).string_result.info.getContent()));
					else if(((String_resultContext)_localctx).int_result.info.getType()==VarInfo.ERROR)
						((String_resultContext)_localctx).info = ((String_resultContext)_localctx).int_result.info;
					else if(((String_resultContext)_localctx).string_result.info.getType()==VarInfo.ERROR)
						((String_resultContext)_localctx).info = ((String_resultContext)_localctx).string_result.info;
					else{
						int n=(Integer) ((String_resultContext)_localctx).int_result.info.getContent();
						String s=(String) ((String_resultContext)_localctx).string_result.info.getContent();
						if(n<0)
							((String_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, "Un String no se puede multiplicar por un número negativo");
						else{
							String f="";
							for(int i=0;i<n;i++){
								f+=s;
							}
							((String_resultContext)_localctx).info = new VarInfo(VarInfo.STRING_TYPE,f);
						}
					}

				}
				break;
			case 2:
				{
				setState(165);
				match(LEFT_RBRACKET);
				setState(166);
				((String_resultContext)_localctx).string_result = string_result(0);
				setState(167);
				match(RIGHT_RBRACKET);
				((String_resultContext)_localctx).info = ((String_resultContext)_localctx).string_result.info;
				}
				break;
			case 3:
				{
				setState(170);
				((String_resultContext)_localctx).literal_t = literal_t();
				((String_resultContext)_localctx).info = new VarInfo(VarInfo.STRING_TYPE, (((String_resultContext)_localctx).literal_t!=null?_input.getText(((String_resultContext)_localctx).literal_t.start,((String_resultContext)_localctx).literal_t.stop):null).substring(1,(((String_resultContext)_localctx).literal_t!=null?_input.getText(((String_resultContext)_localctx).literal_t.start,((String_resultContext)_localctx).literal_t.stop):null).length()-1));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_resultContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_result);
					setState(175);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(176);
					match(MUL);
					setState(177);
					((String_resultContext)_localctx).int_result = int_result(0);

					          	if(((String_resultContext)_localctx).int_result.info.getType()==VarInfo.ERROR && ((String_resultContext)_localctx).string_result.info.getType()==VarInfo.ERROR)
					          		((String_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((String_resultContext)_localctx).int_result.info.getContent()) + "; " + ((String) ((String_resultContext)_localctx).string_result.info.getContent()));
					          	else if(((String_resultContext)_localctx).int_result.info.getType()==VarInfo.ERROR)
					          		((String_resultContext)_localctx).info = ((String_resultContext)_localctx).int_result.info;
					          	else if(((String_resultContext)_localctx).string_result.info.getType()==VarInfo.ERROR)
					          		((String_resultContext)_localctx).info = ((String_resultContext)_localctx).string_result.info;
					          	else{
					          		int n=(Integer) ((String_resultContext)_localctx).int_result.info.getContent();
					          		String s=(String) ((String_resultContext)_localctx).string_result.info.getContent();
					          		if(n<0)
					          			((String_resultContext)_localctx).info = new VarInfo(VarInfo.ERROR, "Un String no se puede multiplicar por un número negativo");
					          		else{
					          			String f="";
					          			for(int i=0;i<n;i++){
					          				f+=s;
					          			}
					          			((String_resultContext)_localctx).info = new VarInfo(VarInfo.STRING_TYPE,f);
					          		}
					          	}
					          
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 14, RULE_lvalue);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				id();
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_rvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(190);
				((RvalueContext)_localctx).lvalue = lvalue();
				if(varTable.containsKey((((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null))) ((RvalueContext)_localctx).info = varTable.get((((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null)); else ((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR,"Variable utilizada sin inicializar: "+(((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null));
				}
				break;
			case 2:
				{
				setState(193);
				((RvalueContext)_localctx).int_result = int_result(0);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).int_result.info;
				}
				break;
			case 3:
				{
				setState(196);
				((RvalueContext)_localctx).float_result = float_result(0);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).float_result.info;
				}
				break;
			case 4:
				{
				setState(199);
				((RvalueContext)_localctx).string_result = string_result(0);
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).string_result.info;
				}
				break;
			case 5:
				{
				setState(202);
				((RvalueContext)_localctx).assignment = assignment();
				((RvalueContext)_localctx).info = ((RvalueContext)_localctx).assignment.info;
				}
				break;
			case 6:
				{
				setState(205);
				((RvalueContext)_localctx).bool_t = bool_t();
				((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,((RvalueContext)_localctx).bool_t.value);
				}
				break;
			case 7:
				{
				setState(208);
				nil_t();
				((RvalueContext)_localctx).info = new VarInfo(VarInfo.NIL_TYPE,null);
				}
				break;
			case 8:
				{
				setState(211);
				match(NOT);
				setState(212);
				((RvalueContext)_localctx).rvalue = rvalue(4);

					if(((RvalueContext)_localctx).rvalue.info.getType()==VarInfo.ERROR)
						((RvalueContext)_localctx).info = ((RvalueContext)_localctx).rvalue.info;
					else
						((RvalueContext)_localctx).info = new VarInfo(VarInfo.BOOL_TYPE,!getBoolean(((RvalueContext)_localctx).rvalue.info));

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						int selector=0;
						setState(226);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS:
							{
							setState(219);
							match(LESS);
							}
							break;
						case GREATER:
							{
							setState(220);
							match(GREATER);
							selector=1;
							}
							break;
						case LESS_EQUAL:
							{
							setState(222);
							match(LESS_EQUAL);
							selector=2;
							}
							break;
						case GREATER_EQUAL:
							{
							setState(224);
							match(GREATER_EQUAL);
							selector=3;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(228);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(4);

						          	boolean val=false;
						          	if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR && ((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = new VarInfo(VarInfo.ERROR, ((String) ((RvalueContext)_localctx).r1.info.getContent()) + "; " + ((String) ((RvalueContext)_localctx).r2.info.getContent()));
						          	else if(((RvalueContext)_localctx).r1.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = ((RvalueContext)_localctx).r1.info;
						          	else if(((RvalueContext)_localctx).r2.info.getType()==VarInfo.ERROR)
						          		((RvalueContext)_localctx).info = ((RvalueContext)_localctx).r2.info;
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
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						boolean eq=false;
						setState(236);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(233);
							match(EQUAL);
							eq=true;
							}
							break;
						case NOT_EQUAL:
							{
							setState(235);
							match(NOT_EQUAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(238);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(3);

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
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.r1 = _prevctx;
						_localctx.r1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(241);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						boolean modeOr=false;
						setState(246);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OR:
							{
							setState(243);
							match(OR);
							modeOr=false;
							}
							break;
						case AND:
							{
							setState(245);
							match(AND);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(248);
						((RvalueContext)_localctx).r2 = ((RvalueContext)_localctx).rvalue = rvalue(2);

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
				setState(255);
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
		enterRule(_localctx, 18, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 20, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 22, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 24, RULE_bool_t);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(TRUE);
				((Bool_tContext)_localctx).value = true;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		enterRule(_localctx, 26, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 28, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		enterRule(_localctx, 30, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 32, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(279);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(280);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(285);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(286);
						crlf();
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 36, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		case 4:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 5:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 6:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 8:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 17:
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
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n"+
		"\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5D\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00b7\n\b\f\b\16\b\u00ba\13\b\3\t\3\t\5\t\u00be\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00da\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00e5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ef\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00f9\n\n\3\n\3\n\3\n\7\n\u00fe\n\n\f\n\16\n\u0101"+
		"\13\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u010f"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u011c"+
		"\n\23\3\23\3\23\3\23\3\23\7\23\u0122\n\23\f\23\16\23\u0125\13\23\3\24"+
		"\3\24\3\24\2\b\4\n\f\16\22$\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\5\3\2&+\3\2\33\35\3\2\31\32\u013c\2(\3\2\2\2\4*\3\2\2\2\6\67\3"+
		"\2\2\2\bC\3\2\2\2\nN\3\2\2\2\f|\3\2\2\2\16\u00af\3\2\2\2\20\u00bd\3\2"+
		"\2\2\22\u00d9\3\2\2\2\24\u0102\3\2\2\2\26\u0104\3\2\2\2\30\u0107\3\2\2"+
		"\2\32\u010e\3\2\2\2\34\u0110\3\2\2\2\36\u0112\3\2\2\2 \u0114\3\2\2\2\""+
		"\u0116\3\2\2\2$\u011b\3\2\2\2&\u0126\3\2\2\2()\5\4\3\2)\3\3\2\2\2*+\b"+
		"\3\1\2+,\5\6\4\2,-\5$\23\2-\64\3\2\2\2./\f\4\2\2/\60\5\6\4\2\60\61\5$"+
		"\23\2\61\63\3\2\2\2\62.\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\5\22\n\289\b\4\1\29\7\3\2\2\2:;\5"+
		"\20\t\2;<\7%\2\2<=\5\22\n\2=>\b\5\1\2>D\3\2\2\2?@\5\20\t\2@A\t\2\2\2A"+
		"B\5\22\n\2BD\3\2\2\2C:\3\2\2\2C?\3\2\2\2D\t\3\2\2\2EF\b\6\1\2FG\7\65\2"+
		"\2GH\5\n\6\2HI\7\66\2\2IJ\b\6\1\2JO\3\2\2\2KL\5\30\r\2LM\b\6\1\2MO\3\2"+
		"\2\2NE\3\2\2\2NK\3\2\2\2Oa\3\2\2\2PQ\f\7\2\2QR\7\36\2\2RS\5\n\6\bST\b"+
		"\6\1\2T`\3\2\2\2UV\f\6\2\2VW\t\3\2\2WX\5\n\6\7XY\b\6\1\2Y`\3\2\2\2Z[\f"+
		"\5\2\2[\\\t\4\2\2\\]\5\n\6\6]^\b\6\1\2^`\3\2\2\2_P\3\2\2\2_U\3\2\2\2_"+
		"Z\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2ca\3\2\2\2de\b\7\1"+
		"\2ef\5\n\6\2fg\7\36\2\2gh\5\f\7\fhi\b\7\1\2i}\3\2\2\2jk\5\n\6\2kl\t\3"+
		"\2\2lm\5\f\7\tmn\b\7\1\2n}\3\2\2\2op\5\n\6\2pq\t\4\2\2qr\5\f\7\6rs\b\7"+
		"\1\2s}\3\2\2\2tu\7\65\2\2uv\5\f\7\2vw\7\66\2\2wx\b\7\1\2x}\3\2\2\2yz\5"+
		"\26\f\2z{\b\7\1\2{}\3\2\2\2|d\3\2\2\2|j\3\2\2\2|o\3\2\2\2|t\3\2\2\2|y"+
		"\3\2\2\2}\u009e\3\2\2\2~\177\f\r\2\2\177\u0080\7\36\2\2\u0080\u0081\5"+
		"\f\7\16\u0081\u0082\b\7\1\2\u0082\u009d\3\2\2\2\u0083\u0084\f\n\2\2\u0084"+
		"\u0085\t\3\2\2\u0085\u0086\5\f\7\13\u0086\u0087\b\7\1\2\u0087\u009d\3"+
		"\2\2\2\u0088\u0089\f\7\2\2\u0089\u008a\t\4\2\2\u008a\u008b\5\f\7\b\u008b"+
		"\u008c\b\7\1\2\u008c\u009d\3\2\2\2\u008d\u008e\f\13\2\2\u008e\u008f\7"+
		"\36\2\2\u008f\u0090\5\n\6\2\u0090\u0091\b\7\1\2\u0091\u009d\3\2\2\2\u0092"+
		"\u0093\f\b\2\2\u0093\u0094\t\3\2\2\u0094\u0095\5\n\6\2\u0095\u0096\b\7"+
		"\1\2\u0096\u009d\3\2\2\2\u0097\u0098\f\5\2\2\u0098\u0099\t\4\2\2\u0099"+
		"\u009a\5\n\6\2\u009a\u009b\b\7\1\2\u009b\u009d\3\2\2\2\u009c~\3\2\2\2"+
		"\u009c\u0083\3\2\2\2\u009c\u0088\3\2\2\2\u009c\u008d\3\2\2\2\u009c\u0092"+
		"\3\2\2\2\u009c\u0097\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\r\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\b\1\2"+
		"\u00a2\u00a3\5\n\6\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\5\16\b\5\u00a5\u00a6"+
		"\b\b\1\2\u00a6\u00b0\3\2\2\2\u00a7\u00a8\7\65\2\2\u00a8\u00a9\5\16\b\2"+
		"\u00a9\u00aa\7\66\2\2\u00aa\u00ab\b\b\1\2\u00ab\u00b0\3\2\2\2\u00ac\u00ad"+
		"\5\24\13\2\u00ad\u00ae\b\b\1\2\u00ae\u00b0\3\2\2\2\u00af\u00a1\3\2\2\2"+
		"\u00af\u00a7\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2"+
		"\f\6\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\b\b\1\2"+
		"\u00b5\u00b7\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\17\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00be\5\36\20\2\u00bc\u00be\5 \21\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\21\3\2\2\2\u00bf\u00c0\b\n\1\2\u00c0\u00c1\5\20\t\2\u00c1"+
		"\u00c2\b\n\1\2\u00c2\u00da\3\2\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\b\n"+
		"\1\2\u00c5\u00da\3\2\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\b\n\1\2\u00c8"+
		"\u00da\3\2\2\2\u00c9\u00ca\5\16\b\2\u00ca\u00cb\b\n\1\2\u00cb\u00da\3"+
		"\2\2\2\u00cc\u00cd\5\b\5\2\u00cd\u00ce\b\n\1\2\u00ce\u00da\3\2\2\2\u00cf"+
		"\u00d0\5\32\16\2\u00d0\u00d1\b\n\1\2\u00d1\u00da\3\2\2\2\u00d2\u00d3\5"+
		"\34\17\2\u00d3\u00d4\b\n\1\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\7\64\2\2"+
		"\u00d6\u00d7\5\22\n\6\u00d7\u00d8\b\n\1\2\u00d8\u00da\3\2\2\2\u00d9\u00bf"+
		"\3\2\2\2\u00d9\u00c3\3\2\2\2\u00d9\u00c6\3\2\2\2\u00d9\u00c9\3\2\2\2\u00d9"+
		"\u00cc\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d5\3\2"+
		"\2\2\u00da\u00ff\3\2\2\2\u00db\u00dc\f\5\2\2\u00dc\u00e4\b\n\1\2\u00dd"+
		"\u00e5\7\"\2\2\u00de\u00df\7!\2\2\u00df\u00e5\b\n\1\2\u00e0\u00e1\7#\2"+
		"\2\u00e1\u00e5\b\n\1\2\u00e2\u00e3\7$\2\2\u00e3\u00e5\b\n\1\2\u00e4\u00dd"+
		"\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\5\22\n\6\u00e7\u00e8\b\n\1\2\u00e8\u00fe\3"+
		"\2\2\2\u00e9\u00ea\f\4\2\2\u00ea\u00ee\b\n\1\2\u00eb\u00ec\7\37\2\2\u00ec"+
		"\u00ef\b\n\1\2\u00ed\u00ef\7 \2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\22\n\5\u00f1\u00f2\b\n\1\2\u00f2"+
		"\u00fe\3\2\2\2\u00f3\u00f4\f\3\2\2\u00f4\u00f8\b\n\1\2\u00f5\u00f6\7\63"+
		"\2\2\u00f6\u00f9\b\n\1\2\u00f7\u00f9\7\62\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5\22\n\4\u00fb\u00fc\b"+
		"\n\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00db\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd"+
		"\u00f3\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\23\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\4\2\2\u0103\25"+
		"\3\2\2\2\u0104\u0105\7>\2\2\u0105\u0106\b\f\1\2\u0106\27\3\2\2\2\u0107"+
		"\u0108\7=\2\2\u0108\u0109\b\r\1\2\u0109\31\3\2\2\2\u010a\u010b\7\27\2"+
		"\2\u010b\u010f\b\16\1\2\u010c\u010d\7\30\2\2\u010d\u010f\b\16\1\2\u010e"+
		"\u010a\3\2\2\2\u010e\u010c\3\2\2\2\u010f\33\3\2\2\2\u0110\u0111\79\2\2"+
		"\u0111\35\3\2\2\2\u0112\u0113\7?\2\2\u0113\37\3\2\2\2\u0114\u0115\7@\2"+
		"\2\u0115!\3\2\2\2\u0116\u0117\7A\2\2\u0117#\3\2\2\2\u0118\u0119\b\23\1"+
		"\2\u0119\u011c\7\6\2\2\u011a\u011c\5&\24\2\u011b\u0118\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u0123\3\2\2\2\u011d\u011e\f\6\2\2\u011e\u0122\7\6\2\2\u011f"+
		"\u0120\f\5\2\2\u0120\u0122\5&\24\2\u0121\u011d\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"%\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\7\2\2\u0127\'\3\2\2\2\27\64"+
		"CN_a|\u009c\u009e\u00af\u00b8\u00bd\u00d9\u00e4\u00ee\u00f8\u00fd\u00ff"+
		"\u010e\u011b\u0121\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}