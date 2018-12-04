package com.orangeaterz.designpatterns.迭代器模式.员工查询实战;

import java.util.ArrayList;
import java.util.List;

public class MinCompany implements Company {
    private List<Employee> employees = new ArrayList<>();

    public MinCompany() {
        employees.add(new Employee("小明", "男", 108, "程序猿"));
        employees.add(new Employee("小红", "女", 26, "程序媛"));
        employees.add(new Employee("小李", "男", 33, "产品经理"));
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(this.employees);
    }
}
