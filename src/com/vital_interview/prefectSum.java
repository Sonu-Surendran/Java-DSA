package com.vital_interview;

import java.util.Arrays;

public class prefectSum {
    public static void main(String[] args){
         int input1 = 5;
         int[] input2 ={9,7,3,12,7};
         int input3 = 4;
         int res = PerfectSum(input1,input2,input3);
        System.out.println(res);
    }

    public static int PerfectSum(int input1,int[] input2,int input3){
        int count =0;
        int sum=0;
        int res = findPSum(input2,input3,count,sum);
        return res;
    }

    private static int findPSum(int[] input2, int input3, int count,int sum) {

        for(int i=0;i<input2.length;i++){
            int num = input2[i];
            sum += num;
            if(sum>input3){
                sum-=num;
                continue;
            }
            if(sum == input3){
                count+=1;
                continue;
            }
            if(sum<input3){
               count += findPSum(Arrays.copyOfRange(input2,i+1,input2.length),input3,0,sum);
               sum -= num;
            }
        }
        return count;
    }
}
