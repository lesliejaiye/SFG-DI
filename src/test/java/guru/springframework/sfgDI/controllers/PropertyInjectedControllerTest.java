package guru.springframework.sfgDI.controllers;

import guru.springframework.sfgDI.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    
    PropertyInjectedController controller; 

    @BeforeEach
    void setUp() {
        /*Creating a new property injected [controller] object, 
        assigning it to controller variable */

        /*Similar to creating a new object from class */

        controller = new PropertyInjectedController();

        /*Accessing the property directly using the greeting service implmentation object
         * (created here with the [new])
         
         greetingService calls object defined in PropertyInjectedController
         REFRENCING object calling GreetingService script
         
         */
        controller.greetingService = new GreetingServiceImpl();
    }
        /*Uses the defined controller to call getGreeting method from Controller  */
    @Test 
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}

/*Least preferred DI method */