package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class H {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,12,34,24,56);
        List<Integer> newData = data.stream().map(s -> s * 5).collect(Collectors.toList());
        System.out.println(newData);
    }
}
