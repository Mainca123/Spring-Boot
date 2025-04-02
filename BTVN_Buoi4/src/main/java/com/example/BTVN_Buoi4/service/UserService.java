package com.example.BTVN_Buoi4.service;

import com.example.BTVN_Buoi4.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> findAllUser();
    public User findUserById(int id);
    public void addUser(User user);
    public void deleteUserById(int id);

}
