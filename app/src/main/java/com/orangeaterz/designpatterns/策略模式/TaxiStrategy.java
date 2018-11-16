package com.orangeaterz.designpatterns.策略模式;

public class TaxiStrategy implements CalculateStrategy {
    @Override
    public void calculate(int distance) {
        System.out.println("TaxiStrategy distance: " + distance);
    }
}
