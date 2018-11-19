package com.orangeaterz.designpatterns.状态模式.登录状态实战;

import android.content.Context;

public interface UserState {

    void forward(Context context);

    void comment(Context context);
}
