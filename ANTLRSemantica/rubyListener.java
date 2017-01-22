// Generated from ruby.g4 by ANTLR 4.6

	import java.util.Hashtable;
	import java.lang.Math;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rubyParser}.
 */
public interface rubyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rubyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(rubyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(rubyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(rubyParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(rubyParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rubyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rubyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(rubyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(rubyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(rubyParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(rubyParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(rubyParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(rubyParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(rubyParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(rubyParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(rubyParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(rubyParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(rubyParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(rubyParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_t(rubyParser.Literal_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_t(rubyParser.Literal_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(rubyParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(rubyParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(rubyParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(rubyParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(rubyParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(rubyParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(rubyParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(rubyParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(rubyParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(rubyParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#id_global}.
	 * @param ctx the parse tree
	 */
	void enterId_global(rubyParser.Id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#id_global}.
	 * @param ctx the parse tree
	 */
	void exitId_global(rubyParser.Id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#id_function}.
	 * @param ctx the parse tree
	 */
	void enterId_function(rubyParser.Id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#id_function}.
	 * @param ctx the parse tree
	 */
	void exitId_function(rubyParser.Id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(rubyParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(rubyParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(rubyParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(rubyParser.CrlfContext ctx);
}