package com.g4.tp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.g4.tp.model.entities.Match;
import com.g4.tp.repository.IMatchRepository;

@Service
public class MatchService {
    private static final Logger logger = LoggerFactory.getLogger(MatchService.class);

    private final IMatchRepository matchRepository;

    public MatchService(IMatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Match createMatch(Match match) {
        logger.info("Creating match for sport {} on {}", match.getSport(), match.getDate());
        return matchRepository.save(match);
    }
}
