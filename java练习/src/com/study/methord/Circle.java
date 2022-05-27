package com.study.methord;

public class Circle {
    static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;

    public void showPerimeter(){
        if(radius >= 0){
            System.out.println("圆的周长"+2*PI*radius);
        }
        else{
            System.out.println("数据错误");
        }
    }
    public void showArea(){
        if(radius >= 0){
            System.out.println("圆的周长"+2*PI*PI);
        }
        else{
            System.out.println("数据错误");
        }
    }
}
