package com.beingzero.org.leetcode;

import java.util.ArrayList;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        //int[] arr = {1,2,3};

        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){

            result.add(arr[i]);
            if(arr[i] == 0){
                result.add(arr[i]);
            }
        }

        System.out.print("[");

        for(int i = 0; i < arr.length ; i++){
           // System.out.print(arr[i] = result.get(i));
            if(i == (arr.length-1))
                System.out.print(arr[i] = result.get(i));
            else {
                System.out.print(arr[i] = result.get(i));
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
