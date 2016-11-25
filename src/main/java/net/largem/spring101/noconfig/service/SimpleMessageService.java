package net.largem.spring101.noconfig.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by James Tan on 11/20/2016.
 */

@Service
@Profile({"default", "simple"})
//@Profile("simple")
public class SimpleMessageService implements IMessageService {
    @Override
    public String getMessage() {
        return "Simple Message";
    }
}
