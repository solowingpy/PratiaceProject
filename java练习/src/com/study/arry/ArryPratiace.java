package com.study.arry;

import org.jetbrains.annotations.NotNull;

/**
 * @author zzd19
 * 韩顺平数组练习
 */
@SuppressWarnings("AlibabaUndefineMagicConstant")
public class ArryPratiace {
    public static void main(String[] args) {
        arryPratiace01();
        arryPratiace02Fix();
        arryPratiace03Method1();
        arryPratiace03Method2();
    }

    /**
     * 创建一个char类型的包含26个元素的数组
     * 然后将大写的A-Z输入数组
     * 思路：
     * 1.定义一个数组，动态初始化
     * 2.循环控制变量i
     * 3.定义一个char类型的变量character，初始化为'A'
     *   借助循环变量“i”的迭代，将这个变量赋值进数组
     *   (B=A+1)
     */
    static void arryPratiace01(){
        char[] arr = new char[26];
        char character = 'A';
        //遍历数组
        for (int i  = 0;i < arr.length;i++){
            //让character的值正好随着i的变化而变化，从而循环出A-Z
            arr[i] = (char) (character + i);
        }
        //再进行遍历，并输出
        for (char c : arr) {
            System.out.print(c);
        }
    }

    /**
     * 求出一个数组的最大值，并得到对应下标
     * [4,-1,9,10,23]
     * 思路：
     * 1.创建一个数组，静态初始化，存放题干当中要求的数
     * 2.创建一个变量max,用来存放可能的最大值
     * 4.遍历数组，用if语句找出最大值
     * @deprecated 发生数组下标越界异常的代码
     */
    @Deprecated (forRemoval = true)
    static void arryPratiace02(){
        int[] arr = {4,-1,9,10,23};
        int max = 0;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] < arr[i+1]){
                max = arr[i+1];
            }
        }
        System.out.println("这个数组的最大值是"+max);
    }

    /**
     * 改正上一个方法的错误
     * 思路没有问题，但是学习数组是要注意下标越界的情况
     * 比如上一个方法判断max是否为最大值时条件写成了"arr[i] < arr[i+1]"
     * 这样会导致程序运行时循环到下标为4的元素时，会强制判断下标为5这样根本不存在的元素
     * 应该修正逻辑，让假设的最大值去和当前循环变量所控制的对应下标的元素
     * 也就是判断的条件改为"max < arr[i]"
     * 另外，要输出最大值的下标的话，只要定义一个变量maxIndex，最大值的下标=maxIndex即可
     */
    static void arryPratiace02Fix(){
        int[] arr = {4,-1,9,10,23};
        int max = 0;
        int maxIndex = 0;
        for (int i = 0;i < arr.length;i++){
            if (max < arr[i]){
                maxIndex = i;
                max = arr[i];
            }
        }
        System.out.println("这个数组的最大值为"+max+"下标是"+maxIndex);
    }

    /**
     * 数组翻转的第一种方法
     * 倒序赋值，比较暴力的一种方法
     * 需要在原数组的基础上定义一个新的数组
     * 思路：
     * 1.定义两个数组，一个存放原始数据，另一个存放翻转之后的数组
     * 2.过程好理解，就是将第一个数组的最后一个值赋给第二个数组的第一个
     *   然后将第二个值赋给倒数第二个，以此类推
     */
    static void arryPratiace03Method1(){
        int[] arry1 = {11,22,33,44,55,66};
        int[] arr2 = new int[arry1.length];
        for (int i = 0;i < arr2.length;i++){
            arr2[i] = arry1[arry1.length - 1 - i ];

        }
        /*
           附加：如果要优化空间的话，可以利用jvm的垃圾回收机制
           翻转完毕后，可以将arr2的地址赋给arr1
           这样jvm会认为arr1不会再使用，从而回收arr1所占用的空间
         */
        for (int j : arr2) {
            System.out.print(j + " ");
        }

    }

    /**
     * 数组翻转的第二种方法
     * 找规律，只用一个数组完成数组的翻转
     * 思路推导：
     * 首先在纸上数组元素的交换过程，方便寻找规律
     * 经过在纸上推导，发现只要进行三次操作就能将这个数组翻转完毕
     * 推广开来就是数组长度的一半
     * 被交换的两个元素的下标变化规律是
     * 数组长度-1-当前循环计数器的值
     */
    static void arryPratiace03Method2(){
        int[] arry1 = {11,22,33,44,55,66};
        for (int i = 0; i < arry1.length/2;i++){
            //两个数直接交换是无法实现的，所以要有一个辅助变量temp
            int temp = arry1[i];
            arry1[i] = arry1[arry1.length - 1 - i]; 
            arry1[arry1.length - 1 - i] = temp;
        }
        for (int j : arry1) {
            System.out.print(j + " ");
        }
    }

    /**
     * 用于将一个数组打印出来
     * @param arry1 要打印显示的数组
     */
    static void read(int @NotNull [] arry1){
        System.out.println("变化后的新数组元素为：");
        for (int j : arry1) {
            System.out.print(j + "\t");
        }
    }
}
