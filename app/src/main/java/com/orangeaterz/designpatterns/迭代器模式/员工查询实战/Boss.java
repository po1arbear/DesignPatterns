package com.orangeaterz.designpatterns.迭代器模式.员工查询实战;

public class Boss {
    public static void main(String[] args) {
        Company huiCompany = new HuiCompany();
        check(huiCompany.iterator());

        Company minCompany = new MinCompany();
        check(minCompany.iterator());
    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
