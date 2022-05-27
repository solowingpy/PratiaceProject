package com.zzd.study.oopcore.homeworkpart1;

public class BankAccount {
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    private int balance;
    //存款
    public void deposit(int amount) {
        balance += amount;
    }
    //取款
    public void withdraw(int amount) {
        balance -= amount;
    }
}
