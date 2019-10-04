package sample.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sample.expr.gen.ExprBaseListener;
import sample.expr.gen.ExprLexer;
import sample.expr.gen.ExprParser;

import java.util.Stack;

/**
 * Created by antt on 10/4/2019.
 */
public class EvalListener extends ExprBaseListener {
    Stack<Integer> stack = new Stack<>();

    @Override
    public void exitId(ExprParser.IdContext ctx) {
        stack.push(0);
    }

    @Override
    public void exitInt(ExprParser.IntContext ctx) {
        stack.push(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitPlus(ExprParser.PlusContext ctx) {
        stack.push(stack.pop() + stack.pop());
    }

    public static void main(String[] args) {
        ExprLexer lexer = new ExprLexer(CharStreams.fromString("1 + 15\r\n"));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        // traverse tree to eval expression
        EvalListener l = new EvalListener();
        walker.walk(l, tree);
        System.out.println(l.stack.pop());
    }
}