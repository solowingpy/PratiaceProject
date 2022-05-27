package com.zzd.study.oopcore.homeworkpart1;

public class HomeWork02 {
    public static void main(String[] args) {
        Teacher teacher = new Lacturer("邵慧","讲师",4000,30);
        System.out.println(teacher.introduce());
        Employee employee = new Worker("Tom", 4000.0,30,1.0);
        Employee employee2 = new Manager("Lisa", 5000.0,30,1.2);
        System.out.println(employee2.printSalary());
        System.out.println(employee.printSalary());
    }
}
