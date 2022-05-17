package com.recursion;

public class Permutation_String {
    public static void main(String[] args){
        perm("","abc");
    }
    static void perm(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        int loop = p.length();
        for(int i=0;i<=loop;i++){
            String sp = p.substring(0,i)+ch+p.substring(i,p.length());
            perm(sp,up.substring(1));
        }
    }
}
