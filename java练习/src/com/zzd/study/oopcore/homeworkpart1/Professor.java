package com.zzd.study.oopcore.homeworkpart1;

public class Professor extends Teacher{
    public Professor(String name, String post, double salary, int age) {
        super(name, post, salary, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + "    " + getSalary() * 1.3;
    }
}
