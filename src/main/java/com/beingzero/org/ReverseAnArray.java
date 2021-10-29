package com.beingzero.org;

import java.util.Scanner;

/**
 * Pseudo code:
 * 1. pass the array to method reverseArray
 * 2. traverse the array from the last index and print them
  * */
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        int[] arr = new int[len];
        for(int i =0 ; i <len; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {
        for(int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
