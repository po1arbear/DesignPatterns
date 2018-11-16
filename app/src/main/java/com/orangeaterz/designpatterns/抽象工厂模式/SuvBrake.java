package com.orangeaterz.designpatterns.抽象工厂模式;

public class SuvBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("suv brake");
    }
}
