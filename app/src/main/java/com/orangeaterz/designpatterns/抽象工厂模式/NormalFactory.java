package com.orangeaterz.designpatterns.抽象工厂模式;

public class NormalFactory extends CarFactory {
    @Override
    ITire createTire() {
        return new NormalTire();
    }

    @Override
    IEngine createEngine() {
        return new NormalEngine();
    }

    @Override
    IBrake createBrake() {
        return new NormalBrake();
    }
}
