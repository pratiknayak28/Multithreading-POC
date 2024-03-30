package com.pratikcodes.bank;

public class MainThread {

    public static void main(String[] args) {
        HDFCBank pratikAccount = new HDFCBank(7000);
        ATMThread atm = new ATMThread(pratikAccount);
        atm.setName("ATM");
        GooglePayThread googlePay = new GooglePayThread(pratikAccount);
        googlePay.setName("GooglePay");
        atm.start();
        googlePay.start();

    }
}
