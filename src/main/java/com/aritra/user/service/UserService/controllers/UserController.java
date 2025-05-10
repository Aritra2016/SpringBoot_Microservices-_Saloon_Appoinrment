package com.aritra.user.service.UserService.controllers;

import com.aritra.user.service.UserService.entities.User;
import com.aritra.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/api/users")
   public User getUser( ){

       User user= new User();
       user.setEmail("arindam@gmail.com");
       user.setPhone("9456723456");
       user.setFullName("Arindam DuttaBonik ");
       user.setRole("CUSTOMER");

       return user;
   }
}

