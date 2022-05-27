package com.zzd.study.oopcore.homeworkpart1;

public class SavingsAccount  extends BankAccount{
    private double interest;
    private int saveMonth;
    private int freeCount = 0;

    public void setSaveMonth(int saveMonth) {
        this.saveMonth = saveMonth;
    }

    public SavingsAccount(int balance) {
        super(balance);

    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getSaveMonth() {
        return saveMonth;
    }
    //每个月的月初,我们会统计余额,这个方法只会在月初的时候被调用
    public void earthMouthyInterest() {
        freeCount = 0;
        super.deposit(((int)(getBalance() * getInterest())));
    }

    @Override
    public void deposit(int amount) {
        if (freeCount < 3) {
            freeCount++;
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(int amount) {
        if (freeCount < 3) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
    }

    public int getFreeCount() {
        return freeCount;
    }

    public void setFreeCount(int freeCount) {
        this.freeCount = freeCount;
    }
}
