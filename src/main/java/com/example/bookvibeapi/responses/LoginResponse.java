package com.example.bookvibeapi.responses;

import com.example.bookvibeapi.models.User;

public class LoginResponse {
    private long expiresIn;
    private User user;

    public long getExpiresIn() {
        return expiresIn;
    }

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public User getUser() {
        return user;
    }

    public LoginResponse setUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                ", expiresIn=" + expiresIn +
                ", user=" + user +
                '}';
    }
}