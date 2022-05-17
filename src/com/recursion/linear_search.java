package com.recursion;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args){
       int[] a ={1, 4, 5, 6, 4, 7, 8, 4};
       ArrayList<Integer> res = linear(4,0,a,new ArrayList<>());
       System.out.println(res);
    }
    static ArrayList<Integer> linear(int target,int index,int[] a,ArrayList<Integer> list){
        if(index == a.length){
            return list;
        }
        if(a[index] == target){
            list.add(index);
        }
        return linear(target,index+1,a,list);
    }
}
