package com.oop.inhertaince;

public class Main {
    public static void main(String args[]){
        Engine e1 = new Engine("BMW",120,"C_clss","power",2,3.2,4,"Fast");
        System.out.println(e1.type1.type);
        Car e2 = new Engine();
        e2.print();
        Design d1 = new Design(3,3,"red");
        System.out.println(d1);
    }
}
