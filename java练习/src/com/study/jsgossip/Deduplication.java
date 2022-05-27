package com.study.jsgossip;

import static com.study.arry.ArryPratiace.read;

/**
 * pink老师js教程：数组去重java重置版
 * 删除数组制定元素
 */
public class Deduplication {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 4, 0, 3, 0, 8, 6, 6};
        int[] array3 = {9, 3, 1, 9, 1, 9, 1, 1, 3};
        int[] array4 = {9,3,1,9,1,9,1,1,3};
        int[] newArray = deduplication(array, 1);
        read(newArray);
        read(deduplicationVersion2(array4));
        int character1 = statistics(array3);
        System.out.println(character1);
    }

    /**
     * 1.传统数组缩减思路
     * 2.删除指定位置的元素后,返回新数组
     * 3.重复上述过程
     */
    public static int[] deduplication(int[] args, int deleteNumber) {
        int count = 0;
        for (int arg : args) {
            if (arg == deleteNumber) {
                count++;
            }
        }
        int[] newArray = new int[args.length - count];
        int j = 0;
        int i = 0;
        while (j < args.length) {

            if (args[j] == deleteNumber) {
                j++;
                continue;
            }
            newArray[i] = args[j];
            i++;
            j++;
        }
        return newArray;
    }

    /**
     * 数组去重，这次要求删除所有重复的元素，不再只删除特定的元素
     * 用双指针调用pop方法删除数组多余元素
     */
    public static int[] deduplicationVersion2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length;) {
                if (j == array.length - 1) {
                    break;
                }
                if (j == i) {
                    j++;
                }
                if (array[j] == array[i]) {
                    array = pop(array, j);
                }
            }
            int k = 0;
            int l = 0;
            while (k < array.length){
                if (l == k && k != array.length - 1) {
                    l++;
                }
                if (array[k] == array[l]) {
                    array = pop(array,l);
                    k++;
                }
                if (k == array.length - 1) {
                    break;
                }
                k++;
            }
        }
        return array;
    }

    /**
     * 模拟js中的pop方法
     */
    public static int[] pop(int[] array, int index){
        int[] newArray = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length && k < newArray.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }

    /**
     * 先去重,再遍历
     */
    public static int statistics(int[] array) {
        int character1Count = 0;
        int character2Count = 0;
        int character1;
        int character2;
        int resultCharacter = 0;
        int[] reference = deduplicationVersion2(array);
        int index1 = 0;
        while (index1 < reference.length) {
            character1 = reference[index1];
            for (int k : array) {
                if (k == reference[index1]) {
                    character1Count++;
                }

            }

            if (index1 != reference.length - 1) {
                index1++;
                character2 = reference[index1];
                for (int i : array) {
                    if (i == reference[index1]) {
                        character2Count++;
                    }
                }
            } else {
                character2 = reference[index1];
                for (int j : array) {
                    if (j == character2) {
                        character2Count++;
                    }
                }
                break;
            }
            if (character2Count > character1Count) {
                resultCharacter = character2;
            } else {
                resultCharacter = character1;
            }

        }
        return resultCharacter;
    }

}
