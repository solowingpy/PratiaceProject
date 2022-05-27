package com.study.thred;

/**
 * @author zzd19
 */
public class Thread2 implements Runnable{
    int count = 1;
    @Override
    public void run() {
        while (true) {
            System.out.println("线程"+Thread.currentThread().getName()+"执行了"+count+"次");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            if (count == 10){
                break;
            }
        }
    }
}
