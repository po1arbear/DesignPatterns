package com.orangeaterz.designpatterns.工厂模式;


public class Client {
    public static void main(String[] args) {
        ConcretFactory concretFactory = new ConcretFactory();
        Product productA = concretFactory.createProduct(ProductA.class);
        productA.method();
    }
}
