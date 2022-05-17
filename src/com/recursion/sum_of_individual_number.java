package com.recursion;

public class sum_of_individual_number {
    public static void main(String[] args){
        int num = 134223;
        int total = (int) Math.log10(num);
        int res = sumOf(num,total);
        System.out.println(res);
    }
    static int sumOf(int n , int pow){
        if(pow == 0){
            return n;
        }
        return (int) ((n%10)*Math.pow(10,pow) + sumOf(n/10,--pow));
    }
}
