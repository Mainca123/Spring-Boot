package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring")
public interface UserMapper {
    User toUser(CreateUserDTO createUserDTO);
    UserResponseDTO toUserResponseDTO(User user);
    List<UserResponseDTO> toListUserResponseDTO(List<User> users);
}
