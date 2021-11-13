package com.beingzero.org;
/**
 *  Questions to ask :
 * 1. can i assume these numbers will be in sequence (first n natural numbers)
 * 2.
 *
 *
 * */

import java.util.Arrays;
import java.util.Scanner;

public class MissingInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] num = new int[len];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        int n = num.length + 1;

        int sum = (n * (n+1))/2;

        for (int i = 0; i < num.length; i++) {
            sum = sum - num[i];
        }

        System.out.println(sum);

    }
}
