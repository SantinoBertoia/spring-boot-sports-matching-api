package com.g4.tp.model.state;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.User;

public class MatchArranged implements IMatchState {

    @Override
    public void cancel(Match match) {
        match.setState("Cancelado");
    }

    @Override
    public void joinUser(User user, Match match) {
        throw new IllegalStateException("Cannot join user, match is already arranged");
    }

    @Override
    public void finishMatch(Match match) {
        throw new IllegalStateException("Cannot finish match in MatchArranged state");
    }

    @Override
    public void confirmMatch(Match match) {
        match.setState("Confirmado");
    }

    @Override
    public void updateProgress(Match match, int progress) {
        throw new IllegalStateException("Cannot update progress in MatchArranged state");
    }
}
