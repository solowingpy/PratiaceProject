
package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * 存放循环控制的家庭作业
 * @author zzd19
 */
@SuppressWarnings("AlibabaUndefineMagicConstant")
public class Homework {
    public static void main(String[] args) {
        homework01();
        homework02();
        homework03();
        homework04();
        homework05();
        homework06Fix();

    }

    /**
     * 假设一个人有1000000元，经过一个路口，需要缴费，规则如下：
     * 当现金>50000时，每次交5%
     * 当现金<=50000时，每次交1000，问：该人可以经过多少次路口(用while,break实现)
     * 第一眼可以分析到有两种情况，一种是金钱>=50000,还有有一种是金钱<50000
     * 但是注意，题目中往往有隐含条件，当金钱<1000即无法支付过路费时，应当结束循环
     */
    static void homework01(){
        int totalCash = 100000;
        int passCount = 0;
        while (true){
            if (totalCash >= 50000){
                totalCash -= totalCash * 0.05;
                passCount++;
            }
            if (totalCash < 50000){
                totalCash -= 1000;
                passCount++;
                if (totalCash < 1000){
                    break;
                }
            }
        }
        System.out.println("该人可以经过"+passCount+"次路口，剩余"+totalCash+"元钱");
    }

    /**
     * 经典的c语言入门题：打印水仙花数
     * 水仙花数：指一个三位数，其各个位上数字立方和等于其本身
     * 思路分析：这里需要用到一个数学思想：用已知推导未知
     * 假设要判定的数是185，我们可以很轻易的推导出其百位数是185%100
     * 十位数是185/10-10,重点是个位数的计算公式，很明显要用推出来的十位数计算公式来推导
     * 通过观察，首先发现要求个位数的话，可以先求出十位数和个位数，即“85”
     * 但是通过计算，发现无法与我们已经求出来的计算公式产生任何关联
     * 所以要换思路，再次观察后，发现百位整数180和185有关系，而180正是185/10*10(在整形的情况下确实是这样)
     * 而个位数正是185-（185/10*10）,或者再简化这个模型的话，就是185%10、
     * 将这一规律进行推广，就得到个位数的计算公式了
     */
    static void homework02(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = myScanner.nextInt();
        while (num > 999 || num < 99){
            System.out.println("非法输入，请重新输入");
            num = myScanner.nextInt();
        }
        int hundredDigit = num / 100;
        int tens = num / 10 - 10;
        int digits = num % 10;
        if (hundredDigit*hundredDigit*hundredDigit + tens*tens*tens + digits*digits*digits == num){
            System.out.println(num+"是水仙花数");
        } else {
            System.out.println(num + "不是水仙花数");
        }
    }

    /**
     * 要求输出1-100之间不能被5整除的数，每五个一行
     * 思路：
     * 1.定义num存储要判定的数
     * 2.for循环在1-100之间循环
     * 3.循环体内过滤能被5整除的数(能被5整除：num%5 == 0),if-continue过滤、
     *   没有被过滤的数就被输出
     * 4.声明计数器count,当输出成功时count++
     * 5.判断count是否==5，如果为真就输出换行，count清0
     */
    static void homework03(){
        int num = 0;
        int count = 0;
        for(; num <= 100;num++){
            if(num % 5 == 0){
                continue;
            }
            System.out.print(num+"\t");
            count++;
            if(count == 5){
                System.out.println();
                count = 0;
            }
        }
    }

    /**
     * 输出小写的a-z及大写的Z-A、
     * 思路：
     * 1.用一个char类型的变量来承接输出的字符
     * 2.fpr循环来输出
     */
    static void homework04(){
        char character = 65;
        for (;character <= 122;character++){
            if( character <= 90 || character >= 97 ){
                System.out.print(character +" ");
            }
        }
    }

    /**
     * 求出1-1/2+1/3-1/4+5/1...1/100
     * 思路：
     * 1.要有一个循环控制变量当循环计数器
     * 2.要有一个变量承接sum的值
     * 3.先求1+2+3+...+100的值，再推导1-2+3-4+5..100是怎么写的
     *   最后再推导1-1/2+1/3-1/4+5/1...1/100的值
     * 4.推导1-2+3-4+5..100，发现循环计数器为偶数时两数相减
     *   为奇数时两数相加
     * 5.推广到1-1/2+1/3-1/4+5/1...1/100来，分母是不变的，始终为1
     *   分子遵循上文推导的规律，所以，只要写如何判断奇偶数的语句就行
     */
    static void homework05(){
        //循环计数器
        double num = 1;
        //每次运算的总和
        double sum = 0;
        for (; num <= 100 ; num++) {
            //计数器为偶数的情况
            if(num % 2 == 0){
                sum -= 1/num;
            } else {
                sum += 1/num;
            }
        }
        System.out.println(+sum);
    }

    /**
     * 求 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)的值
     * 思路分析：
     * 将这个表达式拆开，并将括号内的内容看成一个整体
     * 你会发现，这其实就是两个(1+2+3+...+n)的表达式嵌套之后的结果
     * 外层的表达式有100项这每一项就是求出(1+2+3+n(n为当前项))的值
     * 所以这个题应该有两层循环，两个变量分别保存内层和外层表达式的和
     * 外层循环求外层表达式的值，内层循环求内层表达式的值
     * @deprecated 错误的代码，仅供展示
     */
    @Deprecated (forRemoval = true)
    static void homework06(){
        //内层循环的和
        int innerSum = 0;
        //外层循环的和
        int outerSum = 0;
        for (int i = 1;i <= 100;i++){
            for (int j = 1;j <= 100;j++){
                innerSum += j;
            }
            outerSum += innerSum;
        }
        System.out.println("表达式的值为：" + outerSum);
    }

    /**
     * 上一个方法运行错误，经调试，我的思路大体是没有问题的，但是一些小细节上出了点问题
     *  将这个表达式想成两个嵌套循环是没有问题的，但是具体实施的时候，第二层循环的控制出了问题
     * 应该是“j<=i”才能让第二层循环按照正确的次数运行，因为第一层循环的i既是表明了表达式是第几项
     * 又标明了内层循环应该进行的次数，这一点分析错误
     * 第二点，其实内层循环是整个表达式的基本组成部分，算出内层表达式的值足矣，并没有很清楚的认识到这一点
     */
    static void homework06Fix(){
        //内层循环的和
        int sum = 0;
        //外层循环的和

        for (int i = 1;i <= 100;i++){
            for (int j = 1;j <= i;j++){
                sum += j;
            }

        }
        System.out.println("表达式的值为：" + sum);
        }
    }


