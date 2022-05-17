package com.recursion;

public class triangle {
    public static void main(String[] args){
        dis(5,0);
    }
    static void dis(int r,int c){
        if(r<1){
           return;
        }
        if(r<=c){
            System.out.println("");
            dis(r-1,0);
        }
        else {
            System.out.print("*");
            dis(r, ++c);
        }
    }
}
