package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,20,32,12,15);
        List<Integer> newData = data.stream().filter(x -> x > 10).collect(Collectors.toList());
        System.out.println(newData);
    }
}
