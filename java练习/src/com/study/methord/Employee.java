package com.study.methord;

public class Employee {
    String name;
    String sex;
    int age;
    int salary;
    String character;

    public Employee(String name, String sex, int age, int salary, String character) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.character = character;
    }

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(int salary, String character) {
        this.salary = salary;
        this.character = character;
    }
}
