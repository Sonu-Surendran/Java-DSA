package com.oop.inhertaince;

public class Car {
    String name;
    int speed;
    String model;
    static int total = 0;

    public Car(String name, int speed, String model) {
        this.name = name;
        this.speed = speed;
        this.model = model;
        total++;
    }
    Car() {
        this.name = "Maruti";
        this.speed = 120;
        this.model = "Low Class";
        total++;
    }
    Car(Car other){
        this.name=other.name;
        this.speed = other.speed;
        this.model = other.model;
        total++;
    }
    void speedInKM(){
        int km = this.speed*10;
        System.out.println(km);
    }
    void print(){
        System.out.println("Im in Car Super Class");
    }
}
