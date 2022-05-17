package com.oop.inhertaince;

public class Design extends Engine{
    int height;
    int width;
    String color;

    public Design(int height, int width, String color) {
        super();
        this.height = height;
        this.width = width;
        this.color = color;
        this.name="mercedes";
    }

    Design(Design other){
        this.type1 = other.type1;
    }

}
