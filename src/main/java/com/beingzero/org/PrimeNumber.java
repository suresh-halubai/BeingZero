package com.beingzero.org;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        boolean prime = true;
        for (long i = 2; i < num ; i++) {

            if(num % i == 0) {
                prime = false;
            }
        }
        if (prime){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
