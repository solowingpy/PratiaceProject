package com.zzd.study.oopcore.homeworkpart2;

public class Student extends Person{
    public Student(String name, char gender, int age, String stuId) {
        super(name, gender, age);
        this.stuId = stuId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        //实际这里会进行正则表达式校验
        this.stuId = stuId;
    }

    private String stuId;
    public void study(){
        System.out.println("我承诺,我会好好学习");

    }

    @Override
    public String play() {
        return super.play() + "爱玩足球";
    }

    @Override
    public String info() {
        return super.info();
    }
}
