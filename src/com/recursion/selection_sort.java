package com.recursion;

public class selection_sort {
    public static void main(String[] args){
        int[] a = {9,1,4,2,6,3,8,5,7};
        int m = 0;
        int[] res = selection(a,m,a.length - 1,1);
        for(int ele: res){
            System.out.print(ele + " ");
        }
    }
    static int[] selection(int[] a,int max,int l,int index){
        if(l<1){
            return a;
        }
        if(index >= l){
            helper(a,max,l);
            return selection(a,0,--l,1);
        }
        if(a[max]<a[index]){
            max = index;
        }
        return selection(a,max,l,++index);
    }

    private static void helper(int[] a,int max, int l) {
        if(max == l){
            return;
        }
        int temp = a[max];
        a[max] = a[l];
        a[l] = temp;
    }
}
