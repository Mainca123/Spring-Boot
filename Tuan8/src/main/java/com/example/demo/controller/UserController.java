package com.example.demo.controller;

import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UserLoginDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@Valid @RequestBody CreateUserDTO createUserDTO){
        return ResponseEntity.ok(userService.register(createUserDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> login(@Valid @RequestBody UserLoginDTO userLoginDTO){
        return ResponseEntity.ok(userService.login(userLoginDTO));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserResponseDTO>> getAll(){
        return ResponseEntity.ok(userService.getAllUser());
    }
}
