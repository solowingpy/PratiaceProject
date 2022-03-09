
package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * @author zzd19
 */
public class 流程控制练习 {
    /**
     *在java7之后，switch语句中的表达式不仅可以是整形或子符型，还可以是字符串型，下面的类将演示
     */
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.next();
        switch (str){
            case "山东":
                System.out.println("荷花路六号");
                break;
            case "理工":
                System.out.println("名称");
                break;
            default:System.out.println("输入错误");
        }
    }
}

/**
 * 此类演示while语句和do while语句的区别
 */
class DoWhile{
    public static void main(String[] args){
        int i=0;
        int j=1;
        //while循环会在循环体进行前检查循环进行的条件，这里故意设置了不能够进行循环的条件，和下方do while循环进行对比
        while (i>1){
            System.out.println("while循环进行了");
        }
        //do while语句会无条件执行一次循环体的语句，比如下方的语句会打印“循环进行了的信息”
        do{
            int e=0;
            e++;
            System.out.println("do while循环进行了"+e+"次");
        }while(j>10);
    }
}

/**
 * 此类用来演示for语句的另一个变种：foreach语句，多用在数组的遍历搜索
 */
class ForEach{
    /**
     *foreach遍历演示
     */
    public static void main(String[]a){
        int[] arry ={1,2,3,4,5,6};
        //t1为遍历次数标志位
        int t1=0;
        //开始遍历
        //t1显示遍历了多少次
        for (int j: arry){
            //打印遍历的结果
           System.out.print(+j);
           System.out.print(" \t");
           t1++;
        }
        System.out.println("遍历了"+t1+"次");

    }
}

/**
 * 演示循环控制相关知识
 */
class ControlOfCycle{
    /**
     *主方法尝试打印乘法表为例来演示各个循环控制
     */
     public static void main(String[] a){
         //break跳出内层循环（循环嵌套的情况下，break语句只跳出包含着它的那一层循环）
         //想跳出更外层的循环则必须借助标签
         int i;
         int j;
         for (i=1;i<10;i++){
             for(j=1;j<10;j++){
                 System.out.println(i+"X"+j+"="+i*j);
                 //这里用一个if语句限制被乘数，使其只打印出被乘数只到2的乘法表
                 if(j==2){
                     break;
                 }
             }
         }
         System.out.println("-------end--------");
     }
     }
/**
 * 这个类用来演示利用标签来在内层循环里用break语句控制外层循环
 */
class BreaksOutsideNested {
    public static void main(String[] args) {
        //和上个类一样，这里同样用打印出九九乘法表的方式演示
        //不过这次会尝试利用Loop标签来限制乘数
        Loop:for (int i = 1; i < 10; i++) {
            for (int j=1;j < 10;j++ ){
                System.out.println(i+"X"+j+"="+i*j);
                //先利用不带标签的break结束内层循环（限制被乘数到5）
                if(j==5){
                    break;
                }
                //再利用带标签的break结束外层循环（限制乘数到3）
                if(i==3){
                    break Loop;
                }
            }
        }
        System.out.println("-----end-----");
    }
}
/**
 * 演示continue语句的相关知识，包括用Loop标签控制循环
 * 将结合遍历的知识点进行演示
 */
class ContinueTest{

    private static int[] arr;

    public static void main(String[]a){
        arr = new int[]{1,2,3,4,5,6,7,8,9,10};
          //t为遍历标志位
          //j存放遍历结果，便于筛选
         loop:for (int j: arr) {
             //遍历筛选：去除偶数，在这里continue标签的Loop表示结束for循环
             if (j%2==0){
                 continue loop;
             }
             System.out.println(j);
         }
         //continueTest();
    }

    /**
     * 此方法用来单纯演示continue语句的作用
     * 用do while循环演示continue语句的跳过功能
     * 实际上，如果在只循环一次的do while语句里用continue语句，极易导致循环体的语句无法执行，例如下面的例子
     * continue语句放在了输出语句的前面，IDEA会报错，显示“不可到达语句”，其他的java编译器如Eclipse会给出警告
     * 可以看出IDEA还是比较智能的
     */
   static void continueTest(){
        int i=0;
        int j=60;
        //为了演示，我故意设置了一个只循环一次的do while语句，来验证continue语句的相关特性
        do{
            //continue;
            System.out.println("循环更新");
            continue;
        }
        while (j>60);
    }
}

