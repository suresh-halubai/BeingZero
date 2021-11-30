package com.beingzero.org;

import java.util.Locale;
import java.util.Scanner;

/**
 * A, E, I, O, U, Y, W
 * */
public class Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s= s.toLowerCase();

        checkIfVowelsExists(s);
    }

    public static void checkIfVowelsExists(String s) {
        boolean isVowelPresent = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' && s.charAt(i) == 'e' && s.charAt(i) == 'i' && s.charAt(i ) == 'o' && s.charAt(i) == 'u'){
                isVowelPresent = true;
            }
        }
        if(isVowelPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
