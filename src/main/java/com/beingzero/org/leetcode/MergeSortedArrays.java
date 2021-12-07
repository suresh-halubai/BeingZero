package com.beingzero.org.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};

        mergeSortedArrays(nums1, nums2);
    }

    private static void mergeSortedArrays(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length ; i++) {
            if(nums1[i] == 0){
                nums1[i] = nums2[i-nums2.length];
            }
        }
        Arrays.sort(nums1);
        for (int k = 0; k< nums1.length; k++ ){
            System.out.print(nums1[k] + " ");
        }
    }

}
