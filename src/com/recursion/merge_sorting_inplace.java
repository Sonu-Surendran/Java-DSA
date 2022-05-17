package com.recursion;

import java.util.Arrays;

public class merge_sorting_inplace {
    public static void main(String[] args){
        int[] arr = {4,5,1,2,6,8,4,22,12,43};
        mergesorting(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesorting(int[] a,int s,int e){
        if(e-s == 1){
            return ;
        }

        int mid = (s+e)/2;

        mergesorting(a,s,mid);
        mergesorting(a,mid,e);

        merge(a,s,mid,e);
    }

    private static void merge(int[] arr,int s,int m,int e) {
        int[] mix = new int[e-s];

        int i=s,j=m,k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k] = arr[i];
            k++;i++;
        }
        while(j<e){
            mix[k] = arr[j];
            k++;j++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}
