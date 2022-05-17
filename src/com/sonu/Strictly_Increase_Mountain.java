package com.sonu;

public class Strictly_Increase_Mountain {
    public static void main(String[] args){
        int[] a ={0,1,2,1,2};
        boolean res = validMountainArray(a);
        System.out.println(res);
    }
      static boolean validMountainArray(int[] arr) {
        int start = 0;
        int mid ;
        int end = arr.length-1;
        while(start<end){
            mid = start + (end -start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        if(end == 0 || end ==arr.length-1){
            return false;
        }
        else if(repeat(arr,0,end)){
            return false;
        }
        else if(repeatf(arr,end,arr.length-1)){
            return false;
        }
        return true;
    }
   static boolean repeat(int[] a,int s,int end){
        for(int i=s;i<end;i++){
            if(a[i]>=a[i+1]){
                return true;
            }
        }
        return false;
    }
    static boolean repeatf(int[] a,int s,int end){
        for(int i=s;i<end;i++){
            if(a[i]>=a[i+1]){
                return true;
            }
        }
        return false;
    }
}
