// Generated from /Users/biagiolicari/Documents/TEST/ap_project_LicariTEST/Math_Expression_Server/src/it/units/project/support/antlr/RequestGrammar.g4 by ANTLR 4.9.1
package it.units.project.support.antlr.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RequestGrammarParser}.
 */
public interface RequestGrammarListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#parse}.
   *
   * @param ctx the parse tree
   */
  void enterParse(RequestGrammarParser.ParseContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#parse}.
   *
   * @param ctx the parse tree
   */
  void exitParse(RequestGrammarParser.ParseContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#command}.
   *
   * @param ctx the parse tree
   */
  void enterCommand(RequestGrammarParser.CommandContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#command}.
   *
   * @param ctx the parse tree
   */
  void exitCommand(RequestGrammarParser.CommandContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#quitRequest}.
   *
   * @param ctx the parse tree
   */
  void enterQuitRequest(RequestGrammarParser.QuitRequestContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#quitRequest}.
   *
   * @param ctx the parse tree
   */
  void exitQuitRequest(RequestGrammarParser.QuitRequestContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#statRequest}.
   *
   * @param ctx the parse tree
   */
  void enterStatRequest(RequestGrammarParser.StatRequestContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#statRequest}.
   *
   * @param ctx the parse tree
   */
  void exitStatRequest(RequestGrammarParser.StatRequestContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#statReqsCommand}.
   *
   * @param ctx the parse tree
   */
  void enterStatReqsCommand(RequestGrammarParser.StatReqsCommandContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#statReqsCommand}.
   *
   * @param ctx the parse tree
   */
  void exitStatReqsCommand(RequestGrammarParser.StatReqsCommandContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#statAvgCommand}.
   *
   * @param ctx the parse tree
   */
  void enterStatAvgCommand(RequestGrammarParser.StatAvgCommandContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#statAvgCommand}.
   *
   * @param ctx the parse tree
   */
  void exitStatAvgCommand(RequestGrammarParser.StatAvgCommandContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#statMaxCommand}.
   *
   * @param ctx the parse tree
   */
  void enterStatMaxCommand(RequestGrammarParser.StatMaxCommandContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#statMaxCommand}.
   *
   * @param ctx the parse tree
   */
  void exitStatMaxCommand(RequestGrammarParser.StatMaxCommandContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#computationRequest}.
   *
   * @param ctx the parse tree
   */
  void enterComputationRequest(RequestGrammarParser.ComputationRequestContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#computationRequest}.
   *
   * @param ctx the parse tree
   */
  void exitComputationRequest(RequestGrammarParser.ComputationRequestContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#computationKind}.
   *
   * @param ctx the parse tree
   */
  void enterComputationKind(RequestGrammarParser.ComputationKindContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#computationKind}.
   *
   * @param ctx the parse tree
   */
  void exitComputationKind(RequestGrammarParser.ComputationKindContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#valuesKind}.
   *
   * @param ctx the parse tree
   */
  void enterValuesKind(RequestGrammarParser.ValuesKindContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#valuesKind}.
   *
   * @param ctx the parse tree
   */
  void exitValuesKind(RequestGrammarParser.ValuesKindContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#variableValuesFunction}.
   *
   * @param ctx the parse tree
   */
  void enterVariableValuesFunction(RequestGrammarParser.VariableValuesFunctionContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#variableValuesFunction}.
   *
   * @param ctx the parse tree
   */
  void exitVariableValuesFunction(RequestGrammarParser.VariableValuesFunctionContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#variableValues}.
   *
   * @param ctx the parse tree
   */
  void enterVariableValues(RequestGrammarParser.VariableValuesContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#variableValues}.
   *
   * @param ctx the parse tree
   */
  void exitVariableValues(RequestGrammarParser.VariableValuesContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#variableLowerValue}.
   *
   * @param ctx the parse tree
   */
  void enterVariableLowerValue(RequestGrammarParser.VariableLowerValueContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#variableLowerValue}.
   *
   * @param ctx the parse tree
   */
  void exitVariableLowerValue(RequestGrammarParser.VariableLowerValueContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#variableStepValue}.
   *
   * @param ctx the parse tree
   */
  void enterVariableStepValue(RequestGrammarParser.VariableStepValueContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#variableStepValue}.
   *
   * @param ctx the parse tree
   */
  void exitVariableStepValue(RequestGrammarParser.VariableStepValueContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#variableUpperValue}.
   *
   * @param ctx the parse tree
   */
  void enterVariableUpperValue(RequestGrammarParser.VariableUpperValueContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#variableUpperValue}.
   *
   * @param ctx the parse tree
   */
  void exitVariableUpperValue(RequestGrammarParser.VariableUpperValueContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#javaNumber}.
   *
   * @param ctx the parse tree
   */
  void enterJavaNumber(RequestGrammarParser.JavaNumberContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#javaNumber}.
   *
   * @param ctx the parse tree
   */
  void exitJavaNumber(RequestGrammarParser.JavaNumberContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#javaNumberExponential}.
   *
   * @param ctx the parse tree
   */
  void enterJavaNumberExponential(RequestGrammarParser.JavaNumberExponentialContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#javaNumberExponential}.
   *
   * @param ctx the parse tree
   */
  void exitJavaNumberExponential(RequestGrammarParser.JavaNumberExponentialContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#javaNumberSign}.
   *
   * @param ctx the parse tree
   */
  void enterJavaNumberSign(RequestGrammarParser.JavaNumberSignContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#javaNumberSign}.
   *
   * @param ctx the parse tree
   */
  void exitJavaNumberSign(RequestGrammarParser.JavaNumberSignContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#expressions}.
   *
   * @param ctx the parse tree
   */
  void enterExpressions(RequestGrammarParser.ExpressionsContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#expressions}.
   *
   * @param ctx the parse tree
   */
  void exitExpressions(RequestGrammarParser.ExpressionsContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterExpression(RequestGrammarParser.ExpressionContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitExpression(RequestGrammarParser.ExpressionContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#operator}.
   *
   * @param ctx the parse tree
   */
  void enterOperator(RequestGrammarParser.OperatorContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#operator}.
   *
   * @param ctx the parse tree
   */
  void exitOperator(RequestGrammarParser.OperatorContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#variable}.
   *
   * @param ctx the parse tree
   */
  void enterVariable(RequestGrammarParser.VariableContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#variable}.
   *
   * @param ctx the parse tree
   */
  void exitVariable(RequestGrammarParser.VariableContext ctx);

  /**
   * Enter a parse tree produced by {@link RequestGrammarParser#number}.
   *
   * @param ctx the parse tree
   */
  void enterNumber(RequestGrammarParser.NumberContext ctx);

  /**
   * Exit a parse tree produced by {@link RequestGrammarParser#number}.
   *
   * @param ctx the parse tree
   */
  void exitNumber(RequestGrammarParser.NumberContext ctx);
}