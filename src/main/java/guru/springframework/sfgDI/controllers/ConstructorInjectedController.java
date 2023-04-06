package guru.springframework.sfgDI.controllers;

import guru.springframework.sfgDI.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;

    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
