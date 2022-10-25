package com.beingzero.org.leetcode;

import java.util.Scanner;

public class NumberOfWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        System.out.print(CountWords(x));
    }

    private static int CountWords(String x) {
        int count = 0;

        String[] s = x.split(" ");
        for (String c:s
             ) {
            count ++;
        }
        return count;
    }
}
