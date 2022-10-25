package com.beingzero.org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public static void main(String[] args) {
        String romanNumbers = "IV";
        System.out.println(romanToInt(romanNumbers));
    }
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for( int i = 0; i < s.length(); i++){
            result= result+ romanMap.get(s.charAt(i));
        }
        return result;
    }

}
