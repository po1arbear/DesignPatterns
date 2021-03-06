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

            if (element.equals("+")) {

                AbstractExpression expression1 = expressions.pop();
                AbstractExpression expression2 = new NumberExpression(Integer.valueOf(elements[i + 1]));
                i = i + 1;
                AddExpression addExpression = new AddExpression(expression1, expression2);
                expressions.push(addExpression);
            } else if (element.equals("-")) {
                AbstractExpression expression1 = expressions.pop();
                AbstractExpression expression2 = new NumberExpression(Integer.valueOf(elements[i + 1]));
                i = i + 1;
                SubstractExpression substractExpression = new SubstractExpression(expression1, expression2);
                expressions.push(substractExpression);
            } else { //数字
                NumberExpression numberExpression = new NumberExpression(Integer.valueOf(element));
                expressions.push(numberExpression);

            }
        }

        return expressions.pop().interpret();
    }

}
