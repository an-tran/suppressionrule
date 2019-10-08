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
    public Integer visitId(ExprParser.IdContext ctx) {
        return 0;
    }

    @Override
    public Integer visitInt(ExprParser.IntContext ctx) {
        System.out.println(ctx.getText());
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Integer visitPlus(ExprParser.PlusContext ctx) {
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
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
//        System.out.println(tree.toStringTree(parser));
    }
}