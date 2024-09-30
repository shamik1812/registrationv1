package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Grouping1 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> newData = data.stream().max(Integer::compareTo);
        System.out.println(newData.get());
    }
}
