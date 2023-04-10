package guru.springframework.sfgDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgDI.services.GreetingService;

@Controller
public class PropertyInjectedController {
    
    /*gives Spring a hint towards which BEAN you want to have injected into controller*/
    @Qualifier("propertyInjectedGreetingService")

    /*tells Spring that you want to inject an instance of the greeting service  */
    @Autowired

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
 }
