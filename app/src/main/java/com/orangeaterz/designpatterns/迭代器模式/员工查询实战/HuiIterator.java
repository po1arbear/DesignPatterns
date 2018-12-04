package com.orangeaterz.designpatterns.迭代器模式.员工查询实战;

public class HuiIterator implements Iterator {
    private Employee[] employees;
    private int position;

    public HuiIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return (position <= employees.length - 1) && employees[position] != null;
    }

    @Override
    public Object next() {
        Employee next = employees[position];
        position++;
        return next;
    }
}
