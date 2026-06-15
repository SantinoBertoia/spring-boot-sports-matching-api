package com.g4.tp.model.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.g4.tp.model.entities.User;

public class AdapterEmailNotification {

    private static final Logger logger = LoggerFactory.getLogger(AdapterEmailNotification.class);

    public void enviarEmail(String recipient, User user, String message) {
        logger.info("Simulating adapted email notification to {}", recipient);
    }
}
