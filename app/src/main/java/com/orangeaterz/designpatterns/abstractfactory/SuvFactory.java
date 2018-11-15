package com.orangeaterz.designpatterns.abstractfactory;

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
