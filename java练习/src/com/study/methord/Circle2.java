package com.study.methord;

public class Circle2 {
    double radius;
    final double PI = 3.14;
    public Circle2(double radius) {
        this.radius = radius;
    }
    public double findArea(double radius) {
        return 2 * PI * radius * radius;
    }

}
