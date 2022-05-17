package com.oop.abstractMethod;

public class BoyChild extends Parent{

    BoyChild(){

    }

    BoyChild(int val){
        super(val);
        money();
        morals();
    }

    @Override
    void money() {
        System.out.println("The boy as parent money");
    }

    @Override
    void morals() {
        System.out.println("boy has the parents morals");
    }

    @Override
    void values() {
        System.out.println("The boy has the values of the parent");

    }
}
