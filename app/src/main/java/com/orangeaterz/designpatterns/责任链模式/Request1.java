package com.orangeaterz.designpatterns.责任链模式;

public class Request1 extends AbstractRequest {
    public Request1(Object o) {
        super(o);
    }

    @Override
    protected int getRequestLevel() {
        return 1;
    }
}
