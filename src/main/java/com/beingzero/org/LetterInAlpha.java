package com.beingzero.org;

import java.util.Scanner;

public class LetterInAlpha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(checkContainsString(str));
    }

    private static String checkContainsString(String str) {
        boolean containsAllString = true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) > 0 && str.charAt(i) <= 64) || (str.charAt(i) >= 91 && str.charAt(i) <= 96) || (str.charAt(i) >= 123)) {
                containsAllString = false;
                break;
            }
        }
        String s = containsAllString ? "Yes" : "No";
        return s;
    }
}

