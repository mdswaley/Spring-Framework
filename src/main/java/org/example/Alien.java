package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //stereotype annotation which is allowed spring to create object of that class basically manage.
public class Alien {
    private int age;

    @Autowired
//    @Qualifier("desktop")
    private Computer com;

    public Alien() {
        System.out.println("Alien Obj created");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter is called...");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
        System.out.println("coding...");
    }

}
