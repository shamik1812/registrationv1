package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ChatGpt2 {
    //Write a Java program using the Stream API to find the maximum value from a list of integers.
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 40, 50, 60);
        Optional<Integer> max = data.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
