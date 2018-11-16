package com.orangeaterz.designpatterns.状态模式;

public class TVController implements PowerController {
    private TVState state = new PowerOffState();
    public static TVController INSTANCE;

    public static TVController getInstance() {
        if (INSTANCE == null) {
            synchronized (TVController.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TVController();
                }
            }
        }

        return INSTANCE;
    }


    @Override
    public void powerOn() {
        this.state = new PowerOnState();
    }

    @Override
    public void powerOff() {
        this.state = new PowerOffState();
    }

    public void nextChannel() {
        state.nextChannel();
    }

    public void preChannel() {
        state.preChannel();
    }

    public void turnUp() {
        state.turnUp();
    }

    public void turnDown() {
        state.turnDown();
    }

}
