package com.zzd.study.oopcore;

public class Student extends Person{
    private double score;
    private int id;

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("非法的分数，分数将被设置为0");
            this.score = 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age, double score, int id) {
        super(name, age);
        setScore(score);
        this.id = id;
    }

    @Override
    public String say() {
        return super.say() + getId() + getScore() ;
    }
}
