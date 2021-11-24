package com.beingzero.org;

import java.util.Scanner;

public class DigitsInAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(checkContainsDigits(str));


    }

    private static String checkContainsDigits(String str) {
        boolean containsDigits = true;
        for (int i = 0; i < str.length() ; i++) {
            if((str.charAt(i) >0 && str.charAt(i) <= 47) || (str.charAt(i) >= 58)){
                containsDigits = false;
            }
        }
        String result = containsDigits ? "Yes" : "No";
        return result;
    }
}
