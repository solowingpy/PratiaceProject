package com.zzd.study.oopcore.homeworkpart1;

public class HomeWork03 {
    public static void main(String[] args) {
        Worker worker = new Worker("Tom",200,365,1.0);
        Teacher teacher = new Teacher("Lisa",200,365,1.0);
        teacher.setReward(20);
        Scientist scientist = new Scientist("钟南山",3000,365,1.0);
        scientist.setBonus(100000);
        Waiter waiter = new Waiter("Jack",180,365,1.0);
        Peasant peasant = new Peasant("Jhon",160,365,1.0);
        System.out.println(teacher.printSalary());
        System.out.println(scientist.printSalary());
        System.out.println(waiter.printSalary());
        System.out.println(peasant.printSalary());
    }
}
