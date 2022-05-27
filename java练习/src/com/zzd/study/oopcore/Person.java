package com.zzd.study.oopcore;

/**
 * @author zzd19
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Person() {
    }

    public void setName(String name) {
        int len  = name.length();
        if (len <= 6){
            this.name = name;
        } else {
            System.out.println("非法的名字,名字将会设置为空");
            this.name = null;
        }
    }

    public void setAge(int age) {

        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("非法的年龄,年龄将会设置为空");
            this.age = 0;
        }
    }
    public String say(){
        return name + age;
    }
}
