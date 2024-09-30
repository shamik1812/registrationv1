package com.api;


import java.util.List;
import java.util.stream.Collectors;

public class Chatgpt6 {
    //Flatten a list of lists of integers into a single list.
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 5),
                List.of(6, 7, 8)
        );
        List<Integer> data = lists.stream().flatMap(L -> L.stream()).collect(Collectors.toList());
        System.out.println(data);
    }
}

