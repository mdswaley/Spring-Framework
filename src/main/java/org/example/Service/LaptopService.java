package org.example.Service;

import org.example.Model.Laptop;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.println("Method called...");
    }

    public boolean isGood(){
        return true;
    }
}
