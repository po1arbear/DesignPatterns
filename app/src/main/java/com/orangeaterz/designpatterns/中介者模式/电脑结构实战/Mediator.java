package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public abstract class Mediator {
    /**
     * 同时对象发生改变时通知中介者的方法
     *
     * @param colleague 同事对象
     */
    public abstract void changed(Colleague colleague);
}
