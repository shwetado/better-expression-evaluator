package shwetado.evaluator;

public class Expression {
    Double value;
    Expression left, right;
    Operator operator;

    Expression(Double value){
        this.value = value;
    }

    Expression(Expression left, Operator operator, Expression right){
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public double evaluate(){
        if (value!=null)    return value;
        else    return operator.operate(left,right);
    }
}