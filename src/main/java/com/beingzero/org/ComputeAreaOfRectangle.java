package com.beingzero.org;

import java.util.Scanner;

public class ComputeAreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String length = input.next();
        String breadth = input.next();
        System.out.print( printRectangleArea(length,breadth));
    }

    public static long printRectangleArea(String length, String breadth) {
        long area = Long.parseLong(String.valueOf(length))* Long.parseLong(String.valueOf(breadth));
        return area;
    }
}
