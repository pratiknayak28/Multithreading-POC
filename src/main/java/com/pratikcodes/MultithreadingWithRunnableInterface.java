package com.pratikcodes;

public class MultithreadingWithRunnableInterface implements Runnable {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MultithreadingWithRunnableInterface());
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Hi " + Thread.currentThread().getName());
    }
}
