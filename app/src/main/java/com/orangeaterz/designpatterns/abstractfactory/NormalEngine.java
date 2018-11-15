package com.orangeaterz.designpatterns.abstractfactory;

public class NormalEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("normal engine");
    }
}
