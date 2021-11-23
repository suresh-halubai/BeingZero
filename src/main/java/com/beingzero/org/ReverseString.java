package com.beingzero.org;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev+ str.charAt(i);
        }
        return rev;
    }
}
