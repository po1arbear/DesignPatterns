package com.orangeaterz.designpatterns.责任链模式;

abstract class AbstractRequest {
    Object content;

    public AbstractRequest(Object o) {
        this.content = o;
    }

    abstract protected int getRequestLevel();

    public Object getContent() {
        return content;
    }
}
