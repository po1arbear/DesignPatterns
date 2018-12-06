package com.orangeaterz.designpatterns.访问者模式;

public class Client {
    public static void main(String[] args) {
        Engineer e1 = new Engineer("小明");
        Manager m1 = new Manager("小红");
        VisitorCTO visitorCTO = new VisitorCTO();
        VistorCEO vistorCEO = new VistorCEO();
        visitorCTO.visit(e1);
        visitorCTO.visit(m1);
        vistorCEO.visit(e1);
        vistorCEO.visit(m1);
    }
}
