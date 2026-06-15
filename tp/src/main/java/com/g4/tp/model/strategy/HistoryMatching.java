package com.g4.tp.model.strategy;

import java.util.List;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.User;

public class HistoryMatching implements IMatchingStrategy {

    private int minMatchesPlayed;

    public HistoryMatching(int minMatchesPlayed) {
        this.minMatchesPlayed = minMatchesPlayed;
    }

    @Override
    public List<User> matchPlayers(List<User> availableUsers, Match match) {
        return availableUsers;
    }

    public int getMinMatchesPlayed() {
        return minMatchesPlayed;
    }

    public void setMinMatchesPlayed(int minMatchesPlayed) {
        this.minMatchesPlayed = minMatchesPlayed;
    }
}
