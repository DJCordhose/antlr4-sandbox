package expr;

import expr.gen.ExpressionsBaseVisitor;

import static expr.gen.ExpressionsParser.*;

public class Visitor extends ExpressionsBaseVisitor<Integer> {

    @Override
    public Integer visitStart(StartContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitOpExpr(OpExprContext ctx) {
        int left = visit(ctx.left);
        int right = visit(ctx.right);
        String op = ctx.op.getText();
        final int result;
        switch (op.charAt(0)) {
            case '*' : result = left * right; break;
            case '/' : result = left / right; break;
            case '+' : result = left + right; break;
            case '-' : result = left - right; break;
            default: throw new IllegalArgumentException("Unkown opeator " + op);
        }
        return result;
    }

    @Override
    public Integer visitAtomExpr(AtomExprContext ctx) {
        Integer atom = new Integer(ctx.atom.getText());
        return atom;
    }

}
