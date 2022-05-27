package com.zzd.study.oopcore.homeworkpart1;

public class CheckingAccount  extends BankAccount {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("您输入的数值有误");
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("余额不足,输入的数值应该在0-" + getBalance() + "之间");
        } else {
            super.withdraw(amount + 1);
        }
    }
}