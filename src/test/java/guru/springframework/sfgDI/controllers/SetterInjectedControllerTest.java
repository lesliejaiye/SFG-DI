package guru.springframework.sfgDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgDI.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        /*Initiate object defined as controller */
        controller = new SetterInjectedController();

        /*Using setter to inject the greeting service implementation */
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting () {
        System.out.println(controller.getGreeting());
    }
}
