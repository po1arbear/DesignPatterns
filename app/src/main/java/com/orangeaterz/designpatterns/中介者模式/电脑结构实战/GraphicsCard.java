package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data) {
        System.out.println("显卡播放视频:" + data);
    }
}
