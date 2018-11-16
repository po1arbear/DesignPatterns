package com.orangeaterz.designpatterns.抽象工厂模式;

public class SuvFactory extends CarFactory {
    @Override
    ITire createTire() {
        return new SuvTire();
    }

    @Override
    IEngine createEngine() {
        return new SuvEngine();
    }

    @Override
    IBrake createBrake() {
        return new SuvBrake();
    }
}
