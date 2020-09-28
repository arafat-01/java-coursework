package evaluator;

public class OrOperation extends BinaryOperation {
    public OrOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation(int lval, int rval) {
        return lval | rval;
    }

    protected String toStringOperator() {
        return "|";
    }
}
