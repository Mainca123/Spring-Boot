package com.example.demo.controller;

import com.example.demo.base.RestApV1;
import com.example.demo.base.VsResponseUtil;
import com.example.demo.constant.UrlConstant;
import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UpdateUserDTO;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApV1
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(UrlConstant.User.GET_USERS)
    public ResponseEntity<?> getAllUser() {
        return VsResponseUtil.success(userService.getAllUser());
    }

    @GetMapping(UrlConstant.User.GET_USER)
    public ResponseEntity<?> getUserByID(@PathVariable long id){
        return VsResponseUtil.success(userService.getById(id));
    }

    @PostMapping(UrlConstant.User.CREATE_USER)
    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserDTO createUserDTO){
        return VsResponseUtil.success(userService.createUser(createUserDTO));
    }

    @DeleteMapping(UrlConstant.User.DELETE_USER)
    public ResponseEntity<?> deleteUser(@PathVariable long id){
        return VsResponseUtil.success(userService.deleteUser(id));
    }

    @PutMapping(UrlConstant.User.UPDATE_USER)
    public ResponseEntity<?> updateUser(@PathVariable long id, @RequestBody UpdateUserDTO user){
        return VsResponseUtil.success(userService.updateUser(id, user));
    }
}
