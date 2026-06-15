package com.g4.tp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.g4.tp.model.entities.Sport;
import com.g4.tp.repository.ISportRepository;

@Service
public class SportService {
    private static final Logger logger = LoggerFactory.getLogger(SportService.class);

    private final ISportRepository sportRepository;

    public SportService(ISportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    public Sport createSport(Sport sport) {
        logger.info("Creating sport {}", sport.getName());
        return sportRepository.save(sport);
    }
}
