package com.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class chatgpt11 {
    //find the second highest nummber in the array
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 30, 50, 40, 70, 60, 90, 80);
        Optional<Integer> Second = data.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(Second);
    }
}
