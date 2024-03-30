package com.pratikcodes.bank;

public class ATMThread extends Thread {
    private HDFCBank hdfcBank;

    ATMThread(HDFCBank hdfcBank) {
        this.hdfcBank = hdfcBank;
    }

    @Override
    public void run() {
        hdfcBank.Withdraw(4000);
    }
}
