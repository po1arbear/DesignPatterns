package com.orangeaterz.designpatterns.责任链模式.策略模式实战;

public class Member {
    public static void main(String[] args) {
        Leader leader1 = new PrimaryLeader("组长");
        Leader leader2 = new MiddleLeader("主管");
        Leader leader3 = new SeniorLeader("经理");
        leader1.supervisor = leader2;
        leader2.supervisor = leader3;

        leader1.handleRequest(500);
        leader1.handleRequest(2000);
        leader1.handleRequest(30000);

    }
}
