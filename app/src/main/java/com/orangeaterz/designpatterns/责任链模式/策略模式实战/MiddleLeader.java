package com.orangeaterz.designpatterns.责任链模式.策略模式实战;

public class MiddleLeader extends Leader {
    public MiddleLeader(String level) {
        super(level);
    }

    @Override
    int getLimit() {
        return 5000;
    }
}
