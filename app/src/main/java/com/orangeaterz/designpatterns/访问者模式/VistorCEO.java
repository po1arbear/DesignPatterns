package com.orangeaterz.designpatterns.访问者模式;

public class VistorCEO implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("CEO 关注的是 程序猿：" + engineer.name + "  kpi:" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CEO 关注的是 经理：" + manager.name + "  kpi:" + manager.kpi);

    }
}
