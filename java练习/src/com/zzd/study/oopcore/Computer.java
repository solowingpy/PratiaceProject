package com.zzd.study.oopcore;

public class Computer {
    protected String CPUs;
    protected String RAM;
    protected String hardDisk;
    protected String getDetails(){
        return CPUs + RAM + hardDisk;
    }

    public Computer(String CPUs, String RAM, String hardDisk) {
        this.CPUs = CPUs;
        this.RAM = RAM;
        this.hardDisk = hardDisk;

    }
    public PC kl(){
        return null;
    }
    public Computer() {
    }
}
