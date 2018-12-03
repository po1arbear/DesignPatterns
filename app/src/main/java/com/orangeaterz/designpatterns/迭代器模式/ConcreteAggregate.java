package com.orangeaterz.designpatterns.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
