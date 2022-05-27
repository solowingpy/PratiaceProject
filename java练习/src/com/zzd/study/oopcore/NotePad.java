package com.zzd.study.oopcore;

public class NotePad extends Computer{
    public String color;

    public NotePad(String CPUs, String RAM, String hardDisk, String color) {
        super(CPUs, RAM, hardDisk);
        this.color = color;
    }
    @Override
    public String getDetails(){
        System.out.println(CPUs+RAM+hardDisk+color);
        return null;
    }
    public NotePad() {
    }
}
