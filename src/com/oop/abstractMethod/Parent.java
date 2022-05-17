package com.oop.abstractMethod;

public abstract class Parent {
    int age;

    Parent(){

    }

    protected Parent(int val) {
        this.age = val;
    }


    abstract void money();
    abstract void morals();
    abstract void values();
}
