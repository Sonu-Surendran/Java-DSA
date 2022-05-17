package com.recursion;

public class max_possible_sum {
    public static void main(String[] args){
        int[] a = {4,6,3,1,5,6,3,2,6,6};
        int b = 4;
        int c1 = sum(a,b,0);
        int c2 = sum(a,b,a.length-b);
        int c3 = sum(a,b,a.length-b+1);
        System.out.println(largest(c1,c2,c3));
    }
    static int sum(int[] a,int b,int index){
            int i = 0,s=0;
            int size = a.length;
            if(b > size){
            return -1;
        }
        else{
            while(i<b){
                index %= size;
                s += a[index];
                i++;
                index++;
            }
        }
        return s;
    }
    static int largest(int n1,int n2,int n3){
        if(n1>n2){
            if(n1>n3){
                return n1;
            }
            else{
                return n3;
            }
        }
        else if(n2>n3){
            return n2;
        }
        return n3;
    }
}
