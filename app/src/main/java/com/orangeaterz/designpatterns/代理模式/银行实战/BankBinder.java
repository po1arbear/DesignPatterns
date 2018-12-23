package com.orangeaterz.designpatterns.代理模式.银行实战;

import android.os.Binder;

public class BankBinder extends Binder implements IBank {
    @Override
    public String createAccount(String account, String password) {
        return "创建账户" + account;
    }

    @Override
    public String saveMoney(String account, double money) {
        return account + "存入" + money + "元";
    }

    @Override
    public String takeMoney(String account, double money, String password) {
        return account + "取出" + money + "元";
    }

    @Override
    public String unregisterAccount(String account, String password) {
        return account + "被注销";
    }
}
