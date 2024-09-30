package com.api;

import java.util.function.Function;

public class G {
    public static void main(String[] args) {
        Function<String,String> x = s->s.toUpperCase();
        String result = x.apply("mike");
        System.out.println(result);
    }
}
