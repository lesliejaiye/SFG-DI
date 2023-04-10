package guru.springframework.sfgDI.services;

import org.springframework.stereotype.Service;

/*tells Spring to bring an instance of this into context within the Controller */
@Service

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "HelloWorld";  
    }
}
