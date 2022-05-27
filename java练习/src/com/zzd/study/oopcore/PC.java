package com.zzd.study.oopcore;

public class PC extends Computer {
    public String brand;

    public PC(String CPUs, String RAM, String hardDisk, String brand) {
        super(CPUs, RAM, hardDisk);
        this.brand = brand;
    }
    @Override
    public String getDetails(){
        return null;
    }
    public PC() {
    }
    /**
     * 改进输出,因为子类已经有父类的相关信息
     * 所以直接可以利用父类的信息输出方法的返回值
     * 来降低子类方法的开发量
     */
    public void printInfo(){
        System.out.println(getDetails() + brand);
    }
}
