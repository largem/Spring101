package net.largem.spring101.xmlconfig.controller;

import net.largem.spring101.xmlconfig.service.IMessageService;

/**
 * Created by James Tan on 11/20/2016.
 */
public class Controller01 {

    private final IMessageService service_;

    // this is constructor injection.
    public Controller01(IMessageService service)
    {
        service_= service;
    }

    public void printMessage()
    {
        System.out.println(service_.getMessage());
    }
}
