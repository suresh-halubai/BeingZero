package com.beingzero.org;
/**
 * pseudo code:
 * 1. iterate through all the elements array
 * 2. check if the element in the array is divisible by 2
 * 3. if the element is not divisible by 2 then add it up and store it in the variable "sum"
 * 4. return the variable sum
 * */
public class SumOfAllOddElementsInArray {
    public static void main(String[] args) {
        int[] arr = {6, 9, 8, 4, 3};
        System.out.println(findSumOfAllOddElements(arr));
    }

    public static int findSumOfAllOddElements(int[] arr) {
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2 != 0){
                sum = sum+arr[i];
            }
        }
        return sum;
    }
}
