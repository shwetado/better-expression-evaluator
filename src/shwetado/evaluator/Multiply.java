package shwetado.evaluator;

public class Multiply implements Operator{
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() * left.evaluate();
    }
}