package evaluator;

public class DivideOperation extends BinaryOperation {
    public DivideOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    protected int doOperation(int lval, int rval) {
        if (rval == 0) throw new DivideByZeroException();
        return lval / rval;
    }

    protected String toStringOperator() {
        return "/";
    }
}
