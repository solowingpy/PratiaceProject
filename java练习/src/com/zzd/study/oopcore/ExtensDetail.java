package com.zzd.study.oopcore;

public class ExtensDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(" 第二个对象");
        Sub sub2 = new Sub("1",3);
        System.out.println("第三个对象");
        Sub sub3 = new Sub(2.5,3);
        //类属性调用遵循就近原则，若子类有属性和父类重名，优先调用子类属性
        System.out.println(sub.score);
//        Base base = new Base();
        
    }
}
