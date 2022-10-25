package com.beingzero.org;

import java.util.Scanner;

public class RightAngledTrianglePattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte num = in.nextByte();
        int count = 1;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.println(count + " ");
                count++;
            }
        }
    }
}

