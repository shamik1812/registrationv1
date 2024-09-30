package com.api;

public class Person {
    //Given a list of Person objects (where Person has fields name and age),
    // write a Java program using the Stream API to group all people by their age.
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
