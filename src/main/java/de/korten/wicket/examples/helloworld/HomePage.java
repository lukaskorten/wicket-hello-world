package de.korten.wicket.examples.helloworld;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.annotation.mount.MountPath;

/**
 * The home page of the "hello-world"-application.
 */
@MountPath("/home")
public class HomePage extends WebPage {

    public HomePage() {

        add(new Label("greeting", new GreetingModel("World")));

    }
}
