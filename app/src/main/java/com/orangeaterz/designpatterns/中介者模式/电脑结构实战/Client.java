package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        CPU cpu = new CPU(concreteMediator);
        CdDevice cd = new CdDevice(concreteMediator);
        GraphicsCard graphicsCard = new GraphicsCard(concreteMediator);
        SoundCard soundCard = new SoundCard(concreteMediator);
        concreteMediator
                .cpu(cpu)
                .cdDevice(cd)
                .graphicsCard(graphicsCard)
                .soundCard(soundCard);

        cd.load();


    }
}
