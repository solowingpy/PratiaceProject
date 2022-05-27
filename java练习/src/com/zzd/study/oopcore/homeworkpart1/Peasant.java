package com.zzd.study.oopcore.homeworkpart1;

public class Peasant extends Employee{
    public Peasant(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    @Override
    public String printSalary() {
        System.out.println("农民的总工资");
        return super.printSalary();
    }
}
