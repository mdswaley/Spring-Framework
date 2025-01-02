package org.example;

public class Alien {
    private int age;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien Obj created");
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
