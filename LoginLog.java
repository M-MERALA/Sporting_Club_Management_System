package com.example.model;

import java.util.Date;

public class LoginLog {
    private String userName;
    private Date loginTime;

    public LoginLog(String userName, Date loginTime) {
        this.userName = userName;
        this.loginTime = loginTime;
    }

    public String getUserName() {
        return userName;
    }

    public Date getLoginTime() {
        return loginTime;
    }
}
