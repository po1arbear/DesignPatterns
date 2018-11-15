package com.orangeaterz.designpatterns.factory;


public class Client {
    public static void main(String[] args) {
        ConcretFactory concretFactory = new ConcretFactory();
        Product productA = concretFactory.createProduct(ProductA.class);
        productA.method();
    }
}
