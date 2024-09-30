package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChatGpt5 {
    //Given a list of strings, write a Java program using the Stream API
    // to concatenate them into a single string separated by commas.
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike", "bob", "alice");
        String newData = data.stream().collect(Collectors.joining(","));
        //.joining is used to join the string with the help of a specific value
        System.out.println(newData);
    }
}
