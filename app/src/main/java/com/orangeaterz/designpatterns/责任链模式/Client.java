package com.orangeaterz.designpatterns.责任链模式;

public class Client {
    public static void main(String[] args) {
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractRequest request1 = new Request1("request1");
        AbstractRequest request2 = new Request2("request2");
//        handler1.nextHandler = handler2;
        handler2.nextHandler = handler1;
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}
