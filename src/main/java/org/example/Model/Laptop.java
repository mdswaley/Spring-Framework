package org.example.Model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop obj created...");
    }
    @Override
    public void compile(){
        System.out.println("compile using Laptop..");
    }

}
