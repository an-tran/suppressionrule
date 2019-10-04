package sample.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sample.expr.gen.ExprBaseVisitor;
import sample.expr.gen.ExprLexer;
import sample.expr.gen.ExprParser;

/**
 * Created by antt on 10/4/2019.
 */
public class EvalVisitor extends ExprBaseVisitor<Integer> {
    @Override
    public Integer visitExpr(ExprParser.ExprContext ctx) {
        if (ctx.ID() != null) {
            return 0;
        } else if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        } else {
            int op1 = visit(ctx.expr(0));
            int op2 = visit(ctx.expr(1));
            switch (ctx.op.getText()) {
                case "+":
                    return op1 + op2;
                case "-":
                    return op1 - op2;
                case "*":
                    return op1 * op2;
                case "/":
                    return op1 / op2;
                default:
                    throw new RuntimeException("Invalid operator " + ctx.op.getText());
            }
        }

    }

    @Override
    public Integer visitStat(ExprParser.StatContext ctx) {
        return visit(ctx.expr());
    }

    public static void main(String[] args) {
        ExprLexer lexer = new ExprLexer(CharStreams.fromString("1 + 2\r\n"));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        EvalVisitor v = new EvalVisitor();
        // traverse tree to eval expression
        System.out.println(v.visit(tree));
    }
}