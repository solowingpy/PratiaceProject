package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * @author zzd19
 * 韩顺平课上的两个while练习，目的是熟悉while的语法，就当是每日一练了
 * 这些练习都会有一个写死版本和不写死版本两个版本
 * 并且尽量用老韩的“化繁为简”法来分析
 * 本次练习有两个题目：第一题:
 * 打印1-100之间所有所有能被三整除的数
 * 第二题：打印40-200之间所有的偶数
 */
public class WhilePratiace {
    public static void main(String[] args) {
        pratiace01();
        pratiace01Plus();
        pratiface02();

    }

    /**
     * 打印1-100之间所有所有能被三整除的数
     * 分析方法：和ForDetailAndPratiace01.java中的类似
     * 这个方法将范围写死
     */
    static void pratiace01(){
        //循环四要素：循环变量的初始化
        int num = 0;
        //四要素之二：循环的控制表达式（返回布尔值）
        while (num <= 100){
            //四要素之三：循环体
            if (num % 3 == 0){
                System.out.println(num);
            }
            //要素四：循环变量迭代
            num++;
        }
    }

    /**
     * 还是上一题，只不过我不把变量写死
     * 所以就成了：求0到任意一个数之间，能被三整除的整数
     */
    static void pratiace01Plus(){
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int num = scanner.nextInt();
        while (flag <= num){
            //四要素之三：循环体
            if (num % 3 == 0){
                System.out.println(num);
            }
            //要素四：循环变量迭代
            num++;
        }
    }

    /**
     * 打印40-200之间所有的偶数
     * 和上面的分析方法一样，我直接写灵活变换的代码
     */
    static void pratiface02(){
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int num = scanner.nextInt();
        while (flag <= num){
            //四要素之三：循环体
            if (num % 2 == 0){
                System.out.println(num);
            }
            //要素四：循环变量迭代
            num++;
        }
    }
/*
  总结：设计循环时可以先写一个特定情况的实例，在把这个实例抽像成灵活的
  这样好想
  还要注意设计循环结构的四要素：循环变量的初始化、循环条件（表达式返回布尔值）、循环体、循环变量的迭代
 */
}
