package org.example.Model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop obj created...");
    }
    @Override
    public void compile(){
        System.out.println("compile using Laptop..");
    }

}
