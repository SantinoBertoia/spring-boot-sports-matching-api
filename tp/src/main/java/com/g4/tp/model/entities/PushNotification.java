package com.g4.tp.model.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushNotification extends Notification {

    private static final Logger logger = LoggerFactory.getLogger(PushNotification.class);

    private String adapter;

    public PushNotification() {
        this.adapter = "AdapterPushNotification";
    }

    @Override
    public void sendNotification(String recipient, User user, String message) {
        logger.info("Simulating push notification to {}", recipient);
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }
}
