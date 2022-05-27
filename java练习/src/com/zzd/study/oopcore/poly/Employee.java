package com.zzd.study.oopcore.poly;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("输入有误,年薪值将会设置为1000");
            this.salary = 1000;
        }
    }

    public Employee(String name, double salary, char gender) {
        this.name = name;
        setGender(gender);
        setSalary(salary);
    }
    public double getAnnualSalary() {
        return salary * 12;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        } else {
            System.out.println("非法输入,性别将会设置为男");
            this.gender = '男';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return Double.compare(employee.salary, salary) == 0 && gender == employee.gender && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, gender);
    }

}
