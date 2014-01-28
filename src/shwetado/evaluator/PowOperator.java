package shwetado.evaluator;

public class PowOperator implements Operator{
    @Override
    public double operate(Expression right, Expression left) {
        return Math.pow(right.evaluate(), left.evaluate());
    }
}