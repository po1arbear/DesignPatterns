package com.orangeaterz.designpatterns.状态模式;

public class PowerOffState implements TVState {
    @Override
    public void turnUp() {
        System.out.println("未开机");
    }

    @Override
    public void turnDown() {
        System.out.println("未开机");
    }

    @Override
    public void nextChannel() {
        System.out.println("未开机");
    }

    @Override
    public void preChannel() {
        System.out.println("未开机");
    }
}
