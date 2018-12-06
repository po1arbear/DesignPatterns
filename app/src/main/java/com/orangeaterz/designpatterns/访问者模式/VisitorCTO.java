package com.orangeaterz.designpatterns.访问者模式;

public class VisitorCTO implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("CTO 关注的是:" + engineer.name + "的代码量:" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CTO 关注的是:" + manager.name + "的产品数量:" + manager.getProducts());
    }
}
