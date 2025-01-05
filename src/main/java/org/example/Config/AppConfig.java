package org.example.Config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public Alien getAlien(Computer com){ // @Qualifier("getLaptop")
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }


    // here we create Desktop bean and configure using annotations.
//    @Bean(name = {"Desk","com2","jarvis"}) // you can use multiple name
    @Bean(name = "jarvis")
//    @Scope(value = "prototype") // using scope annotation for object creation
    public Desktop getDesktop(){
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop getLaptop(){
        return  new Laptop();
    }
}
