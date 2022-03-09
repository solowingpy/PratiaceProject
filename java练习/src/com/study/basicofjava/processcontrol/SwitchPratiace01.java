package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * 这个类用来完成老韩课上讲的switch课堂练习
 * 下面先强调几个switch语句的细节
 * @author zzd19
 * switch语句没什么好说的，强调几个细节就够了
 * 1.switch语句在每个case分支一般都要用break来结束循环，如果在一个case分支里面没有加上brak语句的话，就会发生"穿透"现象
 * 即这个case分支的语句执行完毕后，程序会一直继续执行下一个case分支里面的内容，一直到遇见break语句为止
 * 注意如果发生穿透现象，如果没有break语句来停止，就连defult语句都会执行
 * 2.switch(表达式)里面的括号只接受一下这几种数据类型：
 *              byte,short,int,char,enum,string
 *  并且case语句里面的常量表达式的数据类型必须和switch中“表达式”的数据类型相一致
 *  3.defult语句只在switch语句里面的(表达式)都没有匹配成功后或者是穿透发生后才会执行
 *  4.(其实这一点不太重要)就是case后面跟的常量表达式必须和switch后面的表达式的值得数据类型保持一致或可以相互转换
 */
public  class SwitchPratiace01 {
    /**
     * switch课堂练习：将键盘输入的小写字母转换成大写字母，只转换a,b,c,d,e，其他的输出other
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要转换的小写字符");
        char inputCharacter = scanner.next().charAt(0);
        switch (inputCharacter) {
            case 'a' -> System.out.println("您输入的字母转换成大写字母是:" + (char)(inputCharacter - 32));
            case 'b' -> System.out.println("您输入的字母转换成大写字母是:" + (char)(inputCharacter - 32));
            case 'c' -> System.out.println("您输入的字母转换成大写字母是:" + (char)(inputCharacter - 32));
            case 'd' -> System.out.println("您输入的字母转换成大写字母是:" + (char)(inputCharacter - 32));
            case 'e' -> System.out.println("您输入的字母转换成大写字母是:" + (char)(inputCharacter - 32));
            default -> System.out.println("other");
        }
    }
}

/**
 * switch练习：输入学生成绩(输入的成绩不能大于100)若成绩大于60则输出(及格)，小于60则输出不及格
 *
 */

class SwitchPratiace02{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学生成绩");
            double fullScore = 100;
            int minScore = 0;
            double score = scanner.nextDouble();
            scanner.close();
            if(score <= fullScore && score >= minScore){
                switch ((int) score / 60) {
                    case 1 -> System.out.println("成绩及格");
                    case 0 -> System.out.println("成绩不及格");
                    default -> {
                        //语句已经结束
                    }

                }
            } else {
                System.out.println("非法输入");
            }
    }
}

/**
 * switch课堂练习：打印制定月份所属的季节，3，4，5为春，以此类推
 * 穿透思想的应用 穿透思想的作用很大程度上是用来简化代码的，尤其是switch分支里面有很多种分支都指向了同一种情况
 * 例如下面的情况，多个月份同时指向了一个季节，这是如果每一个月份都写一个对应情况的话代码会显得很啰嗦，并且编写的时候会很麻烦
 * 我们就会想到可以合理地利用穿透来解决这个问题，让指向同一种情况的多种判断数都穿在一起，这样就简化了代码
 * 最后来说一下关于switch和if语句的选择
 * 简单来说，switch语句适用于判断数和需要判断的情况不多的时候，(例如星期，性别，方向)并且符合switch(表达式)中可以接受的数据类型
 * 而if语句使用与判断的范围为"一个区间的时候"，例如SwitchPratiace02里面学生的成绩是否及格或者不及格是在一个范围内来确定的
 * 如果使用switch就不好写，得把问题抽象转化成switch语句可以适用的情况
 * 简单来说，对“点”的判断可以用switch，对“区间”的判断还是用if分支来的方便一点
 */
class SwitchPratiace03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int mouth = scanner.nextInt();
        scanner.close();
        //noinspection AlibabaUndefineMagicConstant
        if(mouth <=12 && mouth >= 1){
            switch (mouth) {
                case 3, 4, 5 -> System.out.println("春天");
                case 6, 7, 8 -> System.out.println("夏天");
                case 9, 10, 11 -> System.out.println("秋天");
                default -> System.out.println("冬天");
            }
        } else {
            System.out.println("非法输入");
        }
    }
}
