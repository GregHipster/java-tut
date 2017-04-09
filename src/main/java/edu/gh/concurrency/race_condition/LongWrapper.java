package edu.gh.concurrency.race_condition;

/**
 * Created by Gregory on 4/9/17.
 */
public class LongWrapper {

    private long l;

    public LongWrapper(long l) {

        this.l = l;
    }

    public long getValue() {
        return l;
    }

    public void incrementValue() {
        l = l + 1;
    }
}
