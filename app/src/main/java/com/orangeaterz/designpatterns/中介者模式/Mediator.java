package com.orangeaterz.designpatterns.中介者模式;

public abstract class Mediator {
    protected ConcreteColleagueA concreteColleagueA;
    protected ConcreteColleagueB concreteColleagueB;

    /**
     * 抽象中介方法、子类实现
     */

    public abstract void method();

    public void setConcreteColleagueA(ConcreteColleagueA colleagueA) {
        this.concreteColleagueA = colleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB colleagueB) {
        this.concreteColleagueB = colleagueB;
    }

}
