package com.oop;

public class Singletone {
    private Singletone(){

    }
    private static Singletone element;

    public static Singletone getInstance(){
        if(element == null){
            element = new Singletone();
        }
       return element;
    }
}
