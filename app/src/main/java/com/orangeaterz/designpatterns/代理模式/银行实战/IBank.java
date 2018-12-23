package com.orangeaterz.designpatterns.代理模式.银行实战;

public interface IBank {
    //创建账户
    String createAccount(String account, String password);

    //存钱
    String saveMoney(String account, double money);

    //取钱
    String takeMoney(String account, double money, String password);

    //注销账户
    String unregisterAccount(String account, String password);

}
