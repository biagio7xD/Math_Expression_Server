// Generated from /Users/biagiolicari/Documents/ap_project_Licari/ap_project/src/it/units/project/support/antlr/RequestGrammar.g4 by ANTLR 4.9.1
package it.units.project.support.antlr.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RequestGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface RequestGrammarVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#parse}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitParse(RequestGrammarParser.ParseContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCommand(RequestGrammarParser.CommandContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#quitRequest}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitQuitRequest(RequestGrammarParser.QuitRequestContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#statRequest}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatRequest(RequestGrammarParser.StatRequestContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#statReqsCommand}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatReqsCommand(RequestGrammarParser.StatReqsCommandContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#statAvgCommand}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatAvgCommand(RequestGrammarParser.StatAvgCommandContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#statMaxCommand}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatMaxCommand(RequestGrammarParser.StatMaxCommandContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#computationRequest}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComputationRequest(RequestGrammarParser.ComputationRequestContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#computationType}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComputationType(RequestGrammarParser.ComputationTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#valuesType}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitValuesType(RequestGrammarParser.ValuesTypeContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#variableValuesFunction}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariableValuesFunction(RequestGrammarParser.VariableValuesFunctionContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#variableValues}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariableValues(RequestGrammarParser.VariableValuesContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#variableLowerValue}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariableLowerValue(RequestGrammarParser.VariableLowerValueContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#variableStepValue}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariableStepValue(RequestGrammarParser.VariableStepValueContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#variableUpperValue}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariableUpperValue(RequestGrammarParser.VariableUpperValueContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#javaNumber}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJavaNumber(RequestGrammarParser.JavaNumberContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#javaNumberExponential}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJavaNumberExponential(RequestGrammarParser.JavaNumberExponentialContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#javaNumberSign}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitJavaNumberSign(RequestGrammarParser.JavaNumberSignContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#expressions}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpressions(RequestGrammarParser.ExpressionsContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExpression(RequestGrammarParser.ExpressionContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#operator}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOperator(RequestGrammarParser.OperatorContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariable(RequestGrammarParser.VariableContext ctx);

  /**
   * Visit a parse tree produced by {@link RequestGrammarParser#number}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumber(RequestGrammarParser.NumberContext ctx);
}