package com.example.Alert_City.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Alert_City.model.UserModel;
import com.example.Alert_City.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public UserModel registerUser(String name, String password) {
        UserModel user = new UserModel();
        user.setName(name);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
