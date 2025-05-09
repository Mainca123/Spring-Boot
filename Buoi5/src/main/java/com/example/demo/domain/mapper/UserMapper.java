package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UpdateUserDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(CreateUserDTO createUserDTO);
    UserResponseDTO toUserResponseDTO(User user);
    List<UserResponseDTO> toUserResponseDTOList(List<User> users);
    User updateUser(@MappingTarget User user, UpdateUserDTO updateUserDTO);
}
