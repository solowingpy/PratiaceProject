package com.study.basicofjava.stringpratiace;

import java.util.Scanner;


public class Append {
    void add(String str){
        StringBuilder stringBuilder=new StringBuilder("Text");
        int num = 0;
        int integer = num;
        int stopFlag =10;
        for(int i =0;i<=stopFlag;i++){
            num++;
            stringBuilder.append(integer);
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.print("请输入：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Append append = new Append();
        append.add(str);
    }
}
