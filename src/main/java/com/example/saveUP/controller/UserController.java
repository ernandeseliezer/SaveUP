package com.example.saveUP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.saveUP.dto.UserRequestDTO;
import com.example.saveUP.dto.UserResponseDTO;
import com.example.saveUP.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addingUser")
    public ResponseEntity<UserResponseDTO> addUser(@RequestBody @Valid UserRequestDTO data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(data));
    }

}
