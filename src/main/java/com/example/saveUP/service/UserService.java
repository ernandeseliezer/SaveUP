package com.example.saveUP.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.saveUP.dto.UserRequestDTO;
import com.example.saveUP.dto.UserResponseDTO;
import com.example.saveUP.entities.User;
import com.example.saveUP.repositories.UserRepository;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserResponseDTO createUser(UserRequestDTO data) {
        User newUser = modelMapper.map(data, User.class);
        newUser.setSenha(passwordEncoder.encode(data.getSenha()));
        return modelMapper.map(userRepository.save(newUser), UserResponseDTO.class);
    }

}
