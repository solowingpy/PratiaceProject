package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * @author zzd19
 * 多重循环练习01：从键盘输入三个班的学生成绩信息，假设每个班有五个人，并求出
 * 各个班的平均分和所有班级的平均分
 * 思路分析：由简入难：
 * 这个程序可以分为两个方法来执行，分别是
 * 接受学生信息，并计算每个班的平均分，然后再求出所有班级的平均分
 */
@SuppressWarnings("AlibabaUndefineMagicConstant")
public class MulForExercise01 {
    public static void main(String[] args) {
        calculateOneAvg();

    }

    /**
     * 接受学生信息，并计算每个班的平均分
     * 分析这个方法（由简入难）：
     * 首先最实现最简单的需求:假设只有一个班，输入并打印这一个班的成绩信息
     * 再递进一层：在只有一个班的情况下，怎样求出这个班的平均成绩
     * 在递进一层：假设有多个班，怎样接收并输出多个班的学生成绩信息（不使用数组）
     * 最后实现完整需求：接收每个班的学生的成绩并求出一个班级的平均分
     * 如果再加上筛选每个班的合格人数的话，只要再加上一个计数器，当输入的时候如果有合格的成绩，计数器计一即可
     */
    static void calculateOneAvg(){
        //创键一个学生的成绩变量，用来承接输入的成绩
        int stuScore;
        //存储
        int stuNum;
        int classNum = 1;
        int classScoreSum = 0;
        int allScoreSum = 0;
        int operateFlag = 1;
        int allClassScoreAvgResult;
        int classScoreAvgResult;
        final int stuAmount = 5;
        int passableAmount =  0;
        //创建扫描器
        Scanner myScanner = new Scanner(System.in);
        //外层循环：实现多个班的输入循环

        for(;classNum <= 3;classNum++){
            //noinspection AlibabaUndefineMagicConstant
            System.out.println("请输入第"+(classNum)+"班的成绩信息");
            for (stuNum = 1; stuNum <=5; stuNum++){
                System.out.println("请输入第"+ stuNum +"位的学生成绩");
                stuScore = myScanner.nextInt();
                //实现输入数值的检查
                //noinspection AlibabaUndefineMagicConstant
                while(stuScore < 0 || stuScore > 100 ){
                    System.out.println("输入无效，请重新输入");
                    stuScore = myScanner.nextInt();
                }
                if(stuScore >= 60){
                    passableAmount++;
                }
                classScoreSum += stuScore;
                allScoreSum += stuScore;
                operateFlag++;
            }
            classScoreAvgResult = classScoreSum / stuAmount;
            System.out.println("第"+classNum+"班的平均成绩为"+classScoreAvgResult);
            classScoreSum = 0;
        }
        allClassScoreAvgResult = allScoreSum / operateFlag;
        System.out.println("所有班级的平均分为："+allClassScoreAvgResult);
        System.out.println("三个班的及格人数为"+passableAmount);
    }

}
