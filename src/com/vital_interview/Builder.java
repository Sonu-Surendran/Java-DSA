package com.vital_interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Builder {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(3);
        l.add(6);
        l.add(4);
        int res = maxDif(4,2,l);
        System.out.println(res);
    }

    public static int maxDif(int N, int K, List<Integer> Arr){
         Collections.sort(Arr);
         int Size = Arr.size();
         int num1 = (Arr.get(Size-1));
         int num2 = (Arr.get(Size-2));
         int num = num1-num2;
         if(K<num){
             num = K;
         }
         for(int i=0;i<num;i++){
             Arr.set(Arr.size()-1,Arr.get(Arr.size()-1)-1);
             Arr.set(0,Arr.get(0)+1);
             Collections.sort(Arr);
        }
        return Arr.get(Arr.size()-1)-Arr.get(0);
    }
}
