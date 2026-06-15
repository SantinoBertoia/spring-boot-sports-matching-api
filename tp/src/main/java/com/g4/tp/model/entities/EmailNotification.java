package com.g4.tp.model.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotification extends Notification {

    private static final Logger logger = LoggerFactory.getLogger(EmailNotification.class);

    private String adapter;

    public EmailNotification() {
        this.adapter = "AdapterEmailNotification";
    }

    @Override
    public void sendNotification(String recipient, User user, String message) {
        logger.info("Simulating email notification to {}", recipient);
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }
}
