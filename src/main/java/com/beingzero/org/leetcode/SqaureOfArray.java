package com.beingzero.org.leetcode;

import java.util.Arrays;

public class SqaureOfArray {

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(result[i]);
        }

    }
}
