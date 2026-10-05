package com.example.saveUP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.saveUP.dto.UsuarioRequestDTO;
import com.example.saveUP.dto.UsuarioResponseDTO;
import com.example.saveUP.entities.User;

import com.example.saveUP.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addingUser")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponseDTO addUser(@RequestBody UsuarioRequestDTO data) {
        User newUser = userService.createUser(data);
        return new UsuarioResponseDTO(newUser);
    }

}
