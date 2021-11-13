package com.beingzero.org;

import java.util.Scanner;

public class CubeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(findCubesSum(n));

    }

    public static int findCubesSum(int n) {
        int sum = (n*(n+1))/2 * (n*(n+1))/2;
        return sum;
    }
}
