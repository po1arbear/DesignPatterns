package com.orangeaterz.designpatterns.abstractfactory;

public class SuvBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("suv brake");
    }
}
