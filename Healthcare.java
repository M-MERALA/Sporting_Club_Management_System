package com.example.model;

public class Healthcare {
    private String provider;
    private String coverage;

    public Healthcare(String provider, String coverage) {
        this.provider = provider;
        this.coverage = coverage;
    }

    public String getProvider() {
        return provider;
    }

    public String getCoverage() {
        return coverage;
    }
}
