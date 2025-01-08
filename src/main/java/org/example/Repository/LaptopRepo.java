package org.example.Repository;

import org.example.Model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(Laptop lap){
        System.out.println("Saved in database...");
    }
}
