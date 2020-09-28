package evaluator;

public abstract class UnaryOperation implements IntExpression {
    private IntExpression val;

    public UnaryOperation (IntExpression val) {
        this.val = val;
    }
    protected abstract int doOperation (int value);

    protected abstract String toStringOperator ();

    public int getValue () {
        return doOperation(val.getValue());
    }

    public String toString () {
        return "(" + toStringOperator() + val.toString() + ")";
    }
}
