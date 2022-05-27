package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * doWhile相关小练习
 * @author zzd19
 */
public class DoWhilePratiace {
    public static void main(String[] args) {
        pratiace01();
        pratiace02();
    }

    /**
     * 输出1-200之间能被5整除但是不能被3整除的数
     * 这次尝试直接灵活的写法
     */
    static void pratiace01(){
        int startNum = 1;
        int endNum = 200;
        int divideNum1 = 5;
        int divideNum2 = 3;
        do{
             //和while循环一样，只不过doWhile循环把循环体和循环变量迭代放到了“do”结构里面
            if ((startNum % divideNum1 == 0) && (startNum % divideNum2 != 0)){
                System.out.println(startNum);
            }
            startNum++;
        } while (startNum <= endNum);
    }
    /**
     * 如果李三不还钱，则讨债人闪电五连鞭，直到李三说还钱为止
     * 分析(由简入难)
     * 此题用拆分法，此题的需求可以分为三个部分
     * 1.输出“闪电五连鞭”5次
     * 2.问“还不还钱”
     * 3.判断李三有没有还钱意愿（根据变量agreed是"y"还是“n”来判断）
     */
    static void pratiace02(){
        //循环变量初始化
        Scanner scanner = new Scanner(System.in);
        //循环标志变量
        boolean flag= true;
        char agreed;
        do {
            //noinspection AlibabaUndefineMagicConstant
            for (int i = 0; i < 5; i++) {
                System.out.println("闪电五连鞭");
            }
            System.out.println("还不还钱？(y/n)");
            agreed = scanner.nextLine().charAt(0);
            //noinspection AlibabaUndefineMagicConstant
            if(agreed == 'y' || agreed == 'Y'){
                flag = false;
            }
        }
        while(flag);
    }

    /**
     * 按照老韩的思路再做一遍
     * 化繁为简分析，还是先把需求拆分一下，先寻找最简单的来实现
     * 分析发现，有三个需求：1.问还不还钱 2.闪电五连鞭 3.判断是否还钱
     * 比较容易实现的是输出“问还不还钱和”“闪电五连鞭”这两个需求
     * 然后再考虑如何实现“判断是否还钱”这个需求
     */
    static void pratiace02Plus(){
        //创建承接回答答案的变量“answer”
        Scanner scanner = new Scanner(System.in);
        char answer;
        do {
            //实现两个最简单的需求
            System.out.println("闪电五连鞭");
            System.out.println("还不还钱？(y/n)");
            answer = scanner.next().charAt(0);
            //实现最后一个需求，只需判断“answer“变量里面的内容就可以了
        }
        while (answer != 'y');
    }
}
