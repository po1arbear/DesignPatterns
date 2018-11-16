package com.orangeaterz.designpatterns.状态模式;

public class User {
    public static void main(String[] args) {
        TVController controller = TVController.getInstance();
//        controller.powerOn();
        controller.turnUp();
        controller.turnDown();
        controller.nextChannel();
        controller.preChannel();
    }
}
