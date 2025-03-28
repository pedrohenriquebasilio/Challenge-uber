package com.challenge.uber_mails.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
