package evaluator;

public class AndOperation extends BinaryOperation {
    public AndOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation(int lval, int rval) {
        return lval & rval;
    }

    protected String toStringOperator() {
        return "&";
    }
}
