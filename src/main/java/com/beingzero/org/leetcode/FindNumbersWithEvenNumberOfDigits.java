package com.beingzero.org.leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        int evenDigits = 0;

        for(int i = 0; i < nums.length ; i++){
            while(nums[i] != 0){
                count++;
                nums[i] = nums[i]/10;
            }
            if(count % 2 == 0 ){
                evenDigits++;
            }
            count = 0;
        }
        return evenDigits;
    }

    public static void main(String[] args) {
        int nums[] = {12,3,345,24,12};
        System.out.println(findNumbers(nums));
    }
}
