
package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * @author zzd19
 *使用while与自增运算符遍历数组
 */
public class CirclePratiace {
    public static void main(String[] args){
        //创建一个字符串数组
        String []a={"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "布谷鸟", "灰纹鸟", "百灵鸟"};
        //i为遍历数组索引
        int i=0;
        System.out.println("我的花园里有很多鸟，种类包括：");
        while(i<9){
            System.out.println(a[i]);
            i++;
        }

    }
}

/**
 * 实现双层循环输出九九乘法表
 */
class MultiplicationTable{
    public static void main(String[]args){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("    \t");
            }
            System.out.println(" ");
        }
    }

}
/**
 * 用两个实例来演示循环中断控制
 * 第一个实例，创建一个字符串数组，使用foreach遍历，如果发现“老鹰”则立刻中断循环
 * 第二个实例，创建一个二维数组，双层foreach循环遍历
 * 如果发现有小于60的数则立刻跳过这个数所在的那一组数的索引
 */
class BreakCycleTest{
      public static void main(String[] args){
          System.out.println("---------中断单层循环的例子---------");
          String[] str= {"白鹭","丹顶鹤","黄骊","鹦鹉","乌鸦","喜鹊","老鹰","灰纹鸟","灰纹鸟","老鹰"};
          System.out.println("在发现第一只老鹰之前，都有什么鸟");
          int i=0;
          //while设置的变量i是检索字符数组的
          while (i<10){
              System.out.println("有:"+str[i]);
              i++;
              //这里引用的equals方法是根据IDEA的建议改的
              //这里我本来想用“str==”来进行判断的
              //以后会演示equals方法
              if("老鹰".equals(str[i])){
                  break;
              }
          }
          System.out.println("------continue中断双层循环的例子------");
          //创建二维数组，一个大括号就代表一组数
          int[][] myScores = new int[][] { { 67, 78, 63, 22, 66 }, { 55, 68, 78, 95, 44 }, { 95, 97, 92, 93, 81 } };
          System.out.println("开始检索数组中大于60的数，遇到60以下的数就跳过");
          loop:for (int j=0;j<3;j++){
              for (int k=0;k<5;k++){
                  //这里if语句表示如果检测到了一组数据中有小于60的数，则立刻跳过这一组数的索引
                  if(myScores[j][k]<60){
                      continue loop;
                  }
                  System.out.println("数组中大于60的数有："+myScores[j][k]);
                  System.out.println("------End------");
              }
          }
          
      }
}
/**
 * 这是一个输出空心菱形的代码，我没有看懂，希望有大佬能够解释一下，将解释注释到代码里
 */
class Diamond{

}
/**
 *计算10的阶乘
 */
class Factorial {
    public static void main(String[] a){
        int i=16;
        System.out.println(i+"的阶乘为："+factorial(i));
    }
    static long factorial(int k){
        long result = 1;
        for(int i=0;i<k;i++){
             result*=(k-i);
        }
        return result;
    }

}

/**
 * 上面的程序的变种，即接收用户的数，然后求阶乘
 */
class Transfer extends Factorial {
     public static void main(String[] a){
         Scanner scanner = new Scanner(System.in);
         System.out.print("请输入要计算的阶乘：");
         int k = scanner.nextInt();
         factorial2(k);
         System.out.println(k+"的阶乘是："+factorial2(k));
     }
     static long factorial2(int g){
         long result = 1;
         if (g<0||g>17){
             System.out.println("输入不合规，大于17，小于0的数会被屏蔽");
             System.exit(0);
         }
         else if(g==0){
             System.out.println("0的阶乘为1");
             System.exit(0);
         }
         else{
             for(int i=0;i<g;i++){
                 result*=(g-i);
             }

         }
         return result;
    }
 }

/**
 * 遍历21世纪的闰年，每行只输出5个闰年
 */
class SearchLeapYear{
     public static void main(String[] args){
         //count为换行计数器
         int count = 0;
         //筛选世纪闰年
         for(int year=2000;year<=2100;year++){
             if (year%100==0&&year%400==0){
                 System.out.print(year);
                 System.out.print("   ");
                 count++;
             }
         //筛选普通闰年
             else if (year%100!=0&&year%4==0){
                 System.out.print(year);
                 System.out.print("    ");
                 count++;
             }
             if(count==5){
                 System.out.print("\n");
                 //清零计数器
                 count=0;
             }
         }
     }
 }

/**
 *输出21世纪不是闰年的年份
 */
class SearchLeapYearModify {
    public static void main(String[] args) {
        int count = 0;
        //筛选世纪闰年
        for (int year = 2000; year <= 2100; year++) {
            if (year % 100 == 0 && year % 400 != 0 || year % 100 != 0 && year % 4 != 0) {
                System.out.print(year);
                System.out.print("   ");
                count++;
            }
            if(count==5){
                System.out.print("\n");
                //清零计数器
                count=0;
            }
        }
    }
}
