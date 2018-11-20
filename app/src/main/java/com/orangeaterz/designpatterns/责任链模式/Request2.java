package com.orangeaterz.designpatterns.责任链模式;

public class Request2 extends AbstractRequest {

    public Request2(Object o) {
        super(o);
    }

    @Override
    protected int getRequestLevel() {
        return 2;
    }
}
