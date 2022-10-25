package com.beingzero.org.leetcode;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int num) {
        /*int temp = num;
        int count = 0;
        while (temp != 1) {
            temp /= 2;
            count++;
        }
        int result = (int) Math.pow(2,count);
        return (result == num) ? true : false;*/

        int i = 1;
        while (i < num){
            i *= 2;
        }
        return i == num;
    }
}