package com.study.methord;

public class Cal {
    double number1;
    double number2;

    public Cal(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Cal() {
    }
    public void add(){
        System.out.println((number1 + number2));
    }
    public void reduce(){
        System.out.println((number1 - number2));
    }
    public void multiply(){
        System.out.println((number1 * number2));
    }
    public void divide(){
        if (number2 == 0){
            System.out.println("ERROR");
        } else {
            System.out.println();
        }
    }
}
