package com.beingzero.org;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(CheckIfHarshadNumber(num));
    }

    public static String CheckIfHarshadNumber(int num) {
        int temp = num;
        int sum =0;
        while (temp != 0){
            int rem = temp % 10;
            sum = sum+rem;
            temp /= 10;
        }
        String result = (num%sum == 0) ? "Yes" : "No";
        return result;
    }
}
