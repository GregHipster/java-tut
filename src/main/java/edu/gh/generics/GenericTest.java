package edu.gh.generics;

import org.junit.Test;

/**
 * Provide Generics test examples
 */
public class GenericTest {

    @Test
    public void test_Simple_Generic() {
        Gen<Integer> integerGen = new Gen<>(5);
        Gen<String> stringGen = new Gen<>("String");

        System.out.println("Created generics: ");
        integerGen.showType();
        stringGen.showType();
        System.out.println("Generics values: " + integerGen.getOb() + ", " + stringGen.getOb());
    }

    @Test
    public void test_Generic_With_2_params() {
        TwoGen<String, Integer> twoGen = new TwoGen<>("Str", 5);
        System.out.println(twoGen);
    }

    @Test
    public void test_Generic_With_Bounds() {
        Integer[] ints = {5, 5, 3};
        BoundedGen<Integer> boundedGen = new BoundedGen<>(ints);
        System.out.println("Average number: " + boundedGen.getAverageNamber());
    }


}
