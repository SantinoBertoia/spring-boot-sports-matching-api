package com.g4.tp.model.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.g4.tp.model.entities.User;

public class AdapterJavaMail {

    private static final Logger logger = LoggerFactory.getLogger(AdapterJavaMail.class);

    public void enviarEmail(String recipient, User user, String message) {
        logger.info("Simulating JavaMail email notification to {}", recipient);
    }
}
