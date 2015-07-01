package com.echo.loginapp.model;

/**
 * Created by Mihai on 30/6/2015.
 */
public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public User(String username){
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        User other = (User) obj;
        return  this.username.equals(other.getUsername());
    }
}
