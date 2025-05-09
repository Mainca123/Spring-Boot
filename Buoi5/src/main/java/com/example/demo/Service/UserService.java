package com.example.demo.service;

import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UpdateUserDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.domain.entity.User;

import java.util.List;

public interface UserService {
    List<UserResponseDTO> getAllUser();
    UserResponseDTO getById(long id);
    UserResponseDTO createUser(CreateUserDTO createUserDTO);
    UserResponseDTO deleteUser(long id);
    UserResponseDTO updateUser(long id, UpdateUserDTO updateUserDTO);
}
