package com.api;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 30, 40);
        int result = data.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
