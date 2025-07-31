package com.example.model;

public class Subscription {
    private String type;
    private double cost;

    public Subscription(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}
