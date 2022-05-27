package com.study.basicofjava;


/**
 * @author zzd19
 */
public class 变量与常量 {
    /**
     * 注意，static 为类的成员变量，与局部变量的不同目前仅在作用于的不同,静态变量程序运行开始就为其分配存储空间
     *
     */
    static int age=21;
    static final double PI=3.14;
    public  static void main(String[]a){
        /*
        下面一行为错误代码
         */
        //number=2554;
        //由于局部变量和成员变量重名，成员变量age在此方法内已失效
       //int age=22;
       age=20;
        System.out.println(age);
        System.out.println(PI);

    }
}

/**
 * 此类测试静态变量在引用结束后是否回归原值
 */
class 静态变量测试 extends 变量与常量{
    public static void main(String[]a){
        System.out.println(变量与常量.age);
    }
    void print(){
        System.out.println(age);
    }
}