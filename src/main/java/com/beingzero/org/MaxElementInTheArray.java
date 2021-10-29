package com.beingzero.org;
/**
 * Pseudo code:
 *  1. iterate through the array
 *  2. compare the element in the array with the next element.
 *  3. store the greater element in a variable max
 *  4. continue the iteration until the all the elements in array are traversed and store the element in max
 *  5. return the max element
 * */
public class MaxElementInTheArray {

    public static void main(String[] args) {
        int[] arr = {-2, -19, 8, 15, 4};
        System.out.println(findMaxElement(arr));
    }

    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        //int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
                max = (max>arr[i]) ? max: arr[i] ;
            //maxElement = Math.max(arr[i-1],arr[i]);
        }
        //return maxElement;
        return max;
    }
}
