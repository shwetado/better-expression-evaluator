package shwetado.evaluator;

public class AddOperator implements Operator{
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() + left.evaluate();
    }
}
