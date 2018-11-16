package com.orangeaterz.designpatterns.策略模式;

public class BusStrategy implements CalculateStrategy {
    @Override
    public void calculate(int distance) {
        System.out.println("BusStrategy distance: " + distance);
    }
}
