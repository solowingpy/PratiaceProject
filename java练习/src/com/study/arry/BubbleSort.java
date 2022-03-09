package com.study.arry;

/**
 * 冒泡排序
 * 思路：
 * 从小到大排序数组
 * 其本质是每一轮通过遍历方式确定一个数的位置
 * 每一轮循环的比较方法和确定数组中的最大(小)数的方法一样
 * 可以说，冒泡排序是寻找最大数的改进版
 * @author zzd19
 */
public class BubbleSort {

    private static int[] arry;

    public static void main(String[] args) {
        BubbleSort.arry = new int[]{1,2,3,4,5};
        int[] arry = BubbleSort.arry;
        //外层循环，每一轮外层循环确定一个数的位置,一共需要确定4次
        for (int i = 0; i < arry.length - 1; i++) {
            //            内层循环，如果前面的元素小于后面的，就交换
            for(int j = 0; j < arry.length - 1; j++) {
                if (arry[j ] > arry[j + 1]) {
                    int temp = arry[j + 1];
                    arry[j + 1] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        ArryPratiace.read(arry);
        bubbleSortFix();
    }

    /**
     * 对上面的排序进行改进
     *
     * 上面的排序出现的问题是当确定玩一个数的位置后
     * 进行了无意义的重复比较
     * 这里一定要学习如何利用外层或者是循环外部的变量控制内层循环
     * 以及布尔类型的变量如何用来控制循环
     */
    static void bubbleSortFix(){
        /*
          指明数组是否排好序的变量
          一旦数组是排序好的，变量默认为false
          反之则为true
         */
        boolean flag = false;
        /*
        循环检测数组中是否有没有排序好的元素，一旦出现没有排序好的元素
        立即将flag设置为true
         */
        for (int i = 0;i < arry.length - 1 ; i++){
            if (arry[i] < arry[i + 1]){
                flag = true;
                break;
            }
        }
        for (int i = 0; i < arry.length - 1; i++) {
            if (flag){
                System.out.println("这个数组已经排序好，不需要再进行排序了");
                break;
            }
            /*
             这里一定要学会如何利用外层循环或者是
             外部变量来控制内层循环的循环配置
              内层循环的推导思路：
              在进行冒泡排序总体思路分析的时候，
              发现每进行一轮排序，确定一个元素的位置后，内层循环的循环次数就会-1
              这时候就应该把循环变量的变化写在纸上，分析其中的数量关系
            */
            for(int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j ] > arry[j + 1]) {
                    int temp = arry[j + 1];
                    arry[j + 1] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        ArryPratiace.read(arry);
    }
    /*
    * 总结：布尔类型的变量并不是毫无用处
    * 就像这个练习中演示的那样，当使用单纯的if语句无法判断某一种情况是
    * 就要定义一个布尔类型的变量并专门编写一个程序结构来验证某一个情况是否成立
    * 这个练习用在了判断整个数组是否处于已经排序好的状态，而这种状态的判断不是
    * 用一句if语句就能判断完成的，必须结合循环
    * 这种技巧估计在面向对象是会经常用到
    * 2.要学会在嵌套循环中使用外部变量或者是外部循环的控制变量
    *   来控制某一层循环的循环次数
    * 3.写程序之前的总体思路分析很重要，有时需要在纸上演算
    *   完成总体思路分析时发现代码实现较复杂，则需要运用“化繁为简，先死后活”的思想来寻找规律
    *   一步步推导出代码实现，遇到数量关系较为复杂的多层循环，则可以先在纸上分析
    *   循环控制变量之间的数量关系再写代码
    * */
}
