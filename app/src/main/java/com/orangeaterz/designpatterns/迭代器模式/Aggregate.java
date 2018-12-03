package com.orangeaterz.designpatterns.迭代器模式;

public interface Aggregate<T> {
    /**
     * 添加一个元素
     */
    void add(T obj);

    /**
     * 移除一个元素
     */
    void remove(T obj);

    /**
     * 获取迭代器对象
     */

    Iterator<T> iterator();
}
