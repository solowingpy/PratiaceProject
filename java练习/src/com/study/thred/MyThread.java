package com.study.thred;

/**
 * @author zzd19
 * 有两个创建线程的方法，一个是继承Thred类
 * 一个是实现Runable接口
 */
public class MyThread extends Thread {
    /**
     * 如果用继承Thread类创建线程的话，一定要重写Run方法
     */
    @Override
    public void run() {
         //增添业务逻辑代码
        int counter = 0;
        int flag = 5;
        while (counter <= flag){
            System.out.println("刘江"+" "+"线程名为： "+Thread.currentThread().getName());
            counter++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
