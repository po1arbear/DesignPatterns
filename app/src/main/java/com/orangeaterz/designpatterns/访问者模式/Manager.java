package com.orangeaterz.designpatterns.访问者模式;

import com.orangeaterz.designpatterns.工厂模式.Product;

import java.util.Random;

public class Manager extends Staff {
    public Manager(String aName) {
        super(aName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(3);
    }
}
