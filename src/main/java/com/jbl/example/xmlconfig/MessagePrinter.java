package com.jbl.example.xmlconfig;

import org.apache.log4j.Logger;

public class MessagePrinter {

    final private MessageService service;

    private Logger logger = Logger.getLogger(MessagePrinter.class);

    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        logger.info(this.service.getMessage());
    }
}