package com.api;

import java.util.function.Predicate;

public class A {
    public static void main(String args[]) {
        Predicate<Integer> val = x -> x > 4;
        boolean result = val.test(5);
        System.out.println(result);
    }
}
