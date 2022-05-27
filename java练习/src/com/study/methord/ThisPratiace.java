package com.study.methord;

import static com.study.methord.Goods.compareTo;

/**
 * 创建商品类,有价格和名字两个属性，并提供compareTo方法
 * 如果两个商品价格和名字完全一样，就判定为同一个商品
 */
public class ThisPratiace {
    public static void main(String[] args) {
        Goods goods1 = new Goods("手机",100);
        Goods goods2 = new Goods("手机",100);
        System.out.println(compareTo(goods1,goods2));
        System.out.println(goods1.compareToFix(goods2));
    }

}
