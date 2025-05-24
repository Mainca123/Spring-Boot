package com.example.demo.service.impl;

import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UserLoginDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;


    @Override
    public User findUserByUserName(String username) {
        return userRepository.findByUserName(username).orElseThrow(() -> new RuntimeException("Username does not exist!"));
    }

    @Override
    public UserResponseDTO register(CreateUserDTO createUserDTO) {
        if(userRepository.findByUserName(createUserDTO.getUsername()).isPresent()){
            throw new RuntimeException("Username already exists!");
        }
        User user = userMapper.toUser(createUserDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return userMapper.toUserResponseDTO(user);
    }

    @Override
    public UserResponseDTO login(UserLoginDTO userLoginDTO) {
        User user = findUserByUserName(userLoginDTO.getUsername());
        if(!passwordEncoder.matches(userLoginDTO.getPassword(), user.getPassword())){
            throw new RuntimeException("Password is incorrect!");
        }
        return userMapper.toUserResponseDTO(user);
    }

    @Override
    public List<UserResponseDTO> getAllUser() {
        return userMapper.toListUserResponseDTO(userRepository.findAll());
    }
}
