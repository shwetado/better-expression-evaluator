package shwetado.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluatedExpressionForAdd() throws Exception {
        Expression expression = new Expression(new Expression(1d),new AddOperator(), new Expression(1d));
        double actual = expression.evaluate();
        assertEquals(2d,actual);
    }

    @Test
    public void testEvaluatedExpressionForSub() throws Exception {
        Expression expression = new Expression(new Expression(1d),new SubOperator(), new Expression(1d));
        double actual = expression.evaluate();
        assertEquals(0d,actual);
    }
}