package com.pratikcodes;

public class NamingThreadsThroughSetMethod extends Thread {


    public static void main(String[] args) {

        NamingThreadsThroughSetMethod t1 = new NamingThreadsThroughSetMethod();
        NamingThreadsThroughSetMethod t2 = new NamingThreadsThroughSetMethod();
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.start(); // default thread name is thread-0
        t2.start(); // default thread name is thread-1
        // setname() will not work after the thread is started
    }

    @Override
    public void run() {
        System.out.println("Hi " + currentThread().getName());
    }
}
