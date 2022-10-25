package com.beingzero.org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int l1 = nums1.length;


        mergeSortedArrays(nums1, nums2,l1);
    }

    private static void mergeSortedArrays(int[] nums1, int[] nums2,int l1) {
        ArrayList<Integer> merge = new ArrayList<>();
        for (Integer i : nums1
             ) {
            if(i == 0){
                merge.remove(i);
            }
            else
                merge.add(i);
        }
        for (Integer i: nums2
             ) {
            merge.add(i);
        }

        for (int i = 0; i < l1  ; i++) {
            nums1[i] = merge.get(i);
        }
        Arrays.sort(nums1);

        for (int i = 0; i < l1; i++) {
            System.out.print(nums1[i]+ " ");
        }
    }

}
