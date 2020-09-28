package evaluator;

public class AddOperation extends BinaryOperation {
    public AddOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation(int lval, int rval) {
        return lval + rval;
    }

    protected String toStringOperator() {
        return "+";
    }
}
