package com.study.methord;

/**
 * 演示一些局部变量和全局变量的细节
 * 只强调一点，局部变量和全局变量重名的话，在调用时遵循就近原则
 * 另外，代码块中的变量也是按照局部变量处理
 */
public class VariableDetail {
    int var1 = 5;
    public static void main(String[] args) {
        int var1 = 0;
        System.out.println(var1);
        VariableDetail v1 = new VariableDetail();
        test(v1);
    }

    /**
     * 全局变量换可以通过方法中的类对象的形参来使用
     * 只要是类空间中有对应的全局变量
     */
    public static void test(VariableDetail method) {
        System.out.println(method.var1);
    }
}
