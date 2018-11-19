package com.orangeaterz.designpatterns.状态模式.登录状态实战;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.orangeaterz.designpatterns.R;

public class StateActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_state);

        findViewById(R.id.btn_forward).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.getInstance().forward(StateActivity.this);
            }
        });

        findViewById(R.id.btn_comment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.getInstance().comment(StateActivity.this);
            }
        });


        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.getInstance().setState(new LoginState());
            }
        });


        findViewById(R.id.btn_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.getInstance().setState(new LogoutState());
            }
        });
    }
}
