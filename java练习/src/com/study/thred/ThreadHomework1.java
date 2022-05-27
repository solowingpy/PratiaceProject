package com.study.thred;

/**
 * @author zzd19
 * 线程作业，对应韩顺平“循序渐进学java”第590集
 * 线程插队练习，当输出5次Hi时启动下面的AttachedThread，同时暂停主线程
 * 当子线程执行完毕时，才可以继续执行主线程
 * 主线程任务：输出10次Hi
 */
public class ThreadHomework1 {

    public static void main(String[] args) throws InterruptedException {
         //初始化程序所需对象
        AttachedThread attachedThread = new AttachedThread();
        Thread thread = new Thread(attachedThread);
        //主线程主循环
        int flag = 10;
        for (int i = 1; i <= flag;i++){
            System.out.println("Hi");
            Thread.sleep(1000);
            if (i == 5){
                thread.start();
                thread.join();
            }
        }
        System.out.println("主线程结束");
    }
}

/**
 * 子线程，任务是每隔1秒输出一次Hi
 */
class AttachedThread implements Runnable{

    @Override
    public void run() {
        int flag  = 10;
        for (int i = 1; i <= flag;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //为防止线程的重要数据丢失，这里设置一旦线程被中断，马上执行完线程所有任务
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("子线程结束");
    }
}
