package com.orangeaterz.designpatterns.抽象工厂模式;

public class SuvTire implements ITire {
    @Override
    public void tire() {
        System.out.println("suv tire");
    }
}
