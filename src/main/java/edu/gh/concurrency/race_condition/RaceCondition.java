package edu.gh.concurrency.race_condition;

import org.junit.Test;

/**
 * Created by Gregory on 4/9/17.
 */
public class RaceCondition {

    @Test
    public void raceCondition() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };

        run1000Threads(r);

        System.out.println("Here you can see Race Condition, Value = " + longWrapper.getValue());
    }

    @Test
    public void raceCondition_FIX() throws InterruptedException {
        LongWrapperFix longWrapper = new LongWrapperFix(0L);
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };

        run1000Threads(r);

        System.out.println("Here Race Condition has fixed, Value = " + longWrapper.getValue());
    }

    private void run1000Threads(Runnable r) throws InterruptedException {


        Thread threads[] = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
    }
}
