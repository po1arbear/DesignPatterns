package com.orangeaterz.designpatterns.strategy;

public class TaxiStrategy implements CalculateStrategy {
    @Override
    public void calculate(int distance) {
        System.out.println("TaxiStrategy distance: " + distance);
    }
}
