package com.example.model;

public class TeamCollaboration {
    private String teamName;
    private String partnerTeam;

    public TeamCollaboration(String teamName, String partnerTeam) {
        this.teamName = teamName;
        this.partnerTeam = partnerTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getPartnerTeam() {
        return partnerTeam;
    }
}
