package com.example.model;

public class Member {
    private String name;
    private String role;

    public Member(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
