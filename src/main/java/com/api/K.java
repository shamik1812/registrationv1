package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike", "alice", "bob", "chris");
        List<String> newData = data.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newData);
    }
}
