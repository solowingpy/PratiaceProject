package com.study.basicofjava;

import java.util.Scanner;
/**
 * @author zzd19
 * 此类用来实验各个运算符的用法，并测验返回值
 */
public class 运算符 {
    /**
    主方法借助三角形的判断演示&运算符的工作过程
     */
public static void main(String[]arg){
    Scanner scanner = new Scanner(System.in);
    int i=scanner.nextInt(),i1=scanner.nextInt(),i2 = scanner.nextInt();
    if ((i+i1>i2)&(i+i2>i1)&(i2+i1>i)){
        boolean b=(i+i1>i2)&(i+i2>i1)&(i2+i1>i);
        System.out.println(b+"构成了三角形");
    }
    else{
        boolean b2=(i+i1>i2)&(i+i2>i1)&(i2+i1>i);
        System.out.println(b2+"没构成三角形");

    }
}

}

/**
 * 此类测试三元运算符
 */
class 位运算测试 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i2 = scanner.nextInt();
        Boolean bool = i > 3;
        System.out.println(bool);
        show();
    }

    /**
     * show方法用来测试位运算的实质，右移n位，相当于*2的n次方，左移n位，相当于除以2的n次方
     */
    static void show() {
        int i = 1;
        int i2 = i << 8;
        int i3 = 32767;
        int a4 = i3 >> 4;
        System.out.println(i2);
        System.out.println(a4);
    }
}

/**
 * @authr zzd19
 * 这和个类演示
 * 关于i++和++i：
 * 如果++在变量前面，则表示首先在后面的一条语句中使用变量，然后在自增
 * 如果++在后面，则表示先自增，然后在后面的语句中输出变量
 */
class CaculateDetail{
    public static void main(String[] args) {
        System.out.println();
    }
}