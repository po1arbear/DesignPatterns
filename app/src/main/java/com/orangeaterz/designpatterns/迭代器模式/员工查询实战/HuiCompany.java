package com.orangeaterz.designpatterns.迭代器模式.员工查询实战;

public class HuiCompany implements Company {
    private Employee[] employees = new Employee[3];

    public HuiCompany() {
        employees[0] = new Employee("小欣", "女", 18, "设计师");
        employees[1] = new Employee("小蓝", "男", 24, "前端");
        employees[2] = new Employee("小熊", "男", 26, "后端");
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(this.employees);
    }
}
