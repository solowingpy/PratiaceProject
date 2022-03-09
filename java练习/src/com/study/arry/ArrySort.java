package com.study.arry;

import java.util.Scanner;

/**
 * 数组顺序查找和二分查找的代码
 * 代码简单，但是有一种新的编程技巧
 * 如何利用一个“索引”或者是一个变量来描述“是否在数组中查找到了元素”
 * 如果用索引，思路是设置一个变量，初始化为-1
 * 如果查询到了结果，就把结果对应的下标赋值给这个变量
 * 循环结束后查询这个索引是否为-1，就知道有没有查询成功
 * @author zzd19
 */
public class ArrySort {
    static int[] arry = {56,67,87,78,89,56};
    public static void main(String[] args) {
        seqSort();
    }

    /**
     * 顺序查找的代码
     * 我尝试用布尔值来验证是否查找成功
     */
    static void seqSort(){
        //如果查找到了结果，就设置为true,后来只要查询这个变量的值就知道是否查询成功
        boolean flag = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你要查找的内容");
        int sortNum = myScanner.nextInt();
        for (int j = 0;j < arry.length;j++) {
            if (arry[j] == sortNum) {
                flag = true;
                System.out.println("查询成功，结果在数组当中的位置是"+ (j+1));
                break;
            }
        }
        if(!flag){
            System.out.println("对不起，没有查询到您想要的结果");
        }
    }

    /**
     * 二分查找
     */
    static void binarySort(){

    }
}
