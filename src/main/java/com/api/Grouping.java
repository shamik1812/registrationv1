package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Employee> data = Arrays.asList(
                new Employee(1, "Mike", 5000),
                new Employee(2, "Jinny", 6000),
                new Employee(3, "timmy", 5000)
        );
        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSal()));
        System.out.println(newData);
    }
}
