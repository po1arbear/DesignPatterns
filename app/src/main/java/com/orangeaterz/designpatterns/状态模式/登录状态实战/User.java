package com.orangeaterz.designpatterns.状态模式.登录状态实战;

import android.content.Context;

public class User {
    private UserState mState = new LogoutState();
    static User sUser = new User();

    public static User getInstance() {
        return sUser;
    }

    public void setState(UserState state) {
        this.mState = state;

    }

    public void forward(Context context) {
        mState.forward(context);
    }

    public void comment(Context context) {
        mState.comment(context);

    }
}
