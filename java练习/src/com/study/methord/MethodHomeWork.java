package com.study.methord;

public class MethodHomeWork {
    public static void main(String[] args) {
        MethodHomeWork method = new MethodHomeWork();
        double[] array = {1.2,3,4,12,0.2};
        Double res =  method.maxFix(array);
        if(res != null){
            System.out.println(res);
        } else {
            System.out.println("错误");
        }
        String[] array2 = {"112","15445","85454"};

        int index = method.a02(array2,"112");
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("索引不存在");
        }
        Circle circle = new Circle(2.5);
        circle.showPerimeter();
        circle.showArea();
        Dog dog1 = new Dog("狗","红色",100);
        Dog dog2 = new Dog("狗","黑色",200);
        //匿名对象,指在堆里有内存空间但是没有任何引用指向的对象，这种对象只能用一次,用后就被销毁
        new Dog().info();
        dog1.info();
        dog2.info();
        System.out.println(method(MethodHomeWork.method(20,50),20));
        PassObject passObject = new PassObject();
        Circle2 circle2 = new Circle2(1);
        passObject.printAreas(circle2,5);
    }
    public double max(double[] array){
        int p1 = 0;
        int p2 = 0;
        while(p1 < array.length){
            if(array[p1] > array[p2]){
                p2 = p1;
            }
            p1++;
        }
        return array[p2];
    }
    public int a02(String[] array,String a1){
        //注意代码健壮性
        if(array != null && array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if(a1.equals(array[i])){
                    return i;
                }
            }
        }
        if(array == null || array.length == 0){
            System.out.println("数组有误");
        }
        return -1;
    }

    /**
     * 若按照普通方式来写这个方法，会有很多问题
     * 比如数组内容为空的时候无法很好地返回提示信息
     * 比如数组有异常的时候，我们可能会返回-1或0
     * 但是有时候-1或0恰好是正常数组的最大值
     * 然后数组引用指向了一个空的内存地址的时候，会报错
     * 这时就可以用包装类来解决问题
     * 如果数组内容为空的话，或者数组引用的内存地址为空
     * 则让包装类返回null就可以
     * 所以包装类比基本数据类型呢个更灵活地处理返回值的问题
     */
    public Double maxFix(double[] array){
        //当输入的数组是一个正常数组时，才会进入下面代码块
        if (array != null && array.length > 0){
            int p1 = 0;
            int p2 = 0;
            while(p1 < array.length){
                if(array[p1] > array[p2]){
                    p2 = p1;
                }
                p1++;
            }
            return array[p2];
        } else {
            return null;
        }
    }
    public double[] copyArray(double[] array){
        double[] newArray = new double[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;

    }
    public static int method(int a1, int a2){
        return 1;
    }
}
