package com.study.basicofjava;

import java.util.*;
/**
 * @author zzd19
 */
public class unicode字符输出实验 {

    public  static void main(String[] a){
         char c;
         int  p1,p2;
         char word2='】',word3='{',word4=']';
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个字符对应的整数编码：");
         p1=scanner.nextInt();
         c=(char) p1;
         System.out.println(p1+"在Unicode字符表的对应字符为"+c);
         //在println方法中完成对char类型的转换（println里的其中的参数为int型）
         System.out.println("字符"+word2+"对应的编码为"+(int) word2);
         System.out.println("字符"+word3+"对应的编码为"+(int)word3);
         System.out.println("字符]"+word4+"对应的编码为"+(int)word4);
   }

}
