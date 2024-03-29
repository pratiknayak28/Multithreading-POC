package com.pratikcodes;

public class MultithreadingWithThreadClass extends Thread {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MultithreadingWithThreadClass t1 = new MultithreadingWithThreadClass();
        MultithreadingWithThreadClass t2 = new MultithreadingWithThreadClass();
        t1.start();
        t2.start();
    }
    @Override
    public void run() {
        System.out.println("Hi "+ currentThread().getName());
    }



}