package com.oop.tryCatch;

public class People implements Cloneable {
    private int age;
    private String Name;
    private int[] records;

    People(int age,String Name,int[] records){
        this.age = age;
        this.Name= Name;
        this.records = records;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
