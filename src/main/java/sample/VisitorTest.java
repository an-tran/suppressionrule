//package sample;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.io.IOException;
//import java.util.stream.Collectors;
//
//public class VisitorTest {
//    public static class SuppressVisitor extends suppressionBaseVisitor<String> {
//        @Override
//        public String visitKey(suppressionParser.KeyContext ctx) {
//            return ctx.getText();
//        }
//
//        @Override
//        public String visitIntValue(suppressionParser.IntValueContext ctx) {
//            return ctx.getText();
//        }
//
//        @Override
//        public String visitStringValue(suppressionParser.StringValueContext ctx) {
//            return ctx.getText();
//        }
//
//        @Override
//        public String visitMultiTermsValue(suppressionParser.MultiTermsValueContext ctx) {
//            StringBuilder sb = new StringBuilder();
//            sb.append("(");
//            sb.append(String.join(" ",
//                    ctx.STRING().stream().map(node -> node.getText()).collect(Collectors.toList())));
//            sb.append(" ");
//            sb.append(String.join(" ",
//                    ctx.INT().stream().map(node -> node.getText()).collect(Collectors.toList())));
//            sb.append(")");
//            return sb.toString();
//        }
//
//        @Override
//        public String visitPair(suppressionParser.PairContext ctx) {
//            return visit(ctx.key()) + ":" + visit(ctx.val());
//        }
//    }
//    public static void main(String[] args) throws IOException {
////        InputStream is = new FileInputStream("basic-expr");
//        String file = VisitorTest.class.getClassLoader().getResource("basic-expr").getFile();
////        suppressionLexer lexer = new suppressionLexer(CharStreams.fromString("src : biglabs.com"));
//        suppressionLexer lexer = new suppressionLexer(CharStreams.fromString("id : ( few 123 345 ewf )"));
//        suppressionParser parser = new suppressionParser(new CommonTokenStream(lexer));
//        ParseTree tree = parser.program();
//        SuppressVisitor visitor = new SuppressVisitor();
//        String val = visitor.visit(tree);
//        System.out.println(val);
//        System.out.println();
//    }
//}
