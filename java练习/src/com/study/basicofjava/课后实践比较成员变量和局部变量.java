package com.study.basicofjava;

/**
 * @author zzd19
 * 这个类用来区分局部变量和成员变量
 */
public class 课后实践比较成员变量和局部变量 {
    /*
     * 声明成员变量，一个静态，一个动态
     * 成员变量的作用域在整个类中，别的类也可以调用，如果是静态的，则某个方法使用后就会恢复原值，动态的则相反
     *局部变量作用域在这个方法中，出了方法将无效
     * 下面的实例变量（动态成员变量）做调试用
     */

       //int age = 0;
         public int total = 0;

    static int age = 21;
    public static void main(String[] arg){
        String name;
        //下面和成员变量重名的局部变量age做调试用
        int age2 =22;
         //age2=22;
         name="张三";
         System.out.println(name);
         System.out.println(age2);
          test();

    }
    void test55(){
        System.out.println();
    }

    /**
     * 从这里可以看出使用即使在主方法中定义与成员变量age同名的变量使之失效，但是失效范围仅限主方法
     */
   static void test(){
        age=23;
        System.out.println(age);
    }
}

/**
 * 此类用来测试成员变量的作用范围
 */
class test{
    public static void main(String[]a){
        //这里显示了成员变量的调用方式,换证明了成员变量在引用结束后还回恢复原值
        System.out.println(课后实践比较成员变量和局部变量.age);

    }
    void yes(){
        float a =50>60?5:6;

    }
}
