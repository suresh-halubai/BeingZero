package com.beingzero.org.leetcode;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isPalindrome(num));
    }
            public static boolean isPalindrome(int x) {
                int palindrome = 0 ;
                int num = x;
                if(num < 0)
                    return false;
                while(num != 0){
                    int rem = num % 10;
                    palindrome = palindrome*10 + rem ;
                    num /= 10;
                }
                boolean result = (x == palindrome) ? true : false;
                return result;
            }
}
