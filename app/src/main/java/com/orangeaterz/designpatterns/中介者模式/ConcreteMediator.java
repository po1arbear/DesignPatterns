package com.orangeaterz.designpatterns.中介者模式;

public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}
