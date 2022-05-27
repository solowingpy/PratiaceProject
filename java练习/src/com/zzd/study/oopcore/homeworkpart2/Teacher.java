package com.zzd.study.oopcore.homeworkpart2;

public class Teacher extends Person {
    private int workAge;

    public Teacher(String name, char gender, int age, int workAge) {
        super(name, gender, age);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {

        if (workAge < 0 || workAge > getAge()) {
            System.out.println("工龄有误,将会被设置为0");
            this.workAge = 0;
        } else {
            this.workAge = workAge;
        }
    }
    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "爱玩象棋";
    }

    @Override
    public String info() {
        return super.info();
    }
}
