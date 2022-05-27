package com.study.basicofjava.processcontrol;

/**
 * 首先说关于for结构体的一些细节
 * for循环体没有什么好说的需要注意的是循环体循环变量的初始化和循环变量的迭代可以有多条语句
 * 重要的是for循环的编程思想
 * 重要的for编程思想第一组：化繁为简，化死为活
 * 化繁为简：简单来说就是从一个问题的最简单部分入手，将一个问题拆分成几个小的需求，然后编写代码一步一步实现。
 * 比如这道题可以拆分为一下几个步骤：
 * 1.打印1-100这几个数
 * 2.输出的过程中，进行过滤，只输出9的倍数（用if来限定）
 * 3.定义一个变量来统计个数，满足条件时，变量自加
 * 4.定义一个变量来求和，满足条件时sun=+i
 * 化死为活：简单来说就是思考怎样把相同类型的问题举一反三
 * 像本题可以将两个端点值用两个变量来存储（end,start），通过改变这两个端点值来适应不同的情况，使程序变得灵活
 * @author zzd19
 */
public class ForDetailAndPratiace01 {
    /**
     * 打印1-100之间所有是九的倍数的整数并且统计出现的次数和这些数的总和
     */
    public static void main(String[] args) {
        //noinspection AlibabaUndefineMagicConstant
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        //noinspection AlibabaUndefineMagicConstant
        for(int i = start; i <= end; i++){
            if (i %9 == 0){
                System.out.println("1-100之间是九的倍数的整数是："+i);
                count++;
                sum += i;
            }
        }
        System.out.println("1-100之间是九的倍数的整数是的个数是"+count+"这些数的总和是"+sum);
    }

}
@SuppressWarnings("AlibabaUndefineMagicConstant")
class ForDetailAndPratiace02{
    /**
     * 第二题，打印出如下效果
     * 0 + 5 =5
     * 1 + 4 =5
     * 2 + 3 =5
     * 3 + 2 =5
     * 4 + 1 =5
     * 5 + 0 =5
     * 我的拆解需求的思路：
     * 打印出上面的需求，其实可以把加数和被加数分开打印即可
     * 所以要有一个变量承接加数，一个变量承接被加数
     */
    public static void main(String[] args) {
        int addend = 0;
        int summoned = 5;
        for(int i = addend,j = 5;i <= summoned && j>= 0;i++,j--){
            System.out.println(i+"+"+j+"="+summoned);
        }
        method2();
    }

    /**
     * 演示老韩的分析方法
     * 老韩的分析是从加数和和被加数的关系来解决问题
     * 被加数是由被加数减去加数得来的
     */
    static void method2(){
        int num = 5;
        for(int i = 0;i <=5;i++){
            System.out.println(i+"+"+(num - i)+"="+num);
        }
    }
}