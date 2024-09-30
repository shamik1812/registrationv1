package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class chatgpt8 {
    public static void main(String[] args) {
        // Find the first string in a list that starts with the letter "B".
        List<String> data = Arrays.asList("Bike", "Bijoy", "Cycle", "Mike", "Bob", "Stallin");
        List<String> newData = data.stream().filter(n -> n.startsWith("M")).collect(Collectors.toList());
        System.out.println(newData);
    }
}
