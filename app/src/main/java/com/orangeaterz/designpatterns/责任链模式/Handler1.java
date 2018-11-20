package com.orangeaterz.designpatterns.责任链模式;

public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("handler1 handle request:" + request.getContent().toString());
    }
}
