// Generated from Expressions.g4 by ANTLR 4.0
package expr.gen;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	T visitOpExpr(ExpressionsParser.OpExprContext ctx);

	T visitStart(ExpressionsParser.StartContext ctx);

	T visitAtomExpr(ExpressionsParser.AtomExprContext ctx);
}