package com.zzd.study.oopcore.poly;

public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus > 0 && bonus <= 10000) {
            this.bonus = bonus;
        } else {
            System.out.println("年薪输入有误,将会被设置为默认值1000");
            this.bonus = 1000;
        }
    }

    public Manager(String name, double salary, double bonus, char gender) {
        super(name, salary, gender);
        setBonus(bonus);
    }
    public void manage(){
        System.out.println(getName() + "正在管理");
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }
}
