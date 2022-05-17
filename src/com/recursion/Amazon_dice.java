package com.recursion;

public class Amazon_dice {
    public static void main(String[] args){
        rec("",4);
    }

    static void rec(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target;i++){
            rec(p+i,target-i);
        }
    }
}
