package com.zzd.study.oopcore;

/**
 * @author zzd19
 */
public class Sub extends Base {
    private int a1 = 5;
    public String a2;
    int a3;

    public Sub(int a1, String a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        System.out.println("Sub(int a1, String a2, int a3)被调用");
    }

    public Sub() {
        System.out.println("Sub()被调用");
    }

    public Sub(String a1, int a3) {
        super(a1);
        this.a3 = a3;
        System.out.println("Sub(String a1, int a3)");
    }

    public Sub(double score, int a3) {
        super(score);
        System.out.println("子类Sub(double score, int a3)被调用");
        this.a3 = a3;
    }
}
