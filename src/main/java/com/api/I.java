package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class I {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 35, 46, 78);
        List<Integer> newData = data.stream().map(s -> s + 5).collect(Collectors.toList());
        System.out.println(newData);
    }
}
