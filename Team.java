package com.example.model;

public class Team {
    private String name;
    private String sportType;

    public Team(String name, String sportType) {
        this.name = name;
        this.sportType = sportType;
    }

    public String getName() {
        return name;
    }

    public String getSportType() {
        return sportType;
    }
}
