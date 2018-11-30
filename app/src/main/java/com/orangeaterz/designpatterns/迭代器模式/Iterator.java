package com.orangeaterz.designpatterns.迭代器模式;

public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     */
    T next();
}
