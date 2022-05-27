package com.zzd.study.oopcore.homeworkpart1;

public class HomeWork04 {

    public static void main(String[] args) {
        CheckingAccount com = new CheckingAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        com.withdraw(100);
        com.withdraw(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
    }
}
