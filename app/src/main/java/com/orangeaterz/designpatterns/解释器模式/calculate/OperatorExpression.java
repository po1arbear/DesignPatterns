package com.orangeaterz.designpatterns.解释器模式.calculate;

abstract class OperatorExpression extends AbstractExpression {
    AbstractExpression expression1, expression2;

    public OperatorExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


}
