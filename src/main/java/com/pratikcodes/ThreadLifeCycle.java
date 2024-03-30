package com.pratikcodes;

public class ThreadLifeCycle extends Thread {

    ThreadLifeCycle(String s) {
        super(s);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ThreadLifeCycle t1 = new ThreadLifeCycle("First Thread"); //New
        ThreadLifeCycle t2 = new ThreadLifeCycle("Second Thread");
        t1.start(); //Runnable
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("Hi " + currentThread().getName());//Running
        System.out.println("Hi " + currentThread().getName());//Running
    }
    //Dead/Terminated
}

/* There are various stages in a Thread Lifecycle
1. New: Thread is created but not ready to run
2. Runnable: Thread is part of runnable pool but not yet picked by the scheduler to run , whenever start method is called , the thread moves to runnable pool
3. Running: Thread is running
4. Dead/Terminated: After the execution of last line of run method , Thread is terminated
5.Wait: Discussed Later
6.Sleep:Discussed Later
7.Blocked: Discussed Later*/

/* Can we reuse a dead thread ?  / Can we call start method again for a Thread ?
 * Ans - No ,
 * The thread class contains a global variable call threadStatus which is used to track the state of the thread ,
 *  a thread in new state has status as 0 , whereas a used thread will have a non-zero status so when
 * start method is called again it will throw IllegalThreadStateException */

// we cannot reuse a normal thread, but we can reuse a thread in thread pool -> discussed later

/*Output:

Hello world!
Hi First Thread
Hi Second Thread
Hi First Thread
Hi Second Thread

*/
