package sample;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
//        InputStream is = new FileInputStream("basic-expr");
        String file = Test.class.getClassLoader().getResource("basic-expr").getFile();
        suppressionLexer lexer = new suppressionLexer(CharStreams.fromFileName(file));
        suppressionParser parser = new suppressionParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        System.out.printf(tree.getText());
        System.out.println();
        System.out.printf(tree.toStringTree(parser));
//        System.out.printf(parser.program().toString());
        System.out.println();
    }
}
