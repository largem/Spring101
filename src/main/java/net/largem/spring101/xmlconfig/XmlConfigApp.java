package net.largem.spring101.xmlconfig;

import net.largem.spring101.xmlconfig.controller.Controller01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by James Tan on 11/21/2016.
 */

/**
 * This module is to demonstrate how xml configuration works.
 * All the beans are defined in xml configuration file.
 * The class of beans are just POJO, no any annotation is needed.
 * Xml configuration is loaded by ClassPathXmlApplicationContext, so no path is needed
 * + just make sure the file in classpath. In this case, it is under resources directory,
 * + which is defined in intellij module.
 */
public class XmlConfigApp {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Controller01 controller = context.getBean(Controller01.class);

        controller.printMessage();
    }
}
