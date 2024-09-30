package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ChatGpt4 {
    //Write a Java program using the Stream API
    // to calculate the average of a list of integers.
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 40, 30, 40, 50);
        OptionalDouble average = data.stream().mapToInt(Integer::intValue).average();
        System.out.println(average);
    }
}
