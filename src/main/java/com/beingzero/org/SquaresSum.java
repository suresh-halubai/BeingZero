package com.beingzero.org;

import java.util.Scanner;

public class SquaresSum {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            System.out.println(findSumOfSquareOfNaturalNumbers(n));
    }

    public static int findSumOfSquareOfNaturalNumbers(int n) {
        int sum = (n*(n+1)*(2*n+1))/6;
        return sum;
    }

}
