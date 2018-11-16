package com.orangeaterz.designpatterns.抽象工厂模式;

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("normal brake");
    }
}
