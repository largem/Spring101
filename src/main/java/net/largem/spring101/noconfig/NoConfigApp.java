package net.largem.spring101.noconfig;

import net.largem.spring101.noconfig.controller.Controller01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by James Tan on 11/20/2016.
 */


//@ComponentScan without argument will scan the current package for @Controller, @Service, @Component, @Repository
//Those annotated classes will be created as beans.
@ComponentScan
//Not sure if it is the recommended way to use application.properties which is not identified as a Spring Application
//properties (in Spring Boot, application.properties will be picked up automatically).
@PropertySource("classpath:application.properties")
public final class NoConfigApp {
    public static void main(String[] args) {

        //Note:
        //if there is no @ComponentScan, all the bean classes have to be put into context below.
        //ex.
        //ApplicationContext context = new AnnotationConfigApplicationContext(Controller01.class, TextMessageServiceService.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(NoConfigApp.class);

        Controller01 controller  = context.getBean(Controller01.class);

        controller.printMessage();
    }

}
