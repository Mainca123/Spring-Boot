package com.example.demo.service.impl;

import com.example.demo.constant.ErrorMessage;
import com.example.demo.domain.dto.request.CreateUserDTO;
import com.example.demo.domain.dto.request.UpdateUserDTO;
import com.example.demo.domain.dto.response.UserResponseDTO;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.mapper.UserMapper;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public List<UserResponseDTO> getAllUser() {
        return userMapper.toUserResponseDTOList(userRepository.findAll());
    }

    @Override
    public UserResponseDTO getById(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.User.ERR_NOT_FOUND_ID, new long[]{id} ));
        return userMapper.toUserResponseDTO(user);
    }

    @Override
    public UserResponseDTO createUser(CreateUserDTO createUserDTO) {
        User user = userMapper.toUser(createUserDTO);
        User saveUser = userRepository.save(user);
        return userMapper.toUserResponseDTO(saveUser);
    }

    @Override
    public UserResponseDTO deleteUser(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.User.ERR_NOT_FOUND_ID, new long[]{id} ));
        UserResponseDTO userResponseDTO = userMapper.toUserResponseDTO(user);
        userRepository.deleteById(id);
        return userResponseDTO;
    }

    @Override
    public UserResponseDTO updateUser(long id, UpdateUserDTO updateUserDTO) {
        User user = userRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.User.ERR_NOT_FOUND_ID, new long[] {id}));
        userMapper.updateUser(user,updateUserDTO);
        return userMapper.toUserResponseDTO(userRepository.save(user));
    }
}
