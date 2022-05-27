package com.zzd.study.oopcore;

public class OverrideExercise {
    public static void main(String[] args) {
        Student student = new Student("111",20,100,200020);
        System.out.println(student.say());
        Person person = new Person("JAVA",16);
        System.out.println(person.say());

    }
}
