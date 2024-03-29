package com.pratikcodes;

public class NamingThreadsThroughConstructor extends Thread {

    NamingThreadsThroughConstructor() {
        super("First Thread"); // Both the threads will have the same name
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        NamingThreadsThroughConstructor t1 = new NamingThreadsThroughConstructor();
        NamingThreadsThroughConstructor t2 = new NamingThreadsThroughConstructor();
        t1.start(); // default thread name is thread-0
        t2.start(); // default thread name is thread-1
    }

    @Override
    public void run() {
        System.out.println("Hi " + currentThread().getName());
    }
}
