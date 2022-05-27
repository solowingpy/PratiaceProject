package com.zzd.study.oopcore.homeworkpart1;

public class HomeWork01 {



    public static void main(String[] args) {
        Person[] persons = new Person[3];
        Person person = new Person(22,"112","???");
        persons[0] = person;
        Person myFriend = new Person(19,"王不留行","学生");
        persons[1] = myFriend;
        Person person3 = new Person(32,"????","????");
        persons[2] = person3;
        selectionSort(persons);
        for (Person value : persons) {
            System.out.println(value.toString());
        }
    }

    /**
     * 选择排序?
     * 思路是用两个指针变量
     * 如果是升序排序，就不断寻找最小的变量
     */
    public static void selectionSort(Person[] persons){
        int index = 0;
        int low;
        //注意,和交换基本数据类型一样，交换对象也需要一个临时变量用来存储对象的内存空间
            Person tmp;
        for (; index < persons.length - 1 ; index++) {
            for (int index2 = 1 ; index2 < persons.length-1 - index; index2++) {
                if (persons[0].getAge() > persons[1].getAge()) {
                    tmp = persons[0];
                    persons[0] = persons[1];
                    persons[1] = tmp;
                }
                if (index2 == persons.length - 1 && persons[persons.length - 1].getAge() < persons[index].getAge()) {
                    tmp = persons[index];
                    persons[index] = persons[persons.length - 1];
                    persons[persons.length - 1] = tmp;
                }
                if (persons[index2 + 1].getAge() > persons[index2].getAge()) {
                    low = persons[index2].getAge();
                    tmp = persons[index];
                    persons[index] = persons[persons.length - 1];
                    persons[persons.length - 1] = tmp;
                    if (persons[index2].getAge() < low) {
                        tmp = persons[index];
                        persons[index] = persons[persons.length - 1];
                        persons[persons.length - 1] = tmp;
                    }
                }
        }
        }
    }

    public static com.zzd.study.oopcore.homeworkpart2.Person[] selectionSort(com.zzd.study.oopcore.homeworkpart2.Person[] persons) {
        int index = 0;
        int low;
        //注意,和交换基本数据类型一样，交换对象也需要一个临时变量用来存储对象的内存空间
        com.zzd.study.oopcore.homeworkpart2.Person tmp;
        for (; index < persons.length - 1 ; index++) {
            for (int index2 = 1 ; index2 < persons.length-1 - index; index2++) {
                if (persons[0].getAge() > persons[1].getAge()) {
                    tmp = persons[0];
                    persons[0] = persons[1];
                    persons[1] = tmp;
                }
                if (index2 == persons.length - 1 && persons[persons.length - 1].getAge() < persons[index].getAge()) {
                    tmp = persons[index];
                    persons[index] = persons[persons.length - 1];
                    persons[persons.length - 1] = tmp;
                }
                if (persons[index2 + 1].getAge() > persons[index2].getAge()) {
                    low = persons[index2].getAge();
                    tmp = persons[index];
                    persons[index] = persons[persons.length - 1];
                    persons[persons.length - 1] = tmp;
                    if (persons[index2].getAge() < low) {
                        tmp = persons[index];
                        persons[index] = persons[persons.length - 1];
                        persons[persons.length - 1] = tmp;
                    }
                }
            }
        }
        return new com.zzd.study.oopcore.homeworkpart2.Person[0];
    }
}
