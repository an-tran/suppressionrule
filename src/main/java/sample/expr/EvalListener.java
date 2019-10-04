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
    public void exitExpr(ExprParser.ExprContext ctx) {
        if (ctx.ID() != null) {
            stack.push(0);
        } else if (ctx.INT() != null) {
            stack.push(Integer.parseInt(ctx.INT().getText()));
        } else {
            int op2 = stack.pop();
            int op1 = stack.pop();
            switch (ctx.op.getText()) {
                case "+":
                    stack.push(op1 + op2);
                    break;
                case "-":
                    stack.push(op1 - op2);
                    break;
                case "*":
                    stack.push(op1 * op2);
                    break;
                case "/":
                    stack.push(op1 / op2);
                    break;
                default:
                    throw new RuntimeException("Invalid operator " + ctx.op.getText());
            }
        }
    }

    public static void main(String[] args) {
        ExprLexer lexer = new ExprLexer(CharStreams.fromString("1 + 2\r\n"));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        // traverse tree to eval expression
        EvalListener l = new EvalListener();
        walker.walk(l, tree);
        System.out.println(l.stack.pop());
    }
}