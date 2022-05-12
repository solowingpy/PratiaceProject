package com.study.methord;

/**
 * 构造器
 * 构造器的作用是初始化对象，而不是开内存空间
 * 开辟内存空间的工作是仅仅用new关键字
 */
public class Constructor {
    String name;
    int age;
    public Constructor(){
        age = 18;
    }

    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Constructor com = new Constructor();
        System.out.println(com.age);
        Constructor wangzehao = new Constructor("王泽浩",20);
        System.out.println(wangzehao.name + wangzehao.age);
    }
}
