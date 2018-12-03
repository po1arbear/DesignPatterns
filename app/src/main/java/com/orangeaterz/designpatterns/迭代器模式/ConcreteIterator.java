package com.orangeaterz.designpatterns.迭代器模式;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = list.get(cursor++);
        }
        return obj;
    }
}
