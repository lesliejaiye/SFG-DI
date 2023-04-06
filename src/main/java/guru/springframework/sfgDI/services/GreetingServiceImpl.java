package guru.springframework.sfgDI.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "HelloWorld";  
    }
}
