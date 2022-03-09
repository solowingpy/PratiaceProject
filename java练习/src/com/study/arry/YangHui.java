package com.study.arry;

import java.util.Scanner;

/**
 * 打印杨辉三角
 * 杨辉三角规律：
 * 1.每一行数的数量和列数相等
 * 2.每一行的第一个数和最后一个数都是1
 * 3.除了第一个数和最后一个数之外，每一行的其他数遵循一下规律
 *   (这里将二维数组的下标看成坐标系中的x和y，将杨辉三角放在坐标系里)
 *   arry[i][j] = arry[i - 1][j] + arry[i - 1][j - 1]
 * @author zzd19
 */
public class YangHui {
    public static void main(String[] args) {
        yangHuiTriangle();
        System.out.println("请输入你要打印的层数");
        Scanner myScanner = new Scanner(System.in);
        int rowNum = myScanner.nextInt();
        yangHuiTriangleImproved(rowNum);

    }

    /**
     * 打印一个6行的杨辉三角
     */
     private static void yangHuiTriangle(){
        int[][] arry = new int[6][];
        //外层循环完成每一行一维数组的初始化
        for (int i = 0; i < arry.length; i++) {
            //为每一行的一维数组开辟空间
            arry[i] = new int[i + 1];
            /*
            总结：思考编程问题时不要将简单问题复杂化
                 像杨辉三角，只有两种情况
                 第一个和最后一个元素赋值为1
                 其他的元素按照规律来赋值
             */
            for (int j = 0; j < arry[i].length; j++) {
                if(j == 0||j == arry[i].length - 1){
                    arry[i][j] = 1;
                } else {
                    arry[i][j] = arry[i - 1][j] + arry[i - 1][j - 1];
                }
            }
        }
        TwoDimensionalArryPratiaceUse.twoDimensionalRead(arry);
    }

    /**
     *
     * @param rowNum 用户输入的行数
     */
    private static void yangHuiTriangleImproved(int rowNum){
        int[][] arry = new int[rowNum][];
        for (int i = 0; i < arry.length; i++) {
            //为每一行的一维数组开辟空间
            arry[i] = new int[i + 1];
            /*
            总结：思考编程问题时不要将简单问题复杂化
                 像杨辉三角，只有两种情况
                 第一个和最后一个元素赋值为1
                 其他的元素按照规律来赋值
                 内层循环遍历的时候要注意
                 区分二维数组里面一维数组的长度
                 和二维数组的元素个数
             */
            for (int j = 0; j < arry[i].length; j++) {
                if(j == 0||j == arry[i].length - 1){
                    arry[i][j] = 1;
                } else {
                    arry[i][j] = arry[i - 1][j] + arry[i - 1][j - 1];
                }
            }
        }
        TwoDimensionalArryPratiaceUse.twoDimensionalRead(arry);
    }
}
