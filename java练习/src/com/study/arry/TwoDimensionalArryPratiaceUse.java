package com.study.arry;

import org.jetbrains.annotations.NotNull;

/**
 * @author zzd19
 * 二维数组知识点
 * 1.二维数组和一维数组一样，只不过二维数组的基本组成元素是一维数组
 *   所以二维数组的声明有两个部分，第一部分是声明一个二维数组有几个一维数组
 *   第二部分是声明每一个一维数组有几个基本元素
 * 2.二维数组的内存分布和一维数组不一样，二维数组存放的是一维数组的地址
 *   这些一维数组里面存放的才是基础元素
 */
public class TwoDimensionalArryPratiaceUse {
    public static void main(String[] args) {
        uncertainColumn();
    }
    /**
     * 写一个二维数组的读取方法
     * 要注意二维数组的组成和一维数组不一样，二维数组的
     * 基本元素是一维数组，然后在这些一维数组里面才是我们想要的基本元素
     * 所以要用两层循环遍历
     * 第一层循环遍历二维数组当中的一维数组
     * 第二层循环才是遍历一维数组中的基本元素
     * @param arry 要读取的特定二维数组
     */
     static void twoDimensionalRead(int[] @NotNull [] arry){
        //arry.length:二维数组里面的一维数组数量
        for (int[] ints : arry) {
            //arr[i].length:二维数组中每个一维数组的长度

            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

    /**
     * 演示二维数组“列数不确定”的初始化方式
     * 输出如下图案：
     * 1
     * 12
     * 123
     * 思路：二维数组初始化的时候，可以将一维数组的元素个数空出来
     *     等确定了之后再填
     *     首先观察每个一维数组被开辟了几个空间
     *     通过观察每个一维数组开辟空间数和循环次数相近
     *
     */
    private static void uncertainColumn(){
        //表示二维数组里面有三个一维数组，但是每一个一维数组的空间不确定
        int[][] arry = new int[3][];
        for (int i = 0; i < arry.length; i++) {
            //为二维数组里的每一个一维数组开辟空间
            //注意这里的i是从0开始计数
            arry[i] = new int[i + 1];
            //内层循环给每一个一维数组赋值
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j] = j+1;
            }
            System.out.println();
        }
        TwoDimensionalArryPratiaceUse.twoDimensionalRead(arry);
    }
    private TwoDimensionalArryPratiaceUse(){

    }
}
