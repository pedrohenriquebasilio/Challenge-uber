package com.challenge.uber_mails.infra.exceptions;

public class EmailServiceException extends  RuntimeException{

    public EmailServiceException(String message){
        super(message);
    }
}
