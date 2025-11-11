package com.example.Alert_City.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Alert_City.model.UserModel;
import com.example.Alert_City.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Map<String, String> request) {
        UserModel user = userService.registerUser(request.get("name"), request.get("password"));
        return ResponseEntity.ok(user);
    }  
}