package com.beingzero.org;

import java.util.Scanner;

/**
 * A, E, I, O, U, Y, W
 * */
public class Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s= s.toLowerCase();

        System.out.print(checkIfVowelsExists(s));
    }

    public static boolean checkIfVowelsExists(String s) {
        boolean isVowelPresent = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && s.charAt(i) == 'e' && s.charAt(i) == 'i' && s.charAt(i) == 'o' && s.charAt(i) == 'u') {
                isVowelPresent = true;
                break;
            }
        }
        return isVowelPresent;
    }
}
