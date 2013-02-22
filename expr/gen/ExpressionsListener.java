// Generated from Expressions.g4 by ANTLR 4.0
package expr.gen;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExpressionsListener extends ParseTreeListener {
	void enterOpExpr(ExpressionsParser.OpExprContext ctx);
	void exitOpExpr(ExpressionsParser.OpExprContext ctx);

	void enterStart(ExpressionsParser.StartContext ctx);
	void exitStart(ExpressionsParser.StartContext ctx);

	void enterAtomExpr(ExpressionsParser.AtomExprContext ctx);
	void exitAtomExpr(ExpressionsParser.AtomExprContext ctx);
}