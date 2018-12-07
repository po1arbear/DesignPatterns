package com.orangeaterz.designpatterns.中介者模式;

public abstract class Colleague {

    protected Mediator mediator;//中介者对象

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();
}
