package com.zzd.study.oopcore.homeworkpart1;

public class Teacher extends Employee{
    private String name;
    private String post;
    private double salary;
    private int age;
    private double reward;

    public Teacher(String name, double salary, int workDay, double grade) {
        super(name, salary, workDay, grade);
    }

    public Teacher(String name, String post, double salary, int age) {
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String introduce() {
        return getAge() + "    " + getName() + "    " + getPost();
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    @Override
    public String printSalary() {
        return "姓名" + name + "一年的工资" +  (salary * getWorkDay() * getGrade() + (getWorkDay() * getReward())) ;
    }
}
