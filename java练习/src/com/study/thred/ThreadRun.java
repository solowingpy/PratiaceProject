package com.study.thred;

/**
 * @author zzd19
 * 使用线程也很简单，示例化一个定义好的线程类，然后
 * 实例化你写的线程类即可
 */
public class ThreadRun {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();
        int flag = 2;
        for (int count = 0; count <= flag;count++){
            System.out.println("主方法结束了，程序似乎也结束了,"+"线程名为"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }

    }

}

/**
 * 如果一个类只是实现了Runnable接口,没有继承Thread类的话，创建线程则直接把线程类的实例放进Thread类的构造方法即可
 * 其实这种方法的实质是Thread类帮助线程类调用一个Start0方法,start0方法就是jvm用来和底层虚拟机联系计算机硬件，为新建的线程类
 * 分配运行线程所需要的资源
 * 其实还可以利用线程池来创建线程，线程池就是一种快速创建大量线程的方法，当程序需要短时间内创建大量持续时间非常短的线程时
 * 线程池就非常有用了
 * 但是通过线程池创建的线程不便进行精确管理，因此简单的程序不必通过线程池来创建线程
 * 还有就是如果一个线程持续时间非常长，也不宜使用线程池去创建
 */
class ThreadRun2 {
    public static void main(String[] args) throws InterruptedException {
        SunTaiLei sunTaiLei = new SunTaiLei("name");
        Thread thread = new Thread(sunTaiLei);
        thread.start();
        //int flag = 5;
        Thread.sleep(1000);
        sunTaiLei.setLoop(false);
    }
}



    /**
     * 定时器线程，方便测试线程的中断
     */
    class CounterThread implements Runnable {

        /**
         * counter是计时数，作为计数器线程的一个属性，要把计时数传回主线程，作为主线程
         * 控制计时器线程的一个依据
         */
        private int counterFlag;
        /**
         * 这个变量要用来演示通知线程退出的方法：用一个标志位来通知主循环的退出
         */
        private boolean flag = true;

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public int getCounterFlag() {
            return counterFlag;
        }

        @Override
        public void run() {

        }
    }
