package com.study.methord;

public class Book {
    double price;
    String name;

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Book() {

    }

    /**
     * 用动态方法的话，最好用this关键字来调用本类对象的
     * 属性和方法，能减少代码量，因为方法里面的变量随着不同
     * 对象的变化而变化，所以用this也可以
     * 主要是这个方法修改的是调用这个方法的对象的属性
     * 所以用this
     */
    public void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }
        else if (this.price > 100){
            this.price = 100;
        }
    }
}
