package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike", "tom", "harry", "bob", "mike", "alice");
        List<String> newData = data.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}
