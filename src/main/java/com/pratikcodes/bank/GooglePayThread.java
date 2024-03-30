package com.pratikcodes.bank;

public class GooglePayThread extends Thread {
    private HDFCBank hdfcBank;

    GooglePayThread(HDFCBank hdfcBank) {
        this.hdfcBank = hdfcBank;
    }

    @Override
    public void run() {
        hdfcBank.Deposit(5000);
    }
}
