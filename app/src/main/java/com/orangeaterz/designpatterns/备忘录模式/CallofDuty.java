package com.orangeaterz.designpatterns.备忘录模式;

public class CallofDuty {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    public void play() {
        mLifeValue -= 10;
        mCheckPoint++;
    }

    public void quit() {

    }

    public void restore(Memoto memoto) {
        this.mCheckPoint = memoto.mCheckpoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("游戏恢复后的属性：" + this.toString());
    }

    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mWeapon = this.mWeapon;
        memoto.mLifeValue = this.mLifeValue;
        memoto.mCheckpoint = this.mCheckPoint;
        return memoto;
    }


}
