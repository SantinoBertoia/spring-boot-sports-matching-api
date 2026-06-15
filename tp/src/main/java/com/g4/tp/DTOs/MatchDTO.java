package com.g4.tp.DTOs;

import java.time.LocalDateTime;

import com.g4.tp.model.entities.Match;

public class MatchDTO {

    private Long id;
    private String sport;
    private int duration;
    private LocalDateTime date;
    private LocalDateTime time;
    private String state;

    public MatchDTO() {
    }

    public MatchDTO(String sport, int duration, LocalDateTime date, LocalDateTime time) {
        this.sport = sport;
        this.duration = duration;
        this.date = date;
        this.time = time;
    }

    public MatchDTO(Long id, String sport, int duration, LocalDateTime date, LocalDateTime time, String state) {
        this.id = id;
        this.sport = sport;
        this.duration = duration;
        this.date = date;
        this.time = time;
        this.state = state;
    }

    public static MatchDTO fromEntity(Match match) {
        return new MatchDTO(
                match.getId(),
                match.getSport(),
                match.getDuration(),
                match.getDate(),
                match.getTime(),
                match.getState());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
