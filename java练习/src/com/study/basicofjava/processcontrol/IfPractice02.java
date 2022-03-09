package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * @author zzd19
 * 模拟出票系统，根据淡旺季和年龄来打印票价
 */
public class IfPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mouths = scanner.nextInt();
        //判断用户输入的月份是否正确
        //noinspection AlibabaUndefineMagicConstant
        if(mouths <= 1 || mouths >= 12){
            if (mouths >= 4 && mouths <= 10){

            } else {

            }
        }
    }
}
