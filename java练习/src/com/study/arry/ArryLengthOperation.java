package com.study.arry;

import java.util.Scanner;

/**
 * @author 老韩
 * 练习老韩讲的扩容数组的方法
 * 这里可以利用数组的地址拷贝功能
 * 大体思路是创建一个新数组，这个新数组的长度是原来数组+1
 * 然后将这个数组的地址指向原数组
 * 这样原数组就会被当做垃圾清理掉
 * 程序运行首先会扩增一个元素，然后再问用户是否继续添加
 * 先执行程序再问用户是否继续添加，这个循环是次数不确定的，并且具有强制性
 * 所以使用do-while+break循环结构控制
 */
@SuppressWarnings("AlibabaUndefineMagicConstant")
public class ArryLengthOperation {

    private static int[] arry1;

    public static void main(String[] args) {
        arryAdd();
        arryReduce();
    }
    static void arryAdd(){
        arry1 = new int[]{1,2,2};
        Scanner scanner = new Scanner(System.in);
        //用户要添加的值
        int num;
        //接受用户意图
        char character;
        do {
            int[] newArray = new int[arry1.length + 1];
            /*
              将老数组的值拷贝在新数组里
              其实按照常规来说，不应该使用循环遍历来复制数组
              应该使用java提供的方法System.arryCopy()
             */
            for (int i = 0; i < arry1.length; i++) {
                newArray[i] = arry1[i];
            }
            System.out.println("请输入你要添加的值：");
            num = scanner.nextInt();
            newArray[newArray.length - 1] = num;
            //然后将新数组的地址赋值给老数组，老数组由jvm回收内存空间
            arry1 = newArray;
            System.out.println("是否要继续添加(Y/N)");
            character = scanner.next().charAt(0);
            if(character == 'N' || character == 'n'){
                break;
            }

        } while (true);

    }

    /**
     * 数组缩减
     * 和数组扩容一样，不同的是这次要求当原数组缩减至最后一个元素时
     * 提示程序结束
     */
    static void arryReduce(){
        arry1 = new int[] {1,22,33,4,5};
        Scanner scanner = new Scanner(System.in);

        //接受用户意图
        char character;
        do {
            int[] newArray = new int[arry1.length - 1];
            /*
              将老数组的值拷贝在新数组里
              其实按照常规来说，不应该使用循环遍历来复制数组
              应该使用java提供的方法System.arryCopy()
             */
            for (int i = 0; i < arry1.length; i++) {
                newArray[i] = arry1[i];
            }
            //首先检测数组是否只剩一个元素
            if(arry1.length == 1){
                System.out.println("数组只剩下一个元素，不能再继续缩减了");
                break;
            }
            //然后将新数组的地址赋值给老数组，老数组由jvm回收内存空间
            arry1 = newArray;
            System.out.println("是否要继续删除(Y/N)");
            character = scanner.next().charAt(0);
            if(character == 'N' || character == 'n'){
                break;
            }

        } while (true);
        ArryPratiace.read(arry1);
    }


}
