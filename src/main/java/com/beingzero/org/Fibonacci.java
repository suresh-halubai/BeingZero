package com.beingzero.org;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b =1;
        int[] temp = new int[20];
        temp[0] = a+b;
        //System.out.print(temp[0]+ " ");
        for (int i = 1; i < 20 ; i++) {
            temp[i] = a+b;
            a = b;
            b = temp[i];
            //System.out.print(temp[i]+ " ");
        }
        System.out.println(temp[num-1]);
    }
}
