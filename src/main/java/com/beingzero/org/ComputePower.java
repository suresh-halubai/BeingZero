package com.beingzero.org;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(findThePowerOf(a,b));

    }

    public static int findThePowerOf(int a, int b) {
        int temp = 1;
        if(b == 0){
            return 1;
        }
        while(b > 0){
            temp *= a ;
            b--;
        }
        return temp;
    }
}
