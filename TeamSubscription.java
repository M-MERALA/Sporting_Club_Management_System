package com.example.model;

public class TeamSubscription {
    private String teamName;
    private String subscriptionType;

    public TeamSubscription(String teamName, String subscriptionType) {
        this.teamName = teamName;
        this.subscriptionType = subscriptionType;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }
}
