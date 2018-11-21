package com.orangeaterz.designpatterns.解释器模式.calculate;

public class NumberExpression extends AbstractExpression {
    private int number;

    NumberExpression(int num) {
        this.number = num;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
