package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Google_phonePad {
    public static void main(String[] args){
        System.out.println(recarr("","12"));
    }

    static void rec(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int ch = up.charAt(0)-'0' ;
        ch -= 1;
        for(int i = ch * 3;i<ch*3+3;i++){
            char pro = 'a';
            pro += i;
            rec(p+pro,up.substring(1));
        }
    }

    static List<String> recarr(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int ch = up.charAt(0)-'0' ;
        List<String> ans = new ArrayList<>();
        ch -= 1;
        for(int i = ch * 3;i<ch*3+3;i++){
            char pro = 'a';
            pro += i;
            ans.addAll(recarr(p+pro,up.substring(1)));
        }
        return ans;
    }
}
