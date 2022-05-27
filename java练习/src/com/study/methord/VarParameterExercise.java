package com.study.methord;

/**
 * 可变参数
 * 可变参数其实很好理解，就是一个长度可以变化的数组
 * 但要注意可变参数必须是形参列表中的最后一个参数
 */
public class VarParameterExercise {
    public static void main(String[] args) {
        showScore("123",44,22,10);
    }
    public static void showScore(String name,int... score) {
        System.out.println(name);
        for (int j : score) {
            System.out.println(j);
        }
    }
}
