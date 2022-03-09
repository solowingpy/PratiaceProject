package com.study.operator;

import java.util.Scanner;

/**
 * @author zzd19
 * 用三元运算符求三个数中的最大数
 * 三元运算符格式：表达式(能返回true或false的表达式)？表达式1 : 表达式2
 * "表达式1"和 "表达式2" 可以理解为一个具体的操作，和三元运算符前面的表达式有关
 * 可以理解为三元运算符式运算符的一种，主要进行“根据条件进行赋值”的操作
 * 也可以理解为一个简单的if...else语句
 */
public class TernaryOperatorPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max1 = Math.max(num1, num2);
        //int max2 = max1 > num3 ? max1 : num3;
        int max2 = Math.max(max1, num3);
        System.out.println(max2);
     }
}
