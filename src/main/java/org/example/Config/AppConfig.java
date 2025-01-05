package org.example.Config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.ConstructorProperties;

@Configuration
public class AppConfig {
    // here we create Desktop bean and configure using annotations.

//    @Bean(name = {"Desk","com2","jarvis"}) // you can use multiple name
    @Bean(name = "jarvis")
    @Scope(value = "prototype") // using scope annotation for object creation
    public Desktop getDesktop(){
        return new Desktop();
    }
}
