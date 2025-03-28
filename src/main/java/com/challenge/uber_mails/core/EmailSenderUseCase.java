package com.challenge.uber_mails.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}
