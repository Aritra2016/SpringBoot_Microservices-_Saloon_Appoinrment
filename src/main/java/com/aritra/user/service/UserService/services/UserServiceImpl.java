package com.aritra.user.service.UserService.services;

import com.aritra.user.service.UserService.entities.User;
import com.aritra.user.service.UserService.exceptions.ResourceNotFoundException;
import com.aritra.user.service.UserService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements   UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        //generate random Userid
        try{
            String randomUserId = UUID.randomUUID().toString();
            user.setUserId(randomUserId);
            return userRepository.save(user);
        }
       catch (Exception e){
            throw new ResourceNotFoundException("User with given userid is not found on server !!!!!");
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getSingleUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given userid is not found on server !!!!!"+userId));
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
