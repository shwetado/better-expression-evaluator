package shwetado.evaluator;

public class PowerOf implements Operator{
    @Override
    public double operate(Expression right, Expression left) {
        return Math.pow(right.evaluate(), left.evaluate());
    }
}