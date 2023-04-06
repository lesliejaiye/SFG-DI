package guru.springframework.sfgDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgDI.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
    
    ConstructorInjectedController controller;
    
    /*These set up methods are used via JUnit allowing us to be in control
     * while refrencing Inversion Control
     */
    @BeforeEach
    void setUp() {
        /*Creates a new constuctor injected [controller] object 
         * while also creating an object from the [greetings service]
         */
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}

/*Most preffered method */