package net.largem.spring101.xmlconfig.service;

import java.time.LocalDateTime;

/**
 * Created by James Tan on 11/20/2016.
 */
public class RichMessageService implements IMessageService {
    @Override
    public String getMessage() {
        LocalDateTime dateTime = LocalDateTime.now();

        return dateTime.toString() + ": Rich Message";
    }
}
