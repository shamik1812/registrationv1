package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class chatgpt10 {
    private long id;
    private String name;

    public chatgpt10(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<chatgpt10> data = Arrays.asList(new chatgpt10(1, "Mike"),
                new chatgpt10(2, "Stallin"),
                new chatgpt10(3, "Adam")
        );
        Map<Long, String> newData = data.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
        newData.forEach((id, name) ->
                System.out.println("ID:" + id+ ",Name: "+name));


    }
}
