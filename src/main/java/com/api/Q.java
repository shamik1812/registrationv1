package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q {
    public static void main(String[] args) {
        List<Employee> data = Arrays.asList(
                new Employee(1, "Mike", 5000),
                new Employee(2, "Jen", 4000),
                new Employee(3, "Tim", 5000)
        );
        List<Employee> newData = data.stream().filter(s -> s.getSal() > 4000).collect(Collectors.toList());
        for (Employee e: newData){
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getSal());
        }
    }
}
