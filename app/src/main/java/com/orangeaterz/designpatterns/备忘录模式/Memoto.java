package com.orangeaterz.designpatterns.备忘录模式;

public class Memoto {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "mCheckpoint:" + mCheckpoint + " mLifeValue:" + mLifeValue + " mWeapon:" + mWeapon;
    }
}
