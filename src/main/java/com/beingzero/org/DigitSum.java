package com.beingzero.org;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String num = in.next();
        System.out.println(findDigitSum(num));
    }

    public static int findDigitSum(String num) {
        int sum = 0;
        for (int i = 0; i < num.length() ; i++) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum += digit;
        }
        return sum;
    }
}
