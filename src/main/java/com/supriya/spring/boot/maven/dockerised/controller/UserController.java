package com.supriya.spring.boot.maven.dockerised.controller;

//import java.util.ArrayList;
import java.util.List;

import com.supriya.spring.boot.maven.dockerised.entity.UserRepo;
import com.supriya.spring.boot.maven.dockerised.model.UserObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
        private UserRepo userRepo;
//private List<UserObject> userarr = new ArrayList<>();
    
    @GetMapping("/")
        public List<UserObject> getAllUsers(){
            return userRepo.findAll();
        }

    @PutMapping("/")
        public UserObject createUser(@RequestBody UserObject userObj){
            userRepo.save(userObj);
            return userObj;  
        }
    
    
}