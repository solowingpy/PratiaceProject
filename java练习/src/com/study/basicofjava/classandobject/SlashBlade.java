package com.study.basicofjava.classandobject;

/**
 * @author zzd19
 * 相比SetPeople类中通过构造方法的参数不同来实现“一个对象一个成员变量”，其实重写构造方法是实现“一个对象一个成员变量”的更好的方法
 * 通过多态的方法，即“重写同一个方法”来实现上述“一个对象一个成员变量”是个更好的方式
 */
public class SlashBlade {
    int attackDamage;
    String material;
    /**
     * 构造方法，可以理解为一种初始化对象的方式，定义多种构造方法可以让多个对象拥有自己独特的特征，这也是多态的一种
     * 构造方法常用来初始类中的成员变量，即类的属性，下面进行演示
     * 实际上对构造方法进行重写（定义不同类型的参数，参数个数，以及参数类型），也是从多角度描述对象特征的一种方法
     * 下面的构造方法从攻击力的角度描述一个拔刀剑的对象
     */
    public SlashBlade(int attackDamage) {
        //用this关键字使参数重定向为成员变量attackDamage,否则无法在构造方法中使用类的成员变量
        this.attackDamage = attackDamage;
        System.out.println("这把拔刀剑的攻击力为"+attackDamage);
    }
    /**
     * 这个构造方法从材料方面来构建拔刀剑对象
     */
    public SlashBlade(String material){
        this.material = material;
        System.out.println("这把剑的锻造材料为"+material);
    }
    /**
     * 实际在无参的构造方法中可以使用this关键字引用有参的构造方法
     * 要注意只能在无参的构造方法中的第一行使用this关键字调用有参的构造方法
     * 下面为示例
     */
    public SlashBlade(){
        this(4);
        System.out.println("不说的话就造一把攻攻击力为"+attackDamage+"的木剑");
    }

    public static void main(String[] args) {
        SlashBlade blade1 = new SlashBlade();
        SlashBlade blade2 = new SlashBlade("钻石");
        SlashBlade blade3 = new SlashBlade(7);
        SlashBlade blade4 = new SlashBlade(5);
        System.out.println(blade1.attackDamage+blade1.material);
        System.out.println(blade2.material);
        System.out.println(blade3.attackDamage);
        System.out.println(blade4.attackDamage);
        //验证用构造方法初始化对象是否做到“一个对象一个变量”
        //通过实验发现，用构造方法初始化的对象确实做到了“一个对象一个变量”

    }
}
