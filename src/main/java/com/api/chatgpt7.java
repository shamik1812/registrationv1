package com.api;

import java.util.Arrays;
import java.util.List;

public class chatgpt7 {
    public static void main(String[] args) {
        //Find the sum of all even numbers in a list.
        List<Integer> data = Arrays.asList(2, 4, 5, 6, 3, 5, 8);
        int result = data.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
