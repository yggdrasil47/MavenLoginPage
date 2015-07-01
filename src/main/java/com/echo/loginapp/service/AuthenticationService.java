package com.echo.loginapp.service;

/**
 * Created by Mihai on 30/6/2015.
 */
public interface AuthenticationService {
    public Boolean isUserAuthenticated(String username, String password);

}
