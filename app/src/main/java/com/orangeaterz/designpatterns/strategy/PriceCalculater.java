package com.orangeaterz.designpatterns.strategy;

public class PriceCalculater {
    private CalculateStrategy mCalculateStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.mCalculateStrategy = strategy;
    }

    public void calculate(int distance) {
        if (mCalculateStrategy != null) {
            mCalculateStrategy.calculate(distance);
        }
    }


    public static void main(String[] args) {
        PriceCalculater priceCalculater = new PriceCalculater();
        priceCalculater.setStrategy(new TaxiStrategy());
        priceCalculater.calculate(20);
    }

}
