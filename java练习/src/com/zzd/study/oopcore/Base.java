package com.zzd.study.oopcore;

/**
 * @author zzd19
 */
public class Base {
    protected String a1;
    protected double score;
    public int a2;
    private int a4;

    public Base(double score) {
        this.score = score;
        System.out.println("父类Base(double score)被调用");
    }

    public Base(String a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
        System.out.println("父类的 public Base(String a1, int a2)被调用");
    }

    public Base(String a1) {
        this.a1 = a1;
        System.out.println("父类的public Base(String a1)被调用");
    }

    public Base() {
        System.out.println("父类的无参构造器被调用");
    }
}
