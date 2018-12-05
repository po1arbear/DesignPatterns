package com.orangeaterz.designpatterns.模板方法模式;

public class Test {
    public static void main(String[] args) {
        AbstractComputer computer1 = new CoderComputer();
        computer1.startUp();
        AbstractComputer computer2 = new MilitaryComputer();
        computer2.startUp();
    }
}
