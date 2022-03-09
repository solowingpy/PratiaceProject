package com.study.basicofjava.classandobject;

/**
 * @author zzd19
 * 这个类用来测式类的相关知识点
 * 创建了一个“人”类，用来演示上述知识点
 */
public class People {
    /**
     * age，
     */
    int age = 0;

    /**
     * 这是一个测试返回值类型为对象的方法的测试
     * @param age 这里代表年龄
     * @return 返回的是People的引用的一个对象或者是引用
     * 这个方法的意思是以年龄为参数，构造“人”这个对象
     */
    public People getPeople(int age){
        this.age = age;
        return this;
    }

}

/**
 *这个类主要用来测试上面的classTest方法
 */
class EnterClassTest {
    public static void main(String[] args) {
        new People();
        //实例化People类
        People people = new People();
        //下面两个代码我创建了People类的两个对象，分别用上面的"getPeople"的返回值创建这个两个对象，这就导致两个对象的属性”age“不同
        //但是age是动态的，每次被覆写后，都不会恢复原来的值，也不能保证”一个对象对应一个age“
        People person1 = people.getPeople(20);
        System.out.println("年龄"+person1.age);
        People person2 = people.getPeople(25);
        System.out.println("年龄"+person2.age);
    }
}
