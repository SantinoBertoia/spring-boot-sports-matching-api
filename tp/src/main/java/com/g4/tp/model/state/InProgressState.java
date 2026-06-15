package com.g4.tp.model.state;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.User;

public class InProgressState implements IMatchState {

    @Override
    public void cancel(Match match) {
        throw new IllegalStateException("Cannot cancel match in progress");
    }

    @Override
    public void joinUser(User user, Match match) {
        throw new IllegalStateException("Cannot join user, match is in progress");
    }

    @Override
    public void finishMatch(Match match) {
        match.setState("Finalizado");
    }

    @Override
    public void confirmMatch(Match match) {
        throw new IllegalStateException("Match is already in progress");
    }

    @Override
    public void updateProgress(Match match, int progress) {
        match.setState("En juego");
    }
}
