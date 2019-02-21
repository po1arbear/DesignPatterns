package com.orangeaterz.designpatterns.适配器模式;

public class VoltAdapter implements FiveVolt {
    Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }

    public int getVolt220() {
        return volt220.getVolt220();
    }
}
