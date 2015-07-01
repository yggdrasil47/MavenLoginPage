package com.echo.loginapp;

import com.echo.loginapp.service.AuthenticationService;
import com.echo.loginapp.service.implementation.AuthenticationServiceImplementation;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Mihai on 1/7/2015.
 */
public class UserAutenticationTest {

AuthenticationService authenticationService = new AuthenticationServiceImplementation();

    @Test
    public void testUserAutenticated(){
        Assert.assertTrue(authenticationService.isUserAuthenticated("Mihai", "123456"));
    }
}
