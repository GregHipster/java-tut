package edu.gh.generics;

/**
 * Bounded Generic example
 * Note: also you can extend more than one Interface, example:
 * - BoundedGen<T extends Integer, Long>
 *
 * @author Greg
 */
public class BoundedGen<T extends Number> {

    T[] numbs;

    public BoundedGen(T[] numbs) {
        this.numbs = numbs;
    }

    public T[] getNumbs() {
        return numbs;
    }

    public void setNumbs(T[] numbs) {
        this.numbs = numbs;
    }

    public double getAverageNamber() {
        double sum = 0;

        for (int i = 0; i < numbs.length; i++) {
            sum += numbs[i].doubleValue();
        }

        return sum/numbs.length;
    }
}
