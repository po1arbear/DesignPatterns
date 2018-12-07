package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
