package com.beingzero.org.leetcode;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        if(num == 0) return 0;
        if(num % 9 == 0) return 9;
        return (num%9);
    }
}
