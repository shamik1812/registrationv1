package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike", "tom", "harry", "bob", "alice");
        List<String> newData = data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}
