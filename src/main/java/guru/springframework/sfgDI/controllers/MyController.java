package guru.springframework.sfgDI.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgDI.services.GreetingService;

@Controller
public class MyController {

    // Greeting Service Property 
    private final GreetingService greetingService;

    // Contructor for Greeting Service 
    public MyController (GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
