package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien Obj created");
    }

//    constructor injection
//    @ConstructorProperties({"age","lap"}) // if you are using name property int xml file for initializing.
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter is called...");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        lap.compile();
        System.out.println("coding...");
    }

}
