package com.orangeaterz.designpatterns.责任链模式.策略模式实战;

public class PrimaryLeader extends Leader {

    public PrimaryLeader(String level) {
        super(level);
    }

    @Override
    int getLimit() {
        return 1000;
    }
}
