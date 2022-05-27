package com.zzd.study.oopcore.homeworkpart1;

public class Lacturer extends Teacher{
    public Lacturer(String name, String post, double salary, int age) {
        super(name, post, salary, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + "    " +  getSalary() * 1.1;
    }
}
