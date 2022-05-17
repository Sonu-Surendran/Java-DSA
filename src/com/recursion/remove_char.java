package com.recursion;

public class remove_char {
    public static void main(String[] args){
        String s = "ayyyappaaaaaaaayyy";
        StringBuilder sb = new StringBuilder();
        sb = rm(s,0,sb);
        s = inrem(s);
        System.out.println(s);
    }
    static StringBuilder rm (String s,int index,StringBuilder ans){
        if(index == s.length()){
            return ans;
        }
        if(s.charAt(index) == 'a'){
            return rm(s,++index,ans);
        }
        else{
            int i = index;
            return rm(s,++index,ans.append(s.charAt(i)));
        }
    }
    static String inrem(String s){
        if(s.isEmpty()){
            return s;
        }
        if(s.charAt(0)=='a'){
            return inrem(s.substring(1,s.length()));
        }
        else return s.charAt(0) +""+ inrem(s.substring(1,s.length()));
    }
}
