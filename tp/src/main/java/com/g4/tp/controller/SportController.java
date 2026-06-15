package com.g4.tp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g4.tp.DTOs.SportDTO;
import com.g4.tp.model.entities.Sport;
import com.g4.tp.service.SportService;

@RestController
@RequestMapping("/sport")
public class SportController {

    private final SportService sportService;

    public SportController(SportService sportService) {
        this.sportService = sportService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hola deporte";
    }

    @PostMapping("/create")
    public ResponseEntity<SportDTO> createSport(@RequestBody SportDTO sport) {
        Sport deporte = new Sport(sport.getName(), sport.getDescription(), sport.getRequiredPlayers());
        Sport savedSport = sportService.createSport(deporte);

        return ResponseEntity.status(HttpStatus.CREATED).body(SportDTO.fromEntity(savedSport));
    }
}
