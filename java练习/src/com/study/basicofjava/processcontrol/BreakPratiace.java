package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * 开始老韩的break语句的练习
 * break一般用于循环次数不确定(也包括无限循环，和结束时间点不确定的)
 * 满足一定条件后使用此结构，结束循环
 * @author zzd19
 */
@SuppressWarnings("AlibabaUndefineMagicConstant")
public class BreakPratiace {

    /**
     * break细节1：标签的使用(非重点知识，实际开发中较少使用，并且不提供实例演示)
     * 在多层嵌套循环中，是可以在每一层的循环前面加上标签的
     * 这样，在嵌套循环里，"break 标签名"可以直接终止任意一层的循环
     * (注意，如果终止一层循环，则这层循环内包括的所有循环都会被终止，大大降低代码可读性)
     * 如果不加标签，则只终止"break"所在的那一层的循环
     */
    public static void main(String[] args) {
        pratiace01();
        pratiace02();

    }

    /**
     * 第一题：1-100以内的数求和，求出当这些数的和为20时循环到了那个数
     */
    static void pratiace01() {
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= 20) {
                break;
            }
        }
        System.out.println("当和第一次大于20时的数为:" + i);
    }

    /**
     * 第二题，实现登录验证，有三次机会
     * 用户名：“张三”，密码“666”，如果密码正确，则提示登录成功
     * 否则提示用户名或密码错误，同时提示还有几次机会
     * 如果机会都用完则提示：”对不起，您输入了多次错误的账号或密码，系统已被锁定“
     */
     static void pratiace02() {
        /*
         * 思路分析：
         * 第一步：不用循环的情况下实现密码和用户名验证
         * 第二步：在不考虑错误机会的情况下，实现让用户不断输入密码和用户名，直到正确时，退出程序
         * 第三步：加入剩余错误机会的判定，同时加入剩余机会的提示
         */
        final String correctName = "张三";
        final String correctPasswd = "666";
        String userName;
        String userPasswd;
        //显示剩余机会的变量
        int chance = 3;
        Scanner myScanner = new Scanner(System.in);
        //程序循环三次，如果未能在规定的循环次数下输入正确的账号和密码，就登陆失败
        for (int i = 1; i <= 3;i++){
            System.out.println("请输入用户名");
            userName = myScanner.nextLine();
            System.out.println("请输入密码");
            userPasswd = myScanner.nextLine();
            //判断用户名密码是否正确，如果输入正确，就直接结束循环，显示登录成功
            if(userName.equals(correctName) && userPasswd.equals(correctPasswd)){
                System.out.println("登陆成功");
                break;
            }

            System.out.println("登录失败，你还有"+chance+"次机会");
            chance--;
        }
    }
    /*
    * 这个题非常简单，但是有几个点需要注意：
    * 1.字符串比较时，经常会使用“字符串.equals(字符串)”的方法来比较
    *   但是要注意，这个代码结构中前面的“字符串”最好是已经初始化好的(一般是常量)
    *   后面的一般是变量，这样能防止“空指针异常”，“空指针异常”会在以后的章节中讲解
    * 2.如果程序中有两个以上变量都要用Scanner类输入的话，建议都设置为同一数据类型
    *   否则可能会出现各种各样的异常，比如这个程序我想把用户名和密码分开输入
    *   由于刚开始我用户名和密码设置成了不同的数据类型，结果程序运行时显示用户名和密码被
    *   "合并输入"了，这种情况下很容易出现异常
    * */

    /**
     * pratiace02的出现异常的情况，作为前文注意点的一个实例说明
     * 使用scanner类对两个变量进行初始化时，如果两个变量数据类型不相同的话很容易出现异常
     * 并且容易出现“合并输入”的情况
     * @deprecated  此方法仅为演示实例，有重大bug，请勿使用
     */
    @Deprecated (forRemoval = true)
    static void pratiace02Error(){
        final String correctName = "张三";
        final int correctPasswd = 666;
        String userName;
        int userPasswd;
        //显示剩余机会的变量
        int chance = 3;
        Scanner myScanner = new Scanner(System.in);
        for (int i = 1; i <= 3;i++){
            /*
            * 注意下面接受用户名和密码的变量是不同数据类型的，运行时会报异常
            * */
            System.out.println("请输入用户名");
            userName = myScanner.nextLine();
            System.out.println("请输入密码");
            userPasswd = myScanner.nextInt();
            if(userName.equals(correctName) && userPasswd == correctPasswd){
                System.out.println("登陆成功");
            }
            System.out.println("登录失败，你还有"+chance+"次机会");
            chance--;
        }
    }
}
