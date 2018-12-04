package com.orangeaterz.designpatterns.迭代器模式;

public class Client {

    public static void main(String[] args) {
        ConcreteAggregate<String> c = new ConcreteAggregate<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println("ClientIterator:" + iterator.next());
        }
    }

}

