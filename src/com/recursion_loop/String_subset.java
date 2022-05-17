package com.recursion_loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class String_subset {
    public static void main(String[] args){
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        for(int i =0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() -1 ;
            for(int j =start;j<= end;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
