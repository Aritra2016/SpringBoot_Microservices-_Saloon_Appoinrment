package com.aritra.user.service.UserService.exceptions;

public class ResourceNotFoundException extends  RuntimeException {

    //constructor
    public ResourceNotFoundException( ){
        super("Resource Not Found");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
