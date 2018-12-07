package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("声卡播放声音:" + data);
    }
}
