package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class chatgpt13 {
    public static void main(String[] args) {
        //Partition a list of integers into even and odd numbers
        List<Integer> data = Arrays.asList(1, 3, 4, 5, 8, 9, 7);
        List<Integer> evenNumbers = data.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = data.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
        String even ="even";
        String odd ="odd";
        Map<String, List<Integer>> Map = of(
                even, evenNumbers,
                odd, oddNumbers
        );
        System.out.println(Map);
    }
}
