package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class vitalCodeRound {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("dsfsfsfabcdesfsant");
        li.add("ant");
        String s = li.get(0);
        String x = li.get(1);
        System.out.println(index(s,x,0));
    }
    static int index(String s,String x,int index){
        if(s.length()<x.length()){
            return -1;
        }
        boolean flag = false;
        int i;
        int len = x.length();

        for( i=0;i<x.length();i++){
            if(s.charAt(i) != x.charAt(i)){
                if(flag) {
                    return index(s.substring(1), x, ++index);
                }
                    flag = true;
            }
            len--;
        }
        if(len==0){
            return index;
        }
        return -1;
    }
}
