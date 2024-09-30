package com.api;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Grouping2 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 4, 54, 56);
        Optional<Integer> newData = data.stream().min(Integer::compareTo);
        System.out.println(newData.get());
    }
}
