package com.example.backend_java.services;

import com.example.backend_java.auth.models.dtos.AuthDto;
import com.example.backend_java.dtos.UserDto;

public interface UserServiceInterface {
    UserDto getUser(String email);
}
