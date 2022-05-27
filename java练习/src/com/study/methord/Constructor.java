package com.study.methord;

/**
 * 构造器
 * 构造器的作用是初始化对象，而不是开内存空间
 * 开辟内存空间的工作是仅仅用new关键字
 * This关键字：
 * this可以从字面意思理解成“这个类的引用”,如果在字段前加上了this,这个字段就是指的是本类得
 * 成员变量
 * this的本质其实是堆空间中一个隐藏的属性
 * 这个属性的内存指向就是本对象所在的内存空间
 * 可以用hashcode打印
 * 另外，谁调用了this,这个this就指那一个对象中的属性
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
        System.out.println("this的hash值"+this.hashCode());
    }

    public static void main(String[] args) {
        Constructor com = new Constructor();
        System.out.println(com.age);
        //此时构造方法中的this应该和这里输出相等的值
        Constructor wangzehao = new Constructor("王泽浩",20);
        System.out.println(wangzehao.hashCode());
        //这里的输出应该和this中的hashcode一样
        System.out.println(wangzehao.name + wangzehao.age);
        //下面的代码中，每两组的hash值是一样的
        Constructor com2 = new Constructor("122",11);
        com2.info();
        Constructor com3 = new Constructor("123",11);
        com3.info();
    }
    public void info(){
        System.out.println(this.hashCode());
    }
}
