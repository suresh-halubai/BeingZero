package com.beingzero.org;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number up to which prime numbers are to be found");
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int count =0;
        for (long j = 2; j <=num ; j++) {
            boolean prime = true;

            for (long i = 2; i <= j / 2; i++) {

                if (j % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                count ++;
                System.out.println(count+": "+j+ ": is a Prime Number");

            } else {
               // System.out.println(j+ ": is Not a prime");
            }
        }
    }
}
