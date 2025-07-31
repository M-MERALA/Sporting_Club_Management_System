package com.example.model;

public class DashboardStat {
    private String title;
    private int value;

    public DashboardStat(String title, int value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public int getValue() {
        return value;
    }
}
