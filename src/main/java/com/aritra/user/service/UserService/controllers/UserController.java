package com.aritra.user.service.UserService.controllers;

import com.aritra.user.service.UserService.entities.User;
import com.aritra.user.service.UserService.repositories.UserRepository;
import com.aritra.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class UserController {

    //create instance of Repository class
    @Autowired
    private UserRepository userRepository;

    /*1) @PostMapping= While updating data,
     2) @RequestBody= Client will provide user details by json,


     */

    //Create New User
    @PostMapping("/api/users")
    public User createUser (@RequestBody  User user) {
        return userRepository.save(user);
    }

 // Get Users
    @GetMapping("/api/users")
   public User getUser( ){

       User user= new User();
       user.setEmail("arindam@gmail.com");
       user.setPhone("9456723456");
       user.setFullName("Arindam DuttaBonik ");
       user.setRole("CUSTOMER");

       return user;
   }

   //Get All Users
    @GetMapping("/api/users/all")
    public List<User> getAllUser(){
        return userRepository.findAll();

    }

    /*Get Single User by Id
     a) @PathVariable- This annotation is used to access any specific key
     */
    @GetMapping("/api/users/{userid}")
    public User getSingle(@PathVariable Long userid ) throws Exception {
        Optional<User> single= userRepository.findById(userid);
        if(single.isPresent()){
            return single.get();
        }else
            throw new Exception(" User not found");
    }

    @PutMapping("/api/users/{userid}")
    public User updateUser( @RequestBody User user, @PathVariable Long userid ) throws Exception {
    //Get user from database
        Optional<User> updateUser= userRepository.findById(userid);
       if(updateUser.isEmpty()){
           throw new Exception("User not found");
       }
       User existingUser= updateUser.get();
       existingUser.setEmail(user.getEmail());
       existingUser.setPhone(user.getPhone());
       existingUser.setFullName(user.getFullName());
       existingUser.setRole(user.getRole());

       return userRepository.save(existingUser);
    }

}

