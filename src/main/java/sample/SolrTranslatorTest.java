package sample;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sample.gen.SearchCriteriaLexer;
import sample.gen.SearchCriteriaParser;

import java.io.IOException;

/**
 * Created by antt on 10/1/2019.
 */
public class SolrTranslatorTest {
    public static void main(String[] args) throws IOException {
        SearchCriteriaLexer lexer = new SearchCriteriaLexer(CharStreams.fromString("id : ( few 123 345 ewf ) and key:val or p : 111"));
//        SearchCriteriaLexer lexer = new SearchCriteriaLexer(CharStreams.fromString("id : 123 and key:val"));
        SearchCriteriaParser parser = new SearchCriteriaParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.criteria();
        SolrQueryTranslatorExample visitor = new SolrQueryTranslatorExample();
        String val = visitor.visit(tree);
        System.out.println(val);
        System.out.println();
    }
}