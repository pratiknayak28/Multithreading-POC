package com.pratikcodes.bank;

public class HDFCBank {
    int accountBalance;

    public HDFCBank(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public synchronized void Withdraw(int amount) {
        this.accountBalance = this.accountBalance - amount;
        System.out.println("HDFC Bank Balance : " + accountBalance);
    }

    public synchronized void Deposit(int amount) {
        this.accountBalance = this.accountBalance + amount;
        System.out.println("HDFC Bank Balance : " + accountBalance);
    }

}
