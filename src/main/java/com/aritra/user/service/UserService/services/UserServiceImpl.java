package com.aritra.user.service.UserService.services;

import com.aritra.user.service.UserService.entities.User;
import com.aritra.user.service.UserService.exceptions.ResourceNotFoundException;
import com.aritra.user.service.UserService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements   UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getSingleUser(String userId) {
        return null;
    }

    @Override
    public User deleteUser(String userId) {
        return null;
    }

    @Override
    public User updateUser(String userId) {
        return null;
    }
}
