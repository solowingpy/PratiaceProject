package com.zzd.study.oopcore.homeworkpart1;

public class Waiter  extends Employee{
    public Waiter(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    @Override
    public String printSalary() {
        System.out.println("服务生的工资");
        return super.printSalary();
    }
}
