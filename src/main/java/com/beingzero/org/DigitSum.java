package com.beingzero.org;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(findDigitSum(num));
    }

    public static int findDigitSum(int num) {
        int sum = 0;
        while(num != 0){
            sum = sum+ num%10;
            num = num/10;
        }
        return sum;
    }
}
