package com.orangeaterz.designpatterns.abstractfactory;

public class SuvTire implements ITire {
    @Override
    public void tire() {
        System.out.println("suv tire");
    }
}
