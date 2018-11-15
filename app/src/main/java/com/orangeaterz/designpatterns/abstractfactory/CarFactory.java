package com.orangeaterz.designpatterns.abstractfactory;

public abstract class CarFactory {

    abstract ITire createTire();

    abstract IEngine createEngine();

    abstract IBrake createBrake();
}
