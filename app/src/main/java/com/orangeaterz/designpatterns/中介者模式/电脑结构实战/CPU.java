package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class CPU extends Colleague {
    private String dataVideo, dataSound; //视频和音频数据

    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * CPU处理数据
     */

    public void decodeData(String data) {
        String[] tmp = data.split(",");
        dataVideo = tmp[0];
        dataSound = tmp[1];
    }

    public String getVideoData() {
        return dataVideo;
    }

    public String getSoundData() {
        return dataSound;
    }

}
