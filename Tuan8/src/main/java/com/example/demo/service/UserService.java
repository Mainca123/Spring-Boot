package com.example.demo.service;

import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UserLoginDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.domain.entity.User;

import java.util.List;

public interface UserService {
    User findUserByUserName (String username);
    UserResponseDTO register(CreateUserDTO createUserDTO);
    UserResponseDTO login(UserLoginDTO userLoginDTO);
    List<UserResponseDTO> getAllUser();
}
