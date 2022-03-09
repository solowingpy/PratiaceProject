package com.study.basicofjavalanguage.stringpratiace;

import com.study.basicofjava.stringpratiace.AbstractEqualsTest;

import java.util.Scanner;

/**
 * 这个类用来自主探索equal，toUpperCase，toUpperCase的探索
 * 这里你自己可以输入自己的字符串
 */
class Realize extends AbstractEqualsTest {

    private static char[] arr;
    /**
     * 下面这两个成员字符串是你可以用的字符串，用来实现对equal，toUpperCase，toUpperCase方法的探索
     * 这两个字符串原值是ConstructionOfString类中的成员变量str1和str2，只是在这里其值被本类的构造方法重写了而已
     */
    protected  String s1=str1;
    protected  String s2=str2;
    protected  String s3;

    /**
     * 构造方法（函数）集成三种字符串初始方法
     * 参数是一个字符数组
     * 扩展了父类的构造方法 ConstructionOfString
     */
    public
    Realize(char[] arr) {
        super(arr);

        System.out.println("请再输入一个你自己想自定义的字符串");
        System.out.println("扩展了了父类的构造方法");
        Scanner scanner = new Scanner(System.in);
        s3=scanner.nextLine();
    }

    /**
     *请使用被保护的字符串s1,s2和s3作为下面三个方法的素材
     * equal方法：用法str.equals(String otherstr),其中，str和otherstr是是要比较的两个字符串对象
     * 字符串也可以使用“==”进行比较，但是这样比较的是字符串的内存地址，并不比较两个字符串的内容
     * 而两个字符串的对象存放的内存地址不一样，用“==”比较永远返回false
     * java不能输出指针地址，没法演示两个字符串的地址不同
     */
    @Override
    protected void equalsCalc() {
      //TODO:请自定义探究equal方法的代码（使用s1，s2，s3）
    }

    /**
     * 重申toUpperCase用法：str.toUpperCase
     * 其中str是任意字符串
     */
    @Override
    protected void toUpperCase() {
        //TODO:请自定义探究toUpperCase方法的代码（使用s1，s2，s3）
    }

    /**
     * 重申toLowerCase的用法：str.toUpperCase
     * 其中str是任意字符串
     */
    @Override
    protected void toLowerCase() {
        //TODO:请自定义探究toLowerCase方法的代码（使用s1，s2，s3）
    }

    /**
     * 此方法将用户输入的字符串转换为Realize的构造器能够识别的字符数组类型
     */
    static void inject(){
        System.out.println("请输入你要进行构造的字符串：");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        scanner.close();
        //count相当于字符串input的下标
        int count =0;
        arr = new char[input.length()];
        while (count < input.length()) {
            arr[count]=input.charAt(count);
            count++;
        }

    }
    public static void main(String[] args) {
        inject();
        Realize realize = new Realize(arr);
        realize.toUpperCase();
        realize.toLowerCase();
        realize.equalsCalc();
    }
}



