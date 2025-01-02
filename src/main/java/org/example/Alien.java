package org.example;

public class Alien {
    private int age;

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

    public void code(){
        System.out.println("coding...");
    }

}
