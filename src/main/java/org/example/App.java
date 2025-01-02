package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();

        Alien obj2 = (Alien) context.getBean("alien");
        obj2.code();

        Laptop obj3 = (Laptop) context.getBean("lap");
        System.out.println(obj3.age = 33);

    }
}
