package com.orangeaterz.designpatterns.抽象工厂模式;

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("normal tire");
    }
}
