package com.example.saveUP.service;

import com.example.saveUP.dto.UserRequestDTO;
import com.example.saveUP.dto.UserResponseDTO;

public interface UserServiceInterface {

    UserResponseDTO createUser(UserRequestDTO usuario);

}
