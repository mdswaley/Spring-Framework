package org.example.Config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // here we create Desktop bean and configure using annotations.
    @Bean
    public Desktop getDesktop(){
        return new Desktop();
    }
}
