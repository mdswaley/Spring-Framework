package org.example.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //stereotype annotation which is allowed spring to create object of that class basically manage.
@Lazy // create object when we need
public class Alien {

    @Value("23") // we are inject the value not hard code it (like age = 23).
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Obj created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired // setter injection
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
        System.out.println("coding...");
    }

}
