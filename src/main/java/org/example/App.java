package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
//       ---------------JAVA BASED CONFIGURATION------------
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop obj = context.getBean("jarvis",Desktop.class);
//        obj.compile();
//        Desktop obj2 = context.getBean("jarvis",Desktop.class);
//        obj2.compile();

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();



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
