package shwetado.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluatedExpressionForAdd() throws Exception {
        Expression expression = new Expression(new Expression(1d),new Addition(), new Expression(1d));
        double actual = expression.evaluate();
        assertEquals(2d,actual);
    }

    @Test
    public void testEvaluatedExpressionForSub() throws Exception {
        Expression expression = new Expression(new Expression(1d),new Subtract(), new Expression(1d));
        double actual = expression.evaluate();
        assertEquals(0d,actual);
    }

    @Test
    public void testEvaluatedExpressionForExpressionWithBracket() throws Exception {
        Expression _3Plus2 = new Expression(new Expression(3.0),new Addition(),new Expression(2.0));
        Expression _3Plus2Into4 = new Expression(_3Plus2,new Multiply(),new Expression(4.0));
        Expression _3Into2 = new Expression(new Expression(3.0),new Multiply(),new Expression(2.0));

        Expression result = new Expression(_3Plus2Into4, new Addition(), _3Into2);

        double actual = result.evaluate();
        assertEquals(26.0, actual);
    }

    @Test
    public void testEvaluatedExpression() throws Exception {
        Expression _1Plus2 = new Expression(new Expression(1.0),new Addition(),new Expression(2.0));
        Expression _14Minus2 = new Expression(new Expression(14.0),new Subtract(),new Expression(2.0));
        Expression _13Minus9 = new Expression(new Expression(13.0),new Subtract(),new Expression(9.0));
        Expression _14Minus2DivideBy_13Minus9 = new Expression(_14Minus2,new Division(),_13Minus9);
        Expression _1Plus2IntoDivideExpr = new Expression(_1Plus2,new Multiply(),_14Minus2DivideBy_13Minus9);
        Expression _2ToThePowerOf3 = new Expression(new Expression(2.0),new PowerOf(),new Expression(3.0));

        Expression result = new Expression(_1Plus2IntoDivideExpr, new Addition(), _2ToThePowerOf3);

        double actual = result.evaluate();
        assertEquals(17.0, actual);
    }
}