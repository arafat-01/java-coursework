package evaluator;

public class SubtractOperation extends BinaryOperation {
    public SubtractOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation(int lval, int rval) {
        return lval - rval;
    }

    protected String toStringOperator() {
        return "-";
    }
}
