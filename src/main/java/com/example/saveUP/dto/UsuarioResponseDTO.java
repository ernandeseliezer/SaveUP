package com.example.saveUP.dto;

import com.example.saveUP.entities.User;

public record UsuarioResponseDTO(Integer userId, String name, String email) {

    public UsuarioResponseDTO(User user) {
        this(user.getUserId(), user.getName(), user.getEmail());
    }
}
