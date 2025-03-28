package com.challenge.uber_mails.core;

public record EmailRequest(String to, String subject, String body) {
}
