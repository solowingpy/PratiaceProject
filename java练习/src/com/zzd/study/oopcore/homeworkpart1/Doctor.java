package com.zzd.study.oopcore.homeworkpart1;

import java.util.Objects;

public class Doctor {
    private String name;
    private char gender;
    private double salary;
    private String job;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Doctor doctor)) {
            return false;
        }
        return gender == doctor.gender && Double.compare(doctor.salary, salary) == 0 && age == doctor.age && name.equals(doctor.name) && job.equals(doctor.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, salary, job, age);
    }

    public Doctor(String name, char gender, double salary, String job, int age) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
