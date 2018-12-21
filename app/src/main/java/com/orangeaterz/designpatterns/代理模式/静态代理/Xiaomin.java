package com.orangeaterz.designpatterns.代理模式.静态代理;


public class Xiaomin implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("小明申请仲裁");
    }

    @Override
    public void burden() {
        System.out.println("小明证据充足");
    }

    @Override
    public void defend() {
        System.out.println("小明辩护");
    }

    @Override
    public void finish() {
        System.out.println("小明完成申诉");
    }
}
