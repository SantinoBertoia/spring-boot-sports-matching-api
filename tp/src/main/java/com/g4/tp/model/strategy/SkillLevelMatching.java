package com.g4.tp.model.strategy;

import java.util.List;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.SkillLevelEnum;
import com.g4.tp.model.entities.User;

public class SkillLevelMatching implements IMatchingStrategy {

    private SkillLevelEnum minSkillLevel;
    private SkillLevelEnum maxSkillLevel;

    public SkillLevelMatching(SkillLevelEnum minSkillLevel, SkillLevelEnum maxSkillLevel) {
        this.minSkillLevel = minSkillLevel;
        this.maxSkillLevel = maxSkillLevel;
    }

    @Override
    public List<User> matchPlayers(List<User> availableUsers, Match match) {
        return availableUsers;
    }

    public SkillLevelEnum getMinSkillLevel() {
        return minSkillLevel;
    }

    public void setMinSkillLevel(SkillLevelEnum minSkillLevel) {
        this.minSkillLevel = minSkillLevel;
    }

    public SkillLevelEnum getMaxSkillLevel() {
        return maxSkillLevel;
    }

    public void setMaxSkillLevel(SkillLevelEnum maxSkillLevel) {
        this.maxSkillLevel = maxSkillLevel;
    }
}
