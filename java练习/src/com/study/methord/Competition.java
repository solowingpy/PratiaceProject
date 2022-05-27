package com.study.methord;

import java.util.Scanner;

/**
 * @author zzd19
 */
public class Competition {
    private static final String RESULT_1 = "Tom赢";
    private static final String RESULT_2 = "Tom平手";
    private static final String RESULT_3 = "Tom输";
    /**
     * 打印比赛结果的方法
     * 其中对于决定比赛结果的方式还要再优化一下
     * 只用if分支显得很死板,代码不优雅,可以用数据结构来优化
     * @param tom--tom的类对象,携带者tom的出拳信息
     * @param computer--电脑的类对象,携带者电脑的出拳信息
     */
    public void competition(Tom tom,Computer computer){
        tom.generateRandomGameNumber();
        computer.generateRandomGameNumber();
        if (tom.getGameNumberTom() == 0 ) {
            switch (computer.getGameNumberComputer()) {
                    case 1 -> System.out.println(RESULT_1);
                case 2 -> System.out.println(RESULT_3);
                default -> System.out.println(RESULT_2);
            }
        }
        if (tom.getGameNumberTom() == 1 ) {
            switch (computer.getGameNumberComputer()) {
                case 1 -> System.out.println(RESULT_2);
                case 2 -> System.out.println(RESULT_1);
                default -> System.out.println(RESULT_3);
            }
        }
        if (tom.getGameNumberTom() == 2 ) {
            switch (computer.getGameNumberComputer()) {
                case 1 -> System.out.println(RESULT_3);
                case 2 -> System.out.println(RESULT_2);
                default -> System.out.println(RESULT_1);
            }
        }


    }

    /**
     * 流程:利用for循环确定比赛次数
     * 实例化对象——调用出拳方法--调用competition方法--打印结果
     */
    public static void main(String[] args) {
        Tom tom = new Tom();
        Computer computer = new Computer();
        Competition competition = new Competition();
        int counter;
        System.out.println("请输入他们进行比赛的次数");
        Scanner scanner = new Scanner(System.in);
        counter = scanner.nextInt();
        for (int i = 0;i <= counter;i++){
            competition.competition(tom,computer);
        }
    }
}
