package com.zzd.study.oopcore.poly;

public class Worker extends Employee {

    public Worker(String name, double salary, char gender) {
        super(name, salary, gender);
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary();
    }
    public void work(){
        System.out.println(getName() + "正在工作");
    }

}
