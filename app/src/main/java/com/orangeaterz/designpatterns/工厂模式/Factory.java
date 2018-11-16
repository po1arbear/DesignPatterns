package com.orangeaterz.designpatterns.工厂模式;

public abstract class Factory {
    abstract <T extends Product> T createProduct(Class<T> clazz);
}
