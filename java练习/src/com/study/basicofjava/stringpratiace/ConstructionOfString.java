package com.study.basicofjava.stringpratiace;

import java.util.Scanner;

/**
 * @author zzd19
 * 首先演示字符串的初始化方法
 * 这个类用构造方法集中演示字符串的初始化方法
 */
public class ConstructionOfString {
    /**
     *构造方法（函数）集成三种字符串初始方法
     * 参数是一个字符数组
     */
      ConstructionOfString(char[] arr) {
          //方法一：使用字符数组创建字符串对象
          String s=new String(arr);
          str1=s;
          System.out.println("第一种方法初始化完成，结果为："+s);
          //方法二：使用字符串的构造方法截取字符数组的值创建字符串对象，格式为
          //String(要截取的字符数组，开始截取的地方（int），截取结束的地方（int）)
          Scanner scanner=new Scanner(System.in);
          System.out.print("请输入你要截取的字符串的起始位和结束位：");
          int i=scanner.nextInt();
          int j=scanner.nextInt();
          String s1=new String(arr,i,j);
          str2=s1;
          System.out.println("第二种方法初始化完成"+s1);
          //方法三：使用字符串常量构造字符串变量
          String s2="字符串初始化";
          str3=s2;
          System.out.println("第三种方法初始化完成"+"结果为"+s2);
          System.out.println("构造字符串方法初始化完成");

    }
    protected static String str1;
      protected static String str2;
     static String str3;
}

/**
 * 这个类演示字符串的基本常用处理方法
 * 父类为上面的ConstructionOfString
 */
class Solution extends ConstructionOfString {
    /**
     * 这里引用了父类集成三种字符串初始方法的构造方法
     * 这里因为我定义了父类的构造方法，所以必须借助本类的构造方法完成初始化
     * 其实可以将参数的字符数组做成这个类的成员变量，供这个类的所有方法一起使用
     * 但是我想让每一个方法都有自己的字符串，所以就没这么做
     */
    public Solution(char[] arr) {
        super(arr);

    }
    /**
     * 程序开始后最好键入2 4这两个数来获得最佳效果
     */
    public static void main(String[] args) {
        //join方法演示"+"运算符连接字符串
        join();
        //take方法演示字符串查找方法
        take();
        //subString方法演示提取字符串,返回一个子字符串
        substringTest();
        //trim方法去除字符串的空格
        trim();
        //replace方法替换字符串中的指定字符或字符串
        replace();
        //演示判断字符串开头或结尾的方法starts with和ends with
        judges();
    }

    /**
     * starts with和ends with使用方法相同，都是字符串对象.starts with/ends with(要进行判断的字符或字符串)
     * 注意这个方法返回的是boolean类型的数值
     */
    private static void judges() {
        String descStr=str1+str2;
        boolean cArr= descStr.startsWith("abc");
        boolean cardStr=descStr.endsWith("Abc");
        System.out.println("starts with方法引用结果"+cArr+"  ends with方法引用结果"+cardStr);
    }

    /**
     * 演示replace方法，replace方法用来替换指定的字符串，此方法返回新字符串
     * replace方法用法：字符串对象.replace(字符串中存在的字符 目标字符或字符串)
     * 注意要替换的字符必须严格区分大小写，否则替换会无效
     */
    private static void replace() {
         String str=str1+str2;
         String s=str.replace("a","A");
         System.out.println("没替换之前的字符串为："+str);
         System.out.println("替换之后的字符串为："+s);
         String sep=str.replace("abc","ABC");
         System.out.println("replace方法参数还可以是字符串，示例"+sep);
    }

    /**
     * trim用法：任意字符串对象.trim()，注意只去除前导和尾部空格，中间的空格不去除
     */
    private static void trim() {
        String s="   ab  c  d  a  c  cdf dad  ";
        System.out.println(s.length()+"是原字符串的长度");
        System.out.println(s.trim().length()+"是去掉空格后字符串的长度");
        System.out.println("修改后的字符串是: "+s);
    }

    static void join(){
        char[] arr={'a','b','c','d','d','e','f','g'};
        new Solution(arr);
        //演示length方法(函数)获取字符串长度
        String s=str1+str2;
        int length=s.length();
        System.out.println("合并后的字符串为"+str1+""+str2+" 合并后的字符串长度为："+length);
    }
    static void take(){
        //用indexOf方法（函数）返回某一段字符开始出现的位置，返回值为int
        //用法：字符串对象.indexOf(查找的字符或字符串)
        String s=str1+str2;
        //如果没检索到字符串，则返回-1
        int locator=s.indexOf("a ");
        int locator2=s.indexOf("a");
        System.out.println(locator+","+locator2);
        //用lastIndexOf返回要查找的字符串的最后一次出现的位置
        //用法都一样没有索引到都是返回-1
        int locator3=s.lastIndexOf("ef");
        System.out.println(locator3);
        //gc是强制启动垃圾回收机制的函数（方法），意在程序结束后回收程序运行所占用的资源
    }
    static void substringTest() {
        String s=str1+str2;
        String s1=s.substring(0,6);
        System.out.println(s1);
    }

}

