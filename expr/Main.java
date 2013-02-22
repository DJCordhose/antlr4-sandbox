package expr;

import expr.gen.ExpressionsLexer;
import expr.gen.ExpressionsParser;
import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        ExpressionsLexer lexer = new ExpressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionsParser parser = new ExpressionsParser(tokens);
        ParserRuleContext tree = parser.start(); // parse

        Visitor visitor = new Visitor();
        int result = visitor.visit(tree);
        System.out.println("Result: " + result);
    }
}
