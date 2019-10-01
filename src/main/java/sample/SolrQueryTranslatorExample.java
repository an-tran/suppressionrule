package sample;

import sample.gen.SearchCriteriaBaseVisitor;
import sample.gen.SearchCriteriaParser;

import java.util.stream.Collectors;

/**
 * Created by antt on 10/1/2019.
 */
public class SolrQueryTranslatorExample extends SearchCriteriaBaseVisitor<String> {
    @Override
    public String visitKey(SearchCriteriaParser.KeyContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIntValue(SearchCriteriaParser.IntValueContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStringValue(SearchCriteriaParser.StringValueContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMultiTermsValue(SearchCriteriaParser.MultiTermsValueContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(String.join(" ",
                ctx.STRING().stream().map(node -> node.getText()).collect(Collectors.toList())));
        sb.append(" ");
        sb.append(String.join(" ",
                ctx.INT().stream().map(node -> node.getText()).collect(Collectors.toList())));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitPair(SearchCriteriaParser.PairContext ctx) {
        return visit(ctx.key()) + ":" + visit(ctx.val());
    }

    @Override
    public String visitBoolExpr(SearchCriteriaParser.BoolExprContext ctx) {
        StringBuilder sb = new StringBuilder();
        String first = visit(ctx.negationExpr(0));
        sb.append(first);
        for(int i = 0; i < ctx.boolOp().size(); i++) {
            sb.append(" ");
            sb.append(visitBoolOp(ctx.boolOp(i)));
            sb.append(visit(ctx.negationExpr(i+1)));
        }
        return sb.toString();
    }

    @Override
    public String visitAndOp(SearchCriteriaParser.AndOpContext ctx) {
        return "AND ";
    }

    @Override
    public String visitOrOp(SearchCriteriaParser.OrOpContext ctx) {
        return "OR ";
    }
}