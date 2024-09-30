package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChatGpt1 {
    //Given a list of integers, filter out all odd numbers,
    // double the remaining even numbers, and collect the results into a new list.
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(5, 4, 6, 7, 8, 9);
        List<Integer> newData = data.stream().filter(s -> s % 2 == 0).map(s -> s * 2).collect(Collectors.toList());
        System.out.println(newData);
    }
}
