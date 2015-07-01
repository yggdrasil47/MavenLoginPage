package com.echo.loginapp.dao;

import com.echo.loginapp.model.User;

/**
 * Created by Mihai on 30/6/2015.
 */
public interface UserDAO {
    public User findUserByUsername(String user);

}
