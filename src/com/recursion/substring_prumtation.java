package com.recursion;

public class substring_prumtation {
    public static void main(String[] args){
        subString("","abc");
    }
    static void subString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subString(p,up.substring(1));
        subString(p+ch,up.substring(1));
    }
}
