package com.orangeaterz.designpatterns.状态模式;

public class PowerOnState implements TVState {
    @Override
    public void turnUp() {
        System.out.println("音量+");
    }

    @Override
    public void turnDown() {
        System.out.println("音量-");
    }

    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上一个频道");
    }
}
