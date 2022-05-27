package com.zzd.study.oopcore.homeworkpart2;

import com.zzd.study.oopcore.homeworkpart1.HomeWork01;

public class HomeWork05 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Teacher("Tom",'男',34,8);
        persons[1] = new Teacher("lisa",'女',30,2);
        persons[2] = new Student("王泽浩",'男',20,"1534030866");
        persons[3] = new Student("朱政达",'男',20,"931919113");
        persons = HomeWork01.selectionSort(persons);
        for (Person person : persons) {
            System.out.println(person.info());
        }

    }

}
