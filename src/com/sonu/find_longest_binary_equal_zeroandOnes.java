package com.sonu;

public class find_longest_binary_equal_zeroandOnes {
    public static void main(String[] args){
        int[] nums = {0,1,1,0,1,1,1,0};
        int res = findMaxLength(nums);
        System.out.println(res);
    }
    public static int findMaxLength(int[] nums) {
        int longest = 0;
        for(int left = 0;left<nums.length-1;left++){
            int zero=0,one=0;
            int right = left;
            while(right<nums.length){
                if(nums[right]==0) zero++;
                else if(nums[right] == 1) one++;
                if(zero == one && longest<zero+one) longest = zero+one;
                right++;

            }
            if(longest>=nums.length-left-1)
                return longest;
        }
        return longest;
    }
}
