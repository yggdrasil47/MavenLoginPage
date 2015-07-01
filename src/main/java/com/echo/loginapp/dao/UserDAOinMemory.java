package com.echo.loginapp.dao;

import com.echo.loginapp.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihai on 30/6/2015.
 */
public class UserDAOinMemory implements UserDAO {

    final List<User> userList = new ArrayList<User>();

    {
        userList.add(new User("Mihai", "123456"));
        userList.add(new User("Maria", "123456"));
        userList.add(new User("Bogdan", "123456"));
    }

    public User findUserByUsername(String username) {
        User userToFind = new User(username);

        for(User user: userList){
            if (user.equals(userToFind)){
                return user;
            }
        }
        return null;
    }


}
