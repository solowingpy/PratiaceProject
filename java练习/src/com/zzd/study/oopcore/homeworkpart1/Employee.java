package com.zzd.study.oopcore.homeworkpart1;

public class Employee {
    private String name;
    private double salary;
    private int workDay;

    public Employee() {
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private double grade;

    public Employee(String name, double salary, int workDay, double grade) {
        this.name = name;
        this.salary = salary;
        this.workDay = workDay;
        this.grade = grade;
    }


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
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
    public String printSalary() {
        return "姓名" + name + "总工资" + salary * workDay * grade;

    }
}
