package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike", "alice", "bob", "stallin");
        List<Integer> newData = data.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(newData);
    }
}
