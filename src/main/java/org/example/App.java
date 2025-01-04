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
//        obj.setAge(77);
        System.out.println(obj.getAge());
        obj.code();

        Desktop obj2 = context.getBean(Desktop.class); // we can mention class as will in getBean method. so that no need of id in xml.


    }
}
