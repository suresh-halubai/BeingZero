package com.beingzero.org;

import sun.applet.Main;

import java.util.Scanner;

public class OccurrenceOfACharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Scanner read = new Scanner(System.in);
        char ch = read.findInLine(".").charAt(0);
        findOccurenceOfChar(str,ch);
    }

    public static void findOccurenceOfChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i))
                count++;
        }
        System.out.println(count);
    }
}
