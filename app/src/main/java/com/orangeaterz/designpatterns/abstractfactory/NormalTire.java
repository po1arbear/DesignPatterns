package com.orangeaterz.designpatterns.abstractfactory;

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("normal tire");
    }
}
