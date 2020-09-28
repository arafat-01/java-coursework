package evaluator;

public class TernaryOperation implements IntExpression {
    private IntExpression exp1, exp2, exp3;
    public TernaryOperation (IntExpression expr1, IntExpression expr2, IntExpression expr3) {
        this.exp1 = expr1;
        this.exp2 = expr2;
        this.exp3 = expr3;
    }
    public int getValue () {
        if (exp1.getValue() == 0) return exp3.getValue();
        else return exp2.getValue();
    }
    public String toString () {
        return "(" + exp1 + "?" + exp2 + ":" + exp3 + ")";
    }
}
