package evaluator;

public class MinusOperation extends UnaryOperation {
    public MinusOperation (IntExpression val) {
        super (val);
    }
    protected int doOperation (int value) {
        return -value;
    }
    protected String toStringOperator () {
        return "-";
    }
}
