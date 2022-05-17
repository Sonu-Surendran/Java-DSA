package com.recursion;

import java.util.Arrays;

public class merge_sorting {
    public static void main(String[] args){
        int[] arr = {4,5,1,2,6,8,4,22,12,43};
        arr = mergesorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesorting(int[] a){
        if(a.length == 1){
            return a;
        }

        int mid = a.length/2;

        int[] left = mergesorting(Arrays.copyOfRange(a,0,mid));
        int[] right = mergesorting(Arrays.copyOfRange(a,mid,a.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length+right.length];

        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k] = left[i];
            k++;i++;
        }
        while(j<right.length){
            arr[k] = right[j];
            k++;j++;
        }
        return arr;
    }
}
