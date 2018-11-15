package com.orangeaterz.designpatterns.strategy;

/**
 * 策略模式
 * 优点：
 * 通过建立抽象，将不同的策略构建成一个具体的策略实现，通过不同的策略实现算法替换。
 * 在简化逻辑，结构的同时，增强了系统的可读性、稳定性、可扩展性。
 */
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
