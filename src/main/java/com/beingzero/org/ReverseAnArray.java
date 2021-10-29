package com.beingzero.org;
/**
 * Pseudo code:
 * 1. pass the array to method reverseArray
 * 2. traverse the array from the last index and print them
  * */
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 19, 8, 15, 4};
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {
        for(int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
