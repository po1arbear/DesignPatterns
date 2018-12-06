package com.orangeaterz.designpatterns.访问者模式;

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
