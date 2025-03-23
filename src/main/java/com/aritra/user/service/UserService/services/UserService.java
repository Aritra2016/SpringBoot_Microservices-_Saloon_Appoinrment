package com.aritra.user.service.UserService.services;

import com.aritra.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    //create user
    User saveUser(User user);

    //get all user
    List<User> getAllUsers();

    //get single User by its id
    User getSingleUser(String userId);

    User deleteUser(String userId);

    User updateUser(String userId);

}
