package com.orangeaterz.designpatterns.abstractfactory;

/**
 * 抽象工厂
 * 优点：
 * 分离接口与实现，客户端使用抽象工厂来创建需要的对象，
 * 而客户端根本就不知道具体的实现是谁，客户端只是面向
 * 产品的接口编程而已，使其从具体的产品实现中解耦，同
 * 时基于接口与实现的分离，使抽象该工厂方法模式在切换
 * 产品类时更加灵活、容易
 * <p>
 * <p>
 * 缺点：
 * 文件的爆炸性增加，不容易扩展新的品类
 */
public class Client {
    public static void main(String[] args) {
        NormalFactory normalFactory = new NormalFactory();
        normalFactory.createBrake().brake();
        normalFactory.createEngine().engine();
        normalFactory.createTire().tire();

        SuvFactory suvFactory = new SuvFactory();
        suvFactory.createBrake().brake();
        suvFactory.createEngine().engine();
        suvFactory.createTire().tire();
    }
}
