package com.jbl.example.javaconfig;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private MessageService service;

    private Logger logger = Logger.getLogger(MessagePrinter.class);

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        logger.info(this.service.getMessage());
    }
}