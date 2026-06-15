package com.g4.tp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g4.tp.DTOs.UserDTO;
import com.g4.tp.model.entities.User;
import com.g4.tp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hola usuario";
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {
        User usuario = new User(user.getName(), user.getEmail(), user.getPassword());
        User savedUser = userService.createUser(usuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(UserDTO.fromEntity(savedUser));
    }
}
