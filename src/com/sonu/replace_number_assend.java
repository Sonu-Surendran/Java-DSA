package com.sonu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class replace_number_assend {
    public static void main(String[] args){
        int[] a = {1,2,4,5,3};
        boolean res = checkPossibility(a);
        System.out.println(res);

    }
    public static boolean checkPossibility(int[] nums) {
        boolean changed = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (changed) return false;
                if (i != 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
                changed = true;
            }
        }
        return true;
    }
}
