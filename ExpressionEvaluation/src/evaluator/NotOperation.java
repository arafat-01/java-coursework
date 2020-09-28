package evaluator;

public class NotOperation extends UnaryOperation {
    public NotOperation (IntExpression val) {
        super (val);
    }
    protected int doOperation (int value) {
        if (value == 0) return 1;
        else return 0;
    }
    protected String toStringOperator () {
        return "!";
    }
}
