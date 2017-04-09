package edu.gh.concurrency;

/**
 * Created by Gregory on 4/9/17.
 */
public class FirstRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread");

//        t.run(); NOT USE FOR RUNNING THREAD
        t.start();
    }
}
