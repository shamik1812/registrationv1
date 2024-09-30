package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class chatgpt9 {
    public static void main(String[] args) {
        //Group a list of strings by their length.
        List<String> data = Arrays.asList("Mike", "Stalling", "Boby", "Alice");
        Map<Integer, List<String>> collect = data.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
