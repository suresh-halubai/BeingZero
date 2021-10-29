package com.beingzero.org;

import java.util.Arrays;
import java.util.HashMap;

/**
* Pseudo code
* 1. traverse through all the elements in the array
 * 2. store each element of the array in a map
 * 3. if the element is already seen update the value of that element by 1
 * 4. now search through the map and print only those keys that have value more than 1 which will give us the duplicate
* */
public class DuplicateElementInTheArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 9, 21, 10};
        findDuplicateElementOfArray(arr);
    }

    public static void findDuplicateElementOfArray(int[] arr) {
        HashMap<Integer,Integer> duplicate = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(duplicate.containsKey(arr[i])){
                duplicate.put(arr[i],duplicate.get(arr[i])+1);
            }
            else{
                duplicate.put(arr[i],1);
            }
        }
        for (Integer i: duplicate.keySet()
             ) {
                if(duplicate.get(i) > 1)
                    System.out.println(i);
        }
    }
}
