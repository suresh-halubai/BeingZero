package com.beingzero.org;

import java.util.Scanner;

public class HalloRectAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int length = in.nextInt();

        for (int i = 1; i <=width ; i++) {

            for (int j = 1; j <= width || j<= length; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
