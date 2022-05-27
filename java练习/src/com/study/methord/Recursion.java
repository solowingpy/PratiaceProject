package com.study.methord;

/**
 * 递归相关练习
 */
public class Recursion {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
        System.out.println(pratiace02(5));
    }

    /**
     * 练习阶乘的方法
     * 方法的返回类型
     * 方法的形参
     * 方法的名字
     * 方法体
     * 递归注意事项：1.谁调用了这个方法，就返回谁
     * (在内存图上的表示是将上一个方法栈当中的返回值替换到下一个栈中的方法调用处，其余位置不变)
     * 2.小心无限递归
     * 3.注意引用数据类型递归时不同的栈可能会共享数据
     * 4.不同的栈局部变量都是独立的，不会相互影响
     * 递归解决阶乘问题
     */
    public static int factorial(int number){
        //阶乘的初始数，从1开始
        if(number == 1){
            return 1;
        }
        return factorial(number - 1) * number;
    }
    /**
     * 递归求斐波数列，要求给出一个整数n，求出对应的数
     * 方法的返回类型--一个数组
     * @param sequence--序号
     * 思路：这个题有两种情况
     *      一个是序号<=2的情况，这时候返回1
     *      一个是序号>2的时
     */
    public static int pratiace02(int sequence){
        if(sequence == 1 || sequence == 2){
            return 1;
        }
        else {
            return pratiace02(sequence - 1) + pratiace02(sequence - 2);
        }
    }
}
