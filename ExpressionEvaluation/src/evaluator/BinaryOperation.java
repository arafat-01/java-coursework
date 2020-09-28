package evaluator;

public abstract class BinaryOperation implements IntExpression {
    private IntExpression lhs;
    private IntExpression rhs;

    public BinaryOperation (IntExpression lval, IntExpression rval) {
        this.lhs = lval;
        this.rhs = rval;
    }
    protected abstract int doOperation (int lval, int rval);

    public int getValue () {
        return doOperation(lhs.getValue(), rhs.getValue());
    }

    protected abstract String toStringOperator ();

    public String toString () {
        return "(" + lhs.toString() + toStringOperator() + rhs.toString() + ")";
    }
}
