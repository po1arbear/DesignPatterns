package com.orangeaterz.designpatterns.代理模式.静态代理;

public class Client {
    public static void main(String[] args) {
        Xiaomin xiaomin = new Xiaomin();
        Lawyer lawyer = new Lawyer(xiaomin);
        lawyer.burden();
        lawyer.defend();
        lawyer.submit();
        lawyer.finish();
    }
}
