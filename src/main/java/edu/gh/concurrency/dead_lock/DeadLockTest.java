package edu.gh.concurrency.dead_lock;

import org.junit.Test;

/**
 * Created by Gregory on 4/9/17.
 */
public class DeadLockTest {

    /**
     * In this case you will see dead lock.
     * Because t2 is waiting when c() method will be unlocked
     * And t1 is waiting when b() method will be unlocked
     */
//    @Test
//    public void test_DeadLock() throws InterruptedException {
    public static void main(String[] args) throws InterruptedException {


        A a = new A();

        Runnable r1 = () -> a.a();
        Runnable r2 = () -> a.b();

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();
    }
}
