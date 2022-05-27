package com.study.arry;

import static com.study.arry.ArryPratiace.read;

/**
 * @author zzd19
 * 生成一个随机长度，随机内容的一维数组，并打印到控制台当中
 * 用来在纸上验证算法
 */
public  class GetRandomArry {
    public static void main(String[] args) {
        //运行100次，获得100个随机数组
        for(int i = 1;i <= 100;i++){
            read(generateRandomArry());
        }

    }

    /**
     * 工具类(指封装了很多静态方法的类),必须封闭构造方法
     */
    private GetRandomArry(){
    }

    /**
     * 首先创建一个一维数组，长度未知
     * 使用{@link Math#random()}来随机获取数组长度
     * 随机数获取方法：
     * 每个随机数经过加减乘除运算一遍，每次加减乘除的运算值都都是随机数
     * 经过如此运算之后再写入数组
     * @return 打印在控制台上的一维数组，在主方法里引用{@link ArryPratiace#read(int[])}方法打印一维数组
     * @see ArryPratiace#read(int[])
     */
    public static int[] generateRandomArry(){
        //生成随机数组长度
        int randomLength = (int)(Math.random() * 10 + 1);
        //写入数组的随机数
        int randomNumber;
        int[] randomArry = new int[randomLength];
        for (int i = 0; i < randomLength; i++) {
            randomNumber = (int)(Math.random() * 10 + 1);
            //randomNumber进行随机四则运算
            randomNumber += (int)(Math.random() * 10 + 1);
            randomNumber -= (int)(Math.random() * 10 + 1);
            randomNumber *= (int)(Math.random() * 10 + 1);
            randomNumber /= (int)(Math.random() * 10 + 1);
            randomArry[i] = randomNumber;
        }
        return randomArry;
    }
}