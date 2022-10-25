package com.beingzero.org.leetcode;

import java.util.*;

public class RingsAndRods {
    public static void main(String[] args) {
        String s = "B0R0G0R9R0B0G0";
        System.out.println(countPoints(s));
    }
    public static int countPoints(String rings) {
        Map<Integer,HashSet<Character>> ringMap = new HashMap<>();

        for(int i = 0; i < rings.length() ; i++){
            System.out.println(rings.charAt(i + 1) - '0');
            ringMap.computeIfAbsent(rings.charAt(i + 1) - '0', t -> new HashSet<>()).add(rings.charAt(i));
            i += 1;
        }
        int count = 0;
        for (HashSet<Character> set : ringMap.values()) {
            count += set.size() / 3;
        }
        return count;
    }
}
