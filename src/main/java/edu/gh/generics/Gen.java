package edu.gh.generics;

/**
 * A simple generic class
 * Here, T is a type parameter that
 * will be replaced by a real typ
 * when an object of type Gen is created
 *
 * @author Greg
 */
public class Gen<T> {
    T ob; //declare an object of type T

    Gen(T t) {
        ob = t;
    }

    T getOb() {
        return ob;
    }

    //Show type of T.
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }

}