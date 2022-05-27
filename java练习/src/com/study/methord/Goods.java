package com.study.methord;

/**
 * 商品类
 */
public class Goods {
    String name;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }
    public static boolean compareTo(Goods goods1,Goods goods2){
        double price1 = goods1.price;
        String name1 = goods1.name;
        double price2 = goods1.price;
        String name2 = goods2.name;
        return price1 == price2 && name1.equals(name2);
    }
    double price;

    /**
     * 其实换可以用this来简化代码
     * 既然要比较两个商品是否相同
     * 那么就用this关键字来区分这个商品对象和要比较的商品对象就可以了
     * this这里用来区分本对象的属性和外来对象的属性
     */
    public boolean compareToFix(Goods goods1){
        return this.price == goods1.price && this.name.equals(goods1.name);
    }
}
