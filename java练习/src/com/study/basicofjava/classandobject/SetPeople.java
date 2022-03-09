package com.study.basicofjava.classandobject;

/**
 * @author zzd19
 * 这个类用来测试用构造方法实例化的对象是否能做到”一个对象一个变量“
 */
public record SetPeople(int age) {

    public static void main(String[] args) {
        SetPeople setPeople = new SetPeople(20);
        SetPeople setPeople2 = new SetPeople(25);
        System.out.println(setPeople.age);
        System.out.println(setPeople2.age);
    }
}
/*
通过测试发现，用构造方法创建的对象虽然可以做到“一个对象一个变量”，但是可能会导致IDEA触发重构操作，提示：“类可以为记录”
 */
