package com.orangeaterz.designpatterns.迭代器模式.员工查询实战;

import java.util.List;

public class MinIterator implements Iterator {
    private List<Employee> employees;
    private int position;

    public MinIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return (position <= employees.size() - 1) && employees.get(position) != null;
    }

    @Override
    public Object next() {
        Employee e = employees.get(position);
        position++;
        return e;
    }
}
