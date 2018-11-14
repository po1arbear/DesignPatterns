package com.orangeaterz.designpatterns.factory;

public class ConcretFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
