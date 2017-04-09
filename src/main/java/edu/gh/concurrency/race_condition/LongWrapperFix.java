package edu.gh.concurrency.race_condition;

/**
 * Created by Gregory on 4/9/17.
 */
public class LongWrapperFix {

    private long l;
    private Object key = new Object();

    public LongWrapperFix(long l) {

        this.l = l;
    }

    public long getValue() {
        return l;
    }

    public void incrementValue() {
        synchronized (key) {
            l = l + 1;
        }
    }
}
