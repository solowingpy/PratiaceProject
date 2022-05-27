package com.study.methord;

public class PassObject {
    public void printAreas(Circle2 c, double times) {
        while(c.radius <= times){
            double result = c.findArea(c.radius);
            System.out.println(c.radius + "\t" + result);
            c.radius++;
        }
    }
}