package com.recursion;

import java.util.Arrays;

public class quick_sorting {
    public static void main(String[] args){
        int[] a = {5,4,3,2,1};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static void quick(int[] a,int low,int high){
        if(low >=high) return;
        int s = low;
        int e = high;
        int mid = s+(e-s)/2;

        while (s<=e){
            while(a[mid]>a[s]){
                s++;
            }
            while(a[mid]<a[e]){
                e--;
            }

            if(s<=e){
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        quick(a,low,e);
        quick(a,s,high);
    }
}
