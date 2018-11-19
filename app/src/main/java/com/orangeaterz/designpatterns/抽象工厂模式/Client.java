package com.orangeaterz.designpatterns.抽象工厂模式;


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
