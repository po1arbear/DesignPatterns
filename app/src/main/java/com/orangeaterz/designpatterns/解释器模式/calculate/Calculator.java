package com.orangeaterz.designpatterns.解释器模式.calculate;

import java.util.Stack;

public class Calculator {
    String content;
    String[] elements;
    Stack<AbstractExpression> expressions = new Stack<>();

    public Calculator(String content) {
        this.content = content;
        this.elements = content.split(" ");
    }

    public int calculate() {
        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];

            if (!element.equals("+")) { //数字
                NumberExpression numberExpression = new NumberExpression(Integer.valueOf(element));
                expressions.push(numberExpression);
            } else { //+号
                AbstractExpression expression1 = expressions.pop();
                AbstractExpression expression2 = new NumberExpression(Integer.valueOf(elements[i + 1]));
                i = i + 1;
                AddExpression addExpression = new AddExpression(expression1, expression2);
                expressions.push(addExpression);
            }
        }

        return expressions.pop().interpret();
    }

}
