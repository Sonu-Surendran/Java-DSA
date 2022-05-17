package com.oop.inhertaince;

public class Engine extends Car{
    String type;
    int turbo;
    double liter;
    Mytype type1;
    @Override
    void print(){
        System.out.println("Im in the Engine class");
    }

    Engine(){
        super();
        this.type = "Petrol/Desiel";
        this.turbo = 0;
        this.liter = 1.2;
    }
    Engine(String name, int speed, String model,String type,int turbo,double liter){
        super(name,speed,model);
        this.type = type;
        this.turbo = turbo;
        this.liter = liter;
    }
    Engine(String name, int speed, String model,String type,int turbo,double liter,int piston,String MMtype){
        super(name,speed,model);
        this.type = type;
        this.turbo = turbo;
        this.liter = liter;
        type1 = new Mytype(piston,MMtype);
    }
    static class Mytype{
        int pistion;
        String type;

        public Mytype(int pistion, String type) {
            this.pistion = pistion;
            this.type = type;
        }

        public Mytype() {
            pistion = 8;
            type ="Electric";
        }
    }

}
