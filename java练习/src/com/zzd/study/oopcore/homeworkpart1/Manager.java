package com.zzd.study.oopcore.homeworkpart1;

/**
 * 注意这里要分析出来隐藏条件，经理的奖金不可能是一成不变的
 * 所以要有一个特有变量来接收这个奖金
 * 并且要注意这个奖金是随时变化的,不宜在构造方法里初始化
 */
public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    @Override
    public String printSalary() {
        return "姓名" + getName() + "总工资" + (getSalary() * getWorkDay() * getGrade() + bonus );    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
