package com.example.model;

public class TeamMember {
    private String memberName;
    private String teamName;

    public TeamMember(String memberName, String teamName) {
        this.memberName = memberName;
        this.teamName = teamName;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getTeamName() {
        return teamName;
    }
}
