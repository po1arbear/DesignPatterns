package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.cdDevice(new CdDevice(concreteMediator));
    }
}
