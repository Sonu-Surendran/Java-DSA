package com.oop;

import java.util.Arrays;
import java.util.Comparator;

public class Lamba implements Operation{
    public static void main(String[] args){
        Operation sum = (a,b)-> a+b;
        Operation sub = (a,b)-> a-b;

        int res = met(5,5,sum);
        Integer[] list = new Integer[8];
        for(int i=0;i<8;i++){
            list[i]=i;
        }
        Arrays.sort(list,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return -(int)(o1-o2);
            }
        });
        System.out.println(list[0]);
    }

    private static int met(int a,int b,Operation obj){
        return obj.operator(a,b);
    }

    @Override
    public int operator(int a, int b) {
        return 0;
    }

}
