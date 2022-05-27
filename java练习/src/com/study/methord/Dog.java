package com.study.methord;

public class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog() {
    }
    public void info(){
        System.out.println(this.age);
        System.out.println(this.color);
        System.out.println(this.name);
    }

}
