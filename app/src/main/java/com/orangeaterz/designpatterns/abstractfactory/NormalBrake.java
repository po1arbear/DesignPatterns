package com.orangeaterz.designpatterns.abstractfactory;

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("normal brake");
    }
}
