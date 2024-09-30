package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChatGpt3second {
    public static void main(String[] args) {
        List<Person> names = Arrays.asList(
                new Person("Mike", 25),
                new Person("Jinny", 20),
                new Person("Timmy", 25)
        );
        Map<Integer, List<Person>> data = names.stream().collect(Collectors.groupingBy(s -> s.getAge()));
        System.out.println(data);
    }
}
