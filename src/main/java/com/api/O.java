package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class O {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mike", "alice", "bob");
        Consumer<String> val = s->System.out.println(s);
        names.forEach(val);
    }
}
