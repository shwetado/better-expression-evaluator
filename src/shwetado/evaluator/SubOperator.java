package shwetado.evaluator;

public class SubOperator implements Operator{
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() - left.evaluate();
    }
}