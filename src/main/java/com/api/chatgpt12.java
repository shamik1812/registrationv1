package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class chatgpt12 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Apple", "Pineapple", "Jackfruit");
        Set<Character> newData = data.stream().flatMap(c -> c.chars().//1.this returns unicode value of each character
                mapToObj//3.this converts the characters inside an object Stream<Chars>
                (s -> (char) s))//2.this converts unicode values into characters.
                .collect(Collectors.toSet());
        System.out.println(newData);
    }
}
