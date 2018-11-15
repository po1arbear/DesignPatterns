package com.orangeaterz.designpatterns.strategy;

public class BusStrategy implements CalculateStrategy {
    @Override
    public void calculate(int distance) {
        System.out.println("BusStrategy distance: " + distance);
    }
}
