package com.beingzero.org;

import java.util.Scanner;

public class ComputeAreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        System.out.print( printRectangleArea(length,breadth));
    }

    public static double printRectangleArea(double length, double breadth) {
        double area = length*breadth;
        return area;
    }
}
