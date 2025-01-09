package org.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
public class AppConfig {


//    @Bean
//    public Alien getAlien(Computer com){ // @Qualifier("getLaptop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//
//    // here we create Desktop bean and configure using annotations.
////    @Bean(name = {"Desk","com2","jarvis"}) // you can use multiple name
//    @Bean(name = "jarvis")
////    @Scope(value = "prototype") // using scope annotation for object creation
//    public Desktop getDesktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop getLaptop(){
//        return  new Laptop();
//    }
}
