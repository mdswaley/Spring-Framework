package org.example;

import org.example.Model.Alien;
import org.example.Model.Laptop;
import org.example.Service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main(String[] args )
    {
//        -------------------WELCOME TO SPRING BOOT----------------
        ApplicationContext context = SpringApplication.run(App.class, args);

//        Alien obj = context.getBean(Alien.class);
//        obj.code();
//        System.out.println(obj.getAge());

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);


//       ---------------JAVA BASED CONFIGURATION------------
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop obj = context.getBean("jarvis",Desktop.class);
//        obj.compile();
//        Desktop obj2 = context.getBean("jarvis",Desktop.class);
//        obj2.compile();

//        Alien obj = context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();



//        --------------XML BASED CONFIGURATION-------------
//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Alien obj = (Alien) context.getBean("alien");
////        obj.setAge(77);
//        System.out.println(obj.getAge());
//        obj.code();
//
//        Desktop obj2 = context.getBean(Desktop.class); // we can mention class as will in getBean method. so that no need of id in xml.


    }
}
