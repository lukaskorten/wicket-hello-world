package de.korten.wicket.examples.helloworld;

import javax.inject.Inject;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;

public class GreetingModel extends LoadableDetachableModel<String> {

    @Inject
    private GreetingService greetingService;
    private String name;

    public GreetingModel(String name) {
        this.name = name;
        Injector.get().inject(this);
    }

    @Override
    protected String load() {
        return greetingService.greet(name);
    }
}
