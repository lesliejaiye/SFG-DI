package guru.springframework.sfgDI.services;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
//you can input Qualifier in service line
//Qualifier defined in Service because this script holds no constructor 
@Service("i18nService")


public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hola Mundo - ES";
    }
    
}
