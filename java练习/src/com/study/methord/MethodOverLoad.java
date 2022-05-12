package com.study.methord;

/**
 * 方法重载,满足一下三个条件就可以构成
 * 1.方法名相同
 * 2.形参数据类型，顺序和数量必须不相同，但是形参名可以不同
 * 3.方法返回类型可以不同
 */
public class MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(method(5));
        System.out.println(method(5,5));
        System.out.println(method("5"));
    }
    public static int method(int a1){
        return (int) Math.sqrt(2);
    }
    public static int method(int a1, int a2){
        return a1*a2;
    }
    public static String method(String a1){
        return a1;
    }

    /**
     *
     * @param x2 --形参名一致但是数据类型不一致一样构成重载
     */
    public static void max(int a1, int x2){
        System.out.println(Math.max(a1, x2));
    }

    /**
     * @param a2--方法名不一样也可以构成重载
     * @return 返回两个double中的最大值
     */
    public static double max(double a2,double x2){
        return Math.max(a2, x2);
    }

    /**
     * 返回三个double类型中的最大值
     */
    public static void max(double a1,double a2,double a3){
        double temp = 0;
        if(a1 > a2){
            temp = a1;
            if(temp > a3){
                System.out.println(temp);
            }
            else {
                System.out.println(a1);
            }
        }

    }
}
