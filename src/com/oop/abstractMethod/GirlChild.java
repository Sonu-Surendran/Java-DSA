package com.oop.abstractMethod;

public class GirlChild extends Parent{

    GirlChild(){

    }
    GirlChild(int val){
        super(val);
        money();
        morals();
    }

    @Override
    void money() {
        System.out.println("The girl as parent money");
    }

    @Override
    void morals() {
        System.out.println("Girl has the parents morals");
    }

    @Override
    void values() {
        System.out.println("The girl has the values of the parent");

    }
}
