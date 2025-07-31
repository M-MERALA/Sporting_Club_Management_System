package com.example.model;

public class Sponsor {
    private String name;
    private String type;

    public Sponsor(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
