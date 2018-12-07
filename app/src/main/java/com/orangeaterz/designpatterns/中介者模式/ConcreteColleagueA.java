package com.orangeaterz.designpatterns.中介者模式;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("交给中介处理的A");
    }
}
