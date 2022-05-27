package com.study.thred;

/**
 * @author zzd19
 * 第二种创建线程的方法，如果一个类已继承了另一个类，那就只能实现Runable接口，采用线程代理的方法来创建线程
 * 切记：不能直接凋用Run方法，否则不会创建线程
 */
public class Human {


    protected Human(String name){


    }
}

/**
 * 第二种方法和第一种方法一样，实现Runnable接口，并在Run方法里
 * 填写线程逻辑
 */

class SunTaiLei extends Human implements Runnable  {
    /**
     * 设定一个变量，简单演示主线程通知线程退出的方法
     */
    private boolean loop = true;
    protected SunTaiLei(String name) {
        super(name);
        name = "123";
    }

    @Override
    public void run() {
        int flags = 10;
        while (loop) {
            for (int count = 1; count <= flags;count++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("线程被中断");
                    //经试验，在这里调用interrupt方法会重设中断状态，导致
                    Thread.currentThread().interrupt();
                    System.out.println("中断调试");

                }
                System.out.println("孙太磊是变态本态  "+"线程名"+Thread.currentThread().getName()+"一共执行了"+count+"次");

            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
