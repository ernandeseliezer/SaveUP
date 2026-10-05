package com.example.saveUP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.saveUP.dto.UsuarioRequestDTO;
import com.example.saveUP.entities.User;
import com.example.saveUP.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UsuarioRequestDTO data) {
        User newUser = new User(data.name(), data.email(), data.senha());
        return userRepository.save(newUser);
    }
}
