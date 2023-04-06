package guru.springframework.sfgDI.controllers;

import guru.springframework.sfgDI.services.GreetingService;

public class PropertyInjectedController {
    
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
 }
