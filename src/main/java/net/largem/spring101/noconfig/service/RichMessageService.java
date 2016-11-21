package net.largem.spring101.noconfig.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by James Tan on 11/20/2016.
 */
@Service
@Profile("rich")
public class RichMessageService implements IMessageService {
    @Override
    public String getMessage() {
        LocalDateTime dateTime = LocalDateTime.now();

        return dateTime.toString() + ": Rich Message";
    }
}
