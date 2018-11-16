package com.orangeaterz.designpatterns.抽象工厂模式;

public abstract class CarFactory {

    abstract ITire createTire();

    abstract IEngine createEngine();

    abstract IBrake createBrake();
}
