
package com.study.basicofjava.stringpratiace;

import java.util.Date;
import java.util.Scanner;

/**
 * @author zzd19
 * 这个类用来测试字符串的格式化方法
 */
public class FormationOfString {
     @SuppressWarnings("DefaultLocale")
     public static void main(String[]args){
          Date date = new Date();
          //输出了一个没有格式化之前的系统时间
          String string =String.format("%tY",date);
          String string2=String.format("%tB",date);
          String string3=String.format("%te",date);
          System.out.println("运行时截取的系统时间为(没有被格式化):"+date);
          //现在尝试对系统时间这个字符串进行代码格式化
          System.out.println("运行时截取的系统时间为："+string+"年"+string2+string3+"号");
          //尝试在print方法中格式化字符串，在此方法将会尝试不用或少用创建字符串的方式减少初始化时内存的开销
          System.out.println("运行时截取的系统时间为:"+String.format("%tY年%tB%te号",date,date,date));
          transform();
     }

    /**
     * 这是个示例演示的是非常简单的将一个10进制数转变成16进制数的方法
     */
     static void transform(){
         Scanner scanner = new Scanner(System.in);
         int result = scanner.nextInt();
         scanner.close();
         System.out.println("整形数"+result+"转变成16进制数后的数为："+String.format("0x%x",result));
     }
}

/**
 * 正则测试
 * 其中matches方法为严格匹配，只有要匹配的字符串结果完全与正则表达式相同时，结果才为true
 */
class Judgement{
    public static void main(String[] args){
        String regex="[L]op|[lm]l";
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        scanner.close();
        if(s.matches(regex)){
            boolean bool=s.matches(regex);
            System.out.println("true"+bool);
        }
        else{
            System.out.println("false");
        }
    }
}
