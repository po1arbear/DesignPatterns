package com.orangeaterz.designpatterns.抽象工厂模式;

public class NormalEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("normal engine");
    }
}
