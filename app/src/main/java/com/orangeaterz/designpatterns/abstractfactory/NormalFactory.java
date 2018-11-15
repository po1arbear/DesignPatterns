package com.orangeaterz.designpatterns.abstractfactory;

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
