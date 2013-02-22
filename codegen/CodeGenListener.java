package codegen;

import static codegen.gen.JavaParser.*;

import codegen.gen.JavaBaseListener;
import codegen.gen.JavaParser;
import org.antlr.v4.runtime.TokenStream;

public class CodeGenListener extends JavaBaseListener {
    JavaParser parser;
    public CodeGenListener(JavaParser parser) { this.parser = parser; }

    /** Listen to matches of methodDeclaration */
    @Override
    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String fullSignature = tokens.getText(ctx);
        System.out.println(fullSignature+";");
    }
}
