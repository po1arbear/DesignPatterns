package com.orangeaterz.designpatterns.factory;

public abstract class Factory {
    abstract <T extends Product> T createProduct(Class<T> clazz);
}
