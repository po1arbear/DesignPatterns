package com.orangeaterz.designpatterns.迭代器模式.员工查询实战;

public class Employee {
    private String name;
    private String gender;
    private int age;
    private String position;

    public Employee(String name, String gender, int age, String position) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
    }

    public String toString() {
        return "name:" + name + " gender:" + gender + " age:" + age + " position:" + position;
    }

}
