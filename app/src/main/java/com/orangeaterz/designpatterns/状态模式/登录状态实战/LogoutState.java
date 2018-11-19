package com.orangeaterz.designpatterns.状态模式.登录状态实战;

import android.content.Context;
import android.widget.Toast;

public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "请先登录", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "请先登录", Toast.LENGTH_SHORT).show();
    }
}
