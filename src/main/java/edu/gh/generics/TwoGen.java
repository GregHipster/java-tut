package edu.gh.generics;

/**
 * A simple generic class with two type parameters: T, V
 * @author Greg
 */
public class TwoGen<T, V> {
    T t;
    V v;

    public TwoGen(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        String tStr = t.getClass().getName();
        String vStr = v.getClass().getName();
        return tStr + ": " + t + ", " + vStr + ": " + v;
    }
}
