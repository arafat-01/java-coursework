package evaluator;

public class Main {
    public static void main(String[] args) {
        IntExpression expr = new IntConstant(123);
        expr = new AddOperation(expr, new MinusOperation(new IntConstant(123)));
        if (expr.getValue() != 0) System.out.println("Wrong Answer! Incorrect AddOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        expr = new SubtractOperation(expr, new IntConstant(100));
        if (expr.getValue() != -100) System.out.println("Wrong Answer! Incorrect SubtractOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        expr = new MultiplyOperation(expr, new IntConstant(-1));
        if (expr.getValue() != 100) System.out.println("Wrong Answer! Incorrect MultiplyOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        expr = new DivideOperation(expr, new IntConstant(100));
        if (expr.getValue() != 1) System.out.println("Wrong Answer! Incorrect DivideOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        // + - / *  are done

        expr = new AndOperation(new IntConstant(1), new IntConstant(1));
        if (expr.getValue() != 1) System.out.println("Wrong Answer! Incorrect AndOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        expr = new OrOperation(expr, new IntConstant(0));
        if (expr.getValue() != 1) System.out.println("Wrong Answer! Incorrect OrOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        // & | are done

        expr = new MinusOperation (new IntConstant(6));
        if (expr.getValue() != -6) System.out.println("Wrong Answer! Incorrect MinusOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        expr = new NotOperation (new IntConstant(0));
        if (expr.getValue() != 1) System.out.println("Wrong Answer! Incorrect NotOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        // ! - are done

        IntExpression a = new AddOperation(new IntConstant(5), new IntConstant(54)); // 11
        IntExpression b = new MultiplyOperation(new IntConstant(1), new IntConstant(10));
        IntExpression c = new IntConstant(100);
        expr = new TernaryOperation(a, b, c);
        if (expr.getValue() != 10) System.out.println("Wrong Answer! Incorrect TernaryOperation!");
        else System.out.println(expr + " = " + expr.getValue());

        // ? : are done

    }
}
