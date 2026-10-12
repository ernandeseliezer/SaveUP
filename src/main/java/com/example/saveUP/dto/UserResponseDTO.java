package com.example.saveUP.dto;

import com.example.saveUP.entities.User;

public record UserResponseDTO(Integer userId, String name, String email) {

    public UserResponseDTO(User user) {
        this(user.getUserId(), user.getName(), user.getEmail());
    }
}
