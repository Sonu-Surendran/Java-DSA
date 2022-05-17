package com.vital_interview;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnotherDIvisorProblem {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(11);
        list.add(8);
        list.add(3);
        list.add(16);
        int l = anotherDivisorProblem(5,list);
        System.out.println(l);
    }
    private static int anotherDivisorProblem(int N, List<Integer> a){
        Collections.sort(a);
        int count =1;

        for(int i=1;i<N;i++){
            boolean flag=true;
            int num = a.get(i);
            for(int j=0;j<i;j++){
                if(num%a.get(j) == 0){
                    flag = false;
                    break;
                }

            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}
