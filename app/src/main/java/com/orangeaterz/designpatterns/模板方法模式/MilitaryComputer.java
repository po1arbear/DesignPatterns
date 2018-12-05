package com.orangeaterz.designpatterns.模板方法模式;

public class MilitaryComputer extends AbstractComputer{
    @Override
    protected void checjHardware() {
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("进行指纹识别等复杂的用户验证");
    }
}
