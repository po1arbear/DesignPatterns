package com.orangeaterz.designpatterns.中介者模式;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("交个中介处理的B");
    }
}
