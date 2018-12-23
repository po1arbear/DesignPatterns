package com.orangeaterz.designpatterns.代理模式.银行实战;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BankServie extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return new BankBinder();
    }
}
