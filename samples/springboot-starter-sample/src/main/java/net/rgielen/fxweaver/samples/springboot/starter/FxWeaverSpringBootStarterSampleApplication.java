package net.rgielen.fxweaver.samples.springboot.starter;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import net.rgielen.fxweaver.samples.springboot.starter.application.SpringbootJavaFxApplication;

/**
 * FxWeaverSpringBootStarterSampleApplication.
 *
 * @author Rene Gielen
 */
@SpringBootApplication
public class FxWeaverSpringBootStarterSampleApplication {

    public static void main(String[] args) {
        Application.launch(SpringbootJavaFxApplication.class, args);
    }

}
