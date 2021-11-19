package com.beingzero.org;

import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long reverse = 0;

        while(num != 0){
            long rem = num%10;
            reverse = reverse*10+ rem;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
