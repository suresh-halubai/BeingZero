package com.beingzero.org;

import java.util.Scanner;

public class NumberOfMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int count = 0;

        for (int i = 1; i <= range ; i++) {
            if(i%3 == 0 || i%5 ==0)
                count++;
        }
        System.out.println(count);
    }
}
