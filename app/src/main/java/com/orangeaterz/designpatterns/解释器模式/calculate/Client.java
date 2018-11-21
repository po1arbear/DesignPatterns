package com.orangeaterz.designpatterns.解释器模式.calculate;

public class Client {

    public static void main(String[] args) {
        String content = "1 + 2 + 3 + 4";
        Calculator calculator = new Calculator(content);
        int result = calculator.calculate();
        System.out.println("content: " + content);
        System.out.println("result : " + result);
    }
}
