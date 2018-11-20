package com.orangeaterz.designpatterns.责任链模式;

abstract class AbstractHandler {
    AbstractHandler nextHandler;

    abstract protected int getHandleLevel();

    abstract protected void handle(AbstractRequest request);

    void handleRequest(AbstractRequest request) {
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handle(request);
            } else {
                System.out.println("No one can handle this request");
            }

        }

    }
}
