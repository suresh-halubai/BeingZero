package com.beingzero.org;

import java.util.Scanner;

public class OddEvenIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printOddEvenIndex(str);
    }

    private static void printOddEvenIndex(String str) {
        for (int i = 1; i <str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }

        for (int i = 0; i <str.length() ; i+=2) {
           System.out.print(str.charAt(i));
        }
    }
}
