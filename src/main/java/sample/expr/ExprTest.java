package sample.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sample.expr.gen.ExprLexer;
import sample.expr.gen.ExprParser;


/**
 * Created by antt on 10/4/2019.
 */
public class ExprTest {
    public static void main(String[] args) {
        ExprLexer lexer = new ExprLexer(CharStreams.fromString("1 + 2\n"));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));

    }
}