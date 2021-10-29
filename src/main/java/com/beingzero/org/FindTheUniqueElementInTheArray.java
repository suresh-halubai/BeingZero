package com.beingzero.org;

import org.omg.CORBA.Object;

import java.util.*;

/**
 * 2 approaches discussed below:
 * ************************************************************
 * Pseudo code: using Map
 * 1. define a HashMap and iterate through the array element and store them in Hashmap
 * 2. if an element is already seen update the value of that element by 1
 * 3. now iterate through the keyset in a map that has the value = 1
 * 4. print that element
 * ***********************************************************
 * Pseudo code:
 * 1. define a boolean variable "isUnique" to say unique
 * 2. take the first element in array and compare this element with all the rest of the elements in array.
 * 3. if a match is found then set the boolean variable isUnique to false
 * 4. otherwise set the boolean variable isUnique to true and print the element
 */
public class FindTheUniqueElementInTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        int[] arr = new int[len];
        for(int i =0 ; i <len; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        findUniqueElement(arr);
    }

    public static void findUniqueElement(int[] arr) {

        HashMap<Integer,Integer> unique = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(unique.containsKey(arr[i])){
                unique.put(arr[i],unique.get(arr[i])+1);
            }
            else{
                unique.put(arr[i],1);
            }
        }

        for (Integer uniqueElement :unique.keySet()
             ) {
                if(unique.get(uniqueElement) == 1)
                    System.out.println(uniqueElement);
        }

        /*for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                } else {
                    isUnique = false;
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);
            }
        }*/
    }
}
