package com.echo.loginapp.service.implementation;

import com.echo.loginapp.dao.UserDAO;
import com.echo.loginapp.dao.UserDAOinMemory;
import com.echo.loginapp.model.User;
import com.echo.loginapp.service.AuthenticationService;

/**
 * Created by Mihai on 30/6/2015.
 */
public class AuthenticationServiceImplementation implements AuthenticationService {

    UserDAO userDAO = new UserDAOinMemory();
    public Boolean isUserAuthenticated(String username, String password) {
        User userExpect = userDAO.findUserByUsername(username);
        if(userExpect.getUsername().equals(username) && userExpect.getPassword().equals(password)){
            return true;
        }
        return null;
    }
}
