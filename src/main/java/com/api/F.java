package com.api;

import java.util.function.Function;

public class F {
    public static void main(String[] args) {

        Function<String,Integer> x = s->s.length();
        Integer result = x.apply("mike");
        System.out.println(result);
    }
}
