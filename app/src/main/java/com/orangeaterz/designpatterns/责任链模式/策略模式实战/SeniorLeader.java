package com.orangeaterz.designpatterns.责任链模式.策略模式实战;

public class SeniorLeader extends Leader {
    public SeniorLeader(String level) {
        super(level);
    }

    @Override
    int getLimit() {
        return 50000;
    }
}
