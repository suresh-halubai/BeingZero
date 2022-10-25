package com.beingzero.org;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();

        countVowelsAndConstants(str);
    }

    public static void countVowelsAndConstants(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y' || str.charAt(i) == 'w') {
                vowelCount += 1;
               // System.out.println(str.charAt(i));
            }
        }
        System.out.print(vowelCount+" ");
        System.out.print(str.length()-vowelCount);

    }
}
