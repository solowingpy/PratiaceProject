package com.zzd.study.oopcore.homeworkpart2;

public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 6) {
            System.out.println("非法输入,名字将会被设置为无名氏");
            this.name = "无名氏";
        } else {
            this.name = name;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != '男' && gender != '女') {
            this.gender = '男';
            System.out.println("非法输入,默认将会设置为男");
        } else {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("非法输入,年龄将会设置为0岁");
        } else {
            this.age = age;
        }
    }
    public String play(){
        return getName();
    }
    public String info(){
        return "基本信息:" + name + age + gender;
    }
}
