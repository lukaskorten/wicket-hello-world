package de.korten.wicket.examples.helloworld;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet(String name) {
        return String.format("Hello %s!", name);
    }

}
