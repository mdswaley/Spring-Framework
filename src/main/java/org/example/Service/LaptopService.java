package org.example.Service;

import org.example.Model.Laptop;
import org.example.Repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;

    public void addLaptop(Laptop lap){
        laptopRepo.save(lap);
    }

    public boolean isGood(){
        return true;
    }
}
