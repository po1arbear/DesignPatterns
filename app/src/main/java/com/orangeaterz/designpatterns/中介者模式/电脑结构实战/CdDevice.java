package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class CdDevice extends Colleague {
    private String data;

    public CdDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频数据,音频数据";
        //通知中介者加载数据
        mediator.changed(this);
    }

}
