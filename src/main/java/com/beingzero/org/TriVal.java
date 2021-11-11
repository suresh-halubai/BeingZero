package com.beingzero.org;

import java.util.Scanner;

public class TriVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(validateTraingle(a,b,c));
    }

    public static String validateTraingle(int a, int b, int c) {
        if(a+b > c && b+c > a && c+a > b)
            return "Yes";
        else
            return "No";
    }
}
