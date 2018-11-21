package com.orangeaterz.designpatterns.解释器模式.calculate;

public class AddExpression extends OperatorExpression {

    public AddExpression(AbstractExpression expression1, AbstractExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
