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
	 * Enter a parse tree produced by {@link rubyParser#require_block}.
	 * @param ctx the parse tree
	 */
	void enterRequire_block(rubyParser.Require_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#require_block}.
	 * @param ctx the parse tree
	 */
	void exitRequire_block(rubyParser.Require_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(rubyParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(rubyParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(rubyParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(rubyParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(rubyParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(rubyParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(rubyParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(rubyParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(rubyParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(rubyParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(rubyParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(rubyParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(rubyParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(rubyParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(rubyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(rubyParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(rubyParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(rubyParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(rubyParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(rubyParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(rubyParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(rubyParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(rubyParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(rubyParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(rubyParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(rubyParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(rubyParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(rubyParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#while_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expression_list(rubyParser.While_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#while_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expression_list(rubyParser.While_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(rubyParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(rubyParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#for_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_expression_list(rubyParser.For_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#for_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_expression_list(rubyParser.For_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#when_list}.
	 * @param ctx the parse tree
	 */
	void enterWhen_list(rubyParser.When_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#when_list}.
	 * @param ctx the parse tree
	 */
	void exitWhen_list(rubyParser.When_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#rvalue_list}.
	 * @param ctx the parse tree
	 */
	void enterRvalue_list(rubyParser.Rvalue_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#rvalue_list}.
	 * @param ctx the parse tree
	 */
	void exitRvalue_list(rubyParser.Rvalue_listContext ctx);
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
	 * Enter a parse tree produced by {@link rubyParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(rubyParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(rubyParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(rubyParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(rubyParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(rubyParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(rubyParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rubyParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(rubyParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rubyParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(rubyParser.Array_selectorContext ctx);
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