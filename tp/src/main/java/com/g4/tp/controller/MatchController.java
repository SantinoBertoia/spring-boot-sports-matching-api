package com.g4.tp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g4.tp.DTOs.MatchDTO;
import com.g4.tp.model.entities.Match;
import com.g4.tp.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hola partido";
    }

    @PostMapping("/create")
    public ResponseEntity<MatchDTO> createMatch(@RequestBody MatchDTO match) {
        Match partido = new Match(match.getSport(), match.getDuration(), match.getDate(), match.getTime());
        Match savedMatch = matchService.createMatch(partido);

        return ResponseEntity.status(HttpStatus.CREATED).body(MatchDTO.fromEntity(savedMatch));
    }
}
