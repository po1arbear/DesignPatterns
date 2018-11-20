package com.orangeaterz.designpatterns.责任链模式;

public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("handler2 handle request:" + request.getContent().toString());
    }
}
