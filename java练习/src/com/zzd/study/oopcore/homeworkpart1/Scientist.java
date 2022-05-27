package com.zzd.study.oopcore.homeworkpart1;

public class Scientist  extends Employee{
    private double bonus;
    public Scientist(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String printSalary() {
        return "姓名" + getName() + "一年的工资" + (getSalary() * getWorkDay() * getGrade() + getBonus());
    }
}
