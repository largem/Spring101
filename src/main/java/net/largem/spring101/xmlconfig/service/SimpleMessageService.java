package net.largem.spring101.xmlconfig.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by James Tan on 11/20/2016.
 */

public class SimpleMessageService implements IMessageService {
    @Override
    public String getMessage() {
        return "Simple Message";
    }
}
