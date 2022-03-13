package com.study.arry;

import java.util.Scanner;

import static com.study.arry.ArryPratiace.read;

/**
 * @author zzd19
 * 二维数组编程练习
 */
public class ArryHomeWork {
    public static void main(String[] args) {
        insertAndSort();
        insertAndSortFix();
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
        initSortIndex:数组倒数第二个元素的索引
        当数组倒数第二个元素小于最后一个元素时，则判定为数组已经排序完毕
         */
        int initSortIndex = arry.length - 2;
        int sortIndex = arry.length - 2;
        while(arry[initSortIndex] > arry[arry.length - 1]){
            if (arry[arry.length - 1] > arry[sortIndex]) {
                //交换两数的位置
                int temp = arry[sortIndex + 1];
                arry[sortIndex + 1] = arry[arry.length - 1];
                arry[arry.length - 1] = temp;
                //重新将下标索引定位到数组最后一个元素
                sortIndex = arry.length - 2;
            }
            sortIndex--;
        }
        read(arry);
    }

    /**
     * 另一种实现的思路：
     * 其实这道题分为两部分，首先对要插入的数进行定位，然后再插入
     * 解简单的数组题，可以定义一个索引变量来来存储关键元素的位置信息
     * 可以这样分析：要保证插入一个新元素之后保证原数组的顺序不变
     * 就必须先确定这个元素要插入的位置，这时就应该定义一个索引变量，先存储位置信息
     * 方便进一步的分析
     * 首先从从头遍历数组，如果要插入的数组大于指针变量指向的元素，就说明这个元素的后一个位置就是
     * 插入的数应该待的位置
     * 此时有两种额外情况：
     * 1.插入的数比数组当中的任何一个数都小，说明此时待插入数的正确位置是数组的第一个元素
     * 2.插入的数比数组当中的任何一个数都大，说明待插入数的位置超过了原数组的索引，位置在原数组的长度+1
     * 定好位置之后，把这个位置的索引存储起来，用作他用
     * 接下来考虑在不影响原数组顺序的情况下完成插入
     * 接下来就要创建新数组了
     * 创建新数组后，可以使用算法对插入后的新数组重新排序，但是这样相当不必要
     * 最简单的方法是直接拷贝数组，空出插入数的索引即可
     * 这时候记录的索引就发挥作用了
     * ps:这种解法比较暴力
     */
    private static void insertAndSortFix(){
        int[] arry = {10,12,23,45,90};
        int index = -1;
        Scanner myScanner = new Scanner(System.in);
        int insertNum = myScanner.nextInt();
        //遍厉数组，定位索引
        for (int i = 0; i < arry.length; i++) {
            if(arry[i] > insertNum){
                index = i;
                break;
            } else if (arry[0] > insertNum){
                index = 0;
                break;
            } else if (arry[arry.length - 1] > insertNum){
                index = arry.length;
                break;
            }
        }
        int[] newArray = new int[arry.length + 1];
        for(int i = 0,j = 0;i < arry.length;i++){
            if (i == index) {
                newArray[i] = insertNum;
            } else {
                newArray[i] = arry[j];
                j++;
            }
        }
        arry = newArray;
        read(arry);
    }

}
