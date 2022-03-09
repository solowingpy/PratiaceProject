package com.study.arry;

import static com.study.arry.ArryPratiace.read;

/**
 * @author zzd19
 * 二维数组编程练习
 */
public class ArryHomeWork {
    public static void main(String[] args) {
        insertAndSort();
    }

    /**
     * 有一个升序数组，要求在这个数组中插入一个数后仍然保持升序
     * 可以轻易的发现整个程序分为两步，一个是插入，另一个是插入后重新排序
     * 插入很简单，new一个新数组并取代老数组即可
     * 这里说一下重新排序思路：
     * 我打算用二分法对数组进行排序
     * 首先new一个长度比原来多一个空间的数组，数组最后一位的值是要插入的值，其他位置拷贝原来的数组的值
     * 获取数组中间位置的值，与要插入的值比较，如果中间位置的值大于要插入的值
     * 就从数组前面进行遍历
     * 如果中间值小于要插入的值，就从数组最后一位向前遍历
     * 遍历数组，进行比较，直到找出比要插入的值小的数
     * 将找到的这个数的后一个数与最后一个数交换
     * 交换完成后，最后一个数与前面的数比较，直到大于要比较的数
     *
     */
    private static void insertAndSort(){
        int[] arry = {10,12,45,90};
        int insertNum = 23;
        //二分算法所需的中间值
        int midNum;
//      中间数的下标
        int midIndex;
        //创建一个新数组，最后的元素是要插入的数
        int[] newArry = new int[arry.length + 1];
        System.arraycopy(arry, 0, newArry, 0, newArry.length - 1);
        newArry[newArry.length - 1] = insertNum;
        //将扩容后的新数组的地址赋值给老数组
        arry = newArry;
        midNum = arry[arry.length / 2];
        midIndex = arry.length / 2;
        //        二分算法——要寻找的值大于中间值的情况
        if(insertNum > midNum){
//            从从数组的最后一个元素开始遍历，直到中间值所在下标
            for(int i = arry.length - 1;i >= midIndex;i--){
                //插入的值大于遍历到的值
                if (insertNum > arry[i]){
                     int temp = arry[i + 1];
                     arry[i + 1] = arry[arry.length - 1];
                     arry[arry.length - 1] = temp;
                     break;
                }
            }
        }
        //        二分算法——要寻找的值小于于中间值的情况
        if (insertNum < midNum){
            for(int j = 0;j <= midIndex;j++){
                if (insertNum < arry[j]){
                    int temp = arry[j];
                    arry[j] = arry[arry.length - 1];
                    arry[arry.length - 1] = temp;
                    break;
                }
            }
        }
        /*
        对插入的值进行重新排序
        由于最后排序的是升序数组，所以用贪心算法从后往前匹配
        一直匹配到遍历到的数比最后一个数小为止
        此时将后一位的数和最后一个元素交换

         */
        int sortIndex = arry.length - 2;
        while(arry[arry.length - 2] > arry[arry.length - 1]){
            if (arry[arry.length - 1] > arry[sortIndex]) {
                //交换两数的位置
                int temp = arry[sortIndex + 1];
                arry[sortIndex + 1] = arry[arry.length - 1];
                arry[arry.length - 1] = temp;
                //重新将下标索引定位到数组最后一个元素
                sortIndex = arry.length - 1;
            }
            sortIndex--;
        }
        read(arry);
    }
}
