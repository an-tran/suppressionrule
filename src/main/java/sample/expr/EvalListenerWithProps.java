package sample.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sample.expr.gen.ExprBaseListener;
import sample.expr.gen.ExprLexer;
import sample.expr.gen.ExprParser;

import java.util.Stack;

/**
 * Created by antt on 10/4/2019.
 */
public class EvalListenerWithProps extends ExprBaseListener {
    Stack<Integer> stack = new Stack<>();
    ParseTreeProperty<Integer> values = new ParseTreeProperty<>();

    @Override
    public void exitId(ExprParser.IdContext ctx) {
        values.put(ctx, 0);
    }

    @Override
    public void exitInt(ExprParser.IntContext ctx) {
        System.out.println(ctx.getText());
        values.put(ctx, Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitPlus(ExprParser.PlusContext ctx) {
//        stack.push(stack.pop() + stack.pop());
        int op1 = values.get(ctx.expr(0));
        int op2 = values.get(ctx.expr(1));
        System.out.println("op1 " + ctx.expr(0).getText());
        System.out.println("op2 " + ctx.expr(1).getText());
        values.put(ctx, op1 + op2);
    }

    public static void main(String[] args) {
        ExprLexer lexer = new ExprLexer(CharStreams.fromString("1 + 15\n"));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        ParseTreeWalker walker = new ParseTreeWalker();
        // traverse tree to eval expression
        EvalListenerWithProps l = new EvalListenerWithProps();
        walker.walk(l, tree);
        System.out.println(l.values.get(tree));
    }
}