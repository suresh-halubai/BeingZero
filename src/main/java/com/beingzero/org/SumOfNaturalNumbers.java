package com.beingzero.org;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(findSumOfNaturalNumbers(n));
    }

    public static int findSumOfNaturalNumbers(int n) {
        int sum = (n*(n+1))/2;
        return sum;
    }
}
