package com.g4.tp.model.state;

import com.g4.tp.model.entities.Match;
import com.g4.tp.model.entities.User;

public class CancelledState implements IMatchState {

    @Override
    public void cancel(Match match) {
        throw new IllegalStateException("Match is already cancelled");
    }

    @Override
    public void joinUser(User user, Match match) {
        throw new IllegalStateException("Cannot join user, match is cancelled");
    }

    @Override
    public void finishMatch(Match match) {
        throw new IllegalStateException("Cannot finish cancelled match");
    }

    @Override
    public void confirmMatch(Match match) {
        throw new IllegalStateException("Cannot confirm cancelled match");
    }

    @Override
    public void updateProgress(Match match, int progress) {
        throw new IllegalStateException("Cannot update progress of cancelled match");
    }
}
