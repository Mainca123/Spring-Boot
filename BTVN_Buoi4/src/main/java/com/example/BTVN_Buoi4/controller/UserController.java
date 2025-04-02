package com.example.BTVN_Buoi4.controller;

import com.example.BTVN_Buoi4.model.User;
import com.example.BTVN_Buoi4.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/v2/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
       return userService.findAllUser();
    }

    @GetMapping("/getUserByID")
    public ResponseEntity<User> getUserById(@RequestBody int id){
        User user = userService.findUserById(id);
        if(user != null)
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
        else
         return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(user);
    }

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody int id){
        User user = userService.findUserById(id);
        if(user != null){
            userService.deleteUserById(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Acc");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Ero !");
        }
    }
}
