package com.g4.tp.model.state;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.User;

public class NeedPlayerState implements IMatchState {

    @Override
    public void cancel(Match match) {
        match.setState("Cancelado");
    }

    @Override
    public void joinUser(User user, Match match) {
        match.setState("Necesitamos jugadores");
    }

    @Override
    public void finishMatch(Match match) {
        throw new IllegalStateException("Cannot finish match in NeedPlayer state");
    }

    @Override
    public void confirmMatch(Match match) {
        throw new IllegalStateException("Cannot confirm match in NeedPlayer state");
    }

    @Override
    public void updateProgress(Match match, int progress) {
        throw new IllegalStateException("Cannot update progress in NeedPlayer state");
    }
}
