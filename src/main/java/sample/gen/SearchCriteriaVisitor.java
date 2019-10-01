// Generated from D:/project/suppressionrule/src/main/java/sample\SearchCriteria.g4 by ANTLR 4.7
package sample.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SearchCriteriaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SearchCriteriaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(SearchCriteriaParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SearchCriteriaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(SearchCriteriaParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#negationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpr(SearchCriteriaParser.NegationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(SearchCriteriaParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(SearchCriteriaParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(SearchCriteriaParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(SearchCriteriaParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(SearchCriteriaParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiTermsValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiTermsValue(SearchCriteriaParser.MultiTermsValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeValue}
	 * labeled alternative in {@link SearchCriteriaParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeValue(SearchCriteriaParser.RangeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#negationOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationOp(SearchCriteriaParser.NegationOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(SearchCriteriaParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#andOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOp(SearchCriteriaParser.AndOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchCriteriaParser#orOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(SearchCriteriaParser.OrOpContext ctx);
}