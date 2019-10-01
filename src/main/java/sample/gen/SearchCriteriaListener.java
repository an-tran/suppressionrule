// Generated from D:/project/suppressionrule/src/main/java/sample\SearchCriteria.g4 by ANTLR 4.7
package sample.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SearchCriteriaParser}.
 */
public interface SearchCriteriaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(SearchCriteriaParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(SearchCriteriaParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SearchCriteriaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SearchCriteriaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(SearchCriteriaParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(SearchCriteriaParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#negationExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpr(SearchCriteriaParser.NegationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#negationExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpr(SearchCriteriaParser.NegationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(SearchCriteriaParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(SearchCriteriaParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(SearchCriteriaParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(SearchCriteriaParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(SearchCriteriaParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(SearchCriteriaParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(SearchCriteriaParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(SearchCriteriaParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(SearchCriteriaParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(SearchCriteriaParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiTermsValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void enterMultiTermsValue(SearchCriteriaParser.MultiTermsValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiTermsValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void exitMultiTermsValue(SearchCriteriaParser.MultiTermsValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void enterRangeValue(SearchCriteriaParser.RangeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 */
	void exitRangeValue(SearchCriteriaParser.RangeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#negationOp}.
	 * @param ctx the parse tree
	 */
	void enterNegationOp(SearchCriteriaParser.NegationOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#negationOp}.
	 * @param ctx the parse tree
	 */
	void exitNegationOp(SearchCriteriaParser.NegationOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(SearchCriteriaParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(SearchCriteriaParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#andOp}.
	 * @param ctx the parse tree
	 */
	void enterAndOp(SearchCriteriaParser.AndOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#andOp}.
	 * @param ctx the parse tree
	 */
	void exitAndOp(SearchCriteriaParser.AndOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchCriteriaParser#orOp}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(SearchCriteriaParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchCriteriaParser#orOp}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(SearchCriteriaParser.OrOpContext ctx);
}