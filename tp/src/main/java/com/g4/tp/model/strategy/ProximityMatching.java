package com.g4.tp.model.strategy;

import java.util.List;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.User;

public class ProximityMatching implements IMatchingStrategy {

    private double maxDistance;

    public ProximityMatching(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public List<User> matchPlayers(List<User> availableUsers, Match match) {
        return availableUsers;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }
}
