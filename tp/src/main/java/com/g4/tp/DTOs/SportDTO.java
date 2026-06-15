package com.g4.tp.DTOs;

import com.g4.tp.model.entities.Sport;

public class SportDTO {

    private Long id;
    private String name;
    private String description;
    private int requiredPlayers;

    public SportDTO() {
    }

    public SportDTO(String name, String description, int requiredPlayers) {
        this.name = name;
        this.description = description;
        this.requiredPlayers = requiredPlayers;
    }

    public SportDTO(Long id, String name, String description, int requiredPlayers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requiredPlayers = requiredPlayers;
    }

    public static SportDTO fromEntity(Sport sport) {
        return new SportDTO(sport.getId(), sport.getName(), sport.getDescription(), sport.getRequiredPlayers());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredPlayers() {
        return requiredPlayers;
    }

    public void setRequiredPlayers(int requiredPlayers) {
        this.requiredPlayers = requiredPlayers;
    }
}
