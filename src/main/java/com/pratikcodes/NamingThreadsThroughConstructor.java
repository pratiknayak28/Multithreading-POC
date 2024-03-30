package com.pratikcodes;

public class NamingThreadsThroughConstructor extends Thread {

    NamingThreadsThroughConstructor(String s) {
        super(s);
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        NamingThreadsThroughConstructor t1 = new NamingThreadsThroughConstructor("First Thread");
        NamingThreadsThroughConstructor t2 = new NamingThreadsThroughConstructor("Second Thread");
        t1.start(); // default thread name is thread-0
        t2.start(); // default thread name is thread-1
    }

    @Override
    public void run() {
        System.out.println("Hi " + currentThread().getName());
    }
}
