package guru.springframework.sfgDI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*Sets this BEAN up as the 'primary' bean */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    
    @Override
    public String sayGreeting() {
        return "HelloWorld - From th Primary Bean";  
    }
    
}
