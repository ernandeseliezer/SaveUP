package com.example.saveUP.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequestDTO(
        @NotBlank(message = "Nome é obrigatório") String name,
        @NotBlank(message = "Email é obrigatório") @Email(message = "Email inválido") String email,
        @NotBlank(message = "Senha é obrigatória") 
        @Size(min = 8, max = 72, message = "Senha deve ter entre 8 e 72 caracteres") String senha) {
}
