package com.study.arry;



/**
 * 一个简单的验证排序(升序)算法的类
 * 只实现简单的功能
 * 接受一个测试数组，如果排序完成就显示排序完成
 * 如果没有排序完成就显示排序失败后的数组
 * 暂时不提供时间复杂度过高提示，因为只测试10各元素的数组
 * 只是为了初步验证算法的可行性
 * 死循环检测暂时不做，涉及到多线程和内部类，过于复杂
 * @author zzd19
 */
public class SortArithmeticTest {
    public static void main(String[] args) {
        //首先去除长度小于5的数组
        while(true){
            if(args.length <= 5){
                //重新生成数组
                arry = GetRandomArry.generateRandomArry();
            }
            if (arry.length > 5) {
                break;
            }
        }

    }
    /**
     * 数组是否已经排序好的标志位
     * 初始化为true
     */
    boolean isSorted = true;
    /**
     * 测试用的数组
     * 这个数组采用随机方法生成
     * 连长度也是随机的
     */
    static int[] arry = GetRandomArry.generateRandomArry();

    /**
     * 这个方法里面是算法逻辑
     * @param arry 进行测试的数组
     * @return 排序完成后返回一个新数组
     */
    static int[] sortArithmetic(int[] arry){
        int index = 0;
        int index2 = 1;
        while(index < arry.length){
            //index2索引指向的数和index索引指向的数交换
            if((arry[index2] < arry[index2+1]) && (arry[index2] < arry[index])){
                int temp = arry[index];
                arry[index] = arry[index2];
                arry[index2] = temp;
            }
            index2++;
            //检测一个数已经排序完成，并且防止数组下标越界
            if((arry[index] < arry[index + 1]) && (index2 == arry.length - 2)){
                //index索引自加，准备下一个数的排序
                index++;
                //重定向index2索引
                index2 = index + 1;
            }
        }
        return arry;
    }
    /**
     * 检测数组是否排序完成
     * 遍历数组，因为是升序排序，当检测到
     * 有一个数小于后面的数时，说明数组还没有排序完成
     * @return 没有排序完成，返回false,否则返回true
     * @param arry 运行排序算法后监测的数组
     */
    static boolean detectSequence(int[] arry){
        for (int i = 0; i < arry.length - 1; i++) {
            if(arry[i] > arry[i+1]){
                return false;
            }
        }
        return true;
    }
}
