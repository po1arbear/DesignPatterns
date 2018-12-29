package com.orangeaterz.designpatterns.代理模式.银行实战;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

import com.orangeaterz.designpatterns.R;

public class BankActivity extends Activity implements View.OnClickListener {
    private BankBinder mBankBinder;
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mBankBinder = (BankBinder) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        findViewById(R.id.tv_msg).setOnClickListener(this);
        findViewById(R.id.btn_create).setOnClickListener(this);
        findViewById(R.id.btn_save).setOnClickListener(this);
        findViewById(R.id.btn_take).setOnClickListener(this);
        findViewById(R.id.btn_unregister).setOnClickListener(this);
        Intent intent = new Intent(this, BankServie.class);
        bindService(intent, conn, BIND_AUTO_CREATE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_create:
                System.out.println(mBankBinder.createAccount("小明", "123456"));
                break;
            case R.id.btn_save:
                System.out.println(mBankBinder.saveMoney("小明", 1000000000000f));
                break;
            case R.id.btn_take:
                System.out.println(mBankBinder.takeMoney("小明", 1000000f, "123456"));
                break;
            case R.id.btn_unregister:
                System.out.println(mBankBinder.unregisterAccount("小明", "123456"));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(conn);
    }
}
