package com.orangeaterz.designpatterns.适配器模式;

public class Test {

    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压："+adapter.getVolt220());
    }
}
