package com.zzd.study.oopcore.poly;

public class SandBoxGame {
    private String name;

    public SandBoxGame(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String info(){
        return name;
    }
    public void call(){
        System.out.println("hi");
    }
}
