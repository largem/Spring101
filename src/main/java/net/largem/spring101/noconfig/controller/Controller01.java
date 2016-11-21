package net.largem.spring101.noconfig.controller;

import net.largem.spring101.noconfig.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by James Tan on 11/20/2016.
 */
@Controller
public class Controller01 {

    private final IMessageService service_;

    @Autowired
    public Controller01(IMessageService service)
    {
        service_= service;
    }

    public void printMessage()
    {
        System.out.println(service_.getMessage());
    }
}
