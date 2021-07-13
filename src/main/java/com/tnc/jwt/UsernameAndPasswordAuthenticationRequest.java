package com.tnc.jwt;

public class UsernameAndPasswordAuthenticationRequest
{
    private String username;
    private String password;

    public UsernameAndPasswordAuthenticationRequest() {
    }

    public String getUsername() {
        return username;
    }

    public UsernameAndPasswordAuthenticationRequest setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsernameAndPasswordAuthenticationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
}
