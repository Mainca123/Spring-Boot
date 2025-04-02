package com.example.BTVN_Buoi4.service.impl;

import com.example.BTVN_Buoi4.model.User;
import com.example.BTVN_Buoi4.repository.UserRepository;
import com.example.BTVN_Buoi4.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
