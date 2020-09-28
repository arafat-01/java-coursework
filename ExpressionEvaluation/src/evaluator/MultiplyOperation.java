package evaluator;

public class MultiplyOperation extends BinaryOperation {
    public MultiplyOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation(int lval, int rval) {
        return lval * rval;
    }

    protected String toStringOperator() {
        return "*";
    }
}
