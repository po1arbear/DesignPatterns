package com.orangeaterz.designpatterns.策略模式;

/**
 * 策略模式
 * 优点：
 * 结构清晰明了、使用简单直观
 * 耦合度相对而言较低，扩展方便
 * 操作封装也更彻底，数据更为安全
 * <p>
 * 缺点：
 * 随着策略的增加，子类也会变得繁多
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
