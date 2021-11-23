package com.beingzero.org;

import java.util.Scanner;

public class RightAngledTrianglePattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte num = in.nextByte();
        int count = 1;
        for (byte i = 1; i <=num ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
