package com.beingzero.org;

import java.util.Scanner;

public class RectAnglePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count =num;

        for(int i =1; i<=num ; i++){
            for (int j = num; j >=1 ; j--) {
                if(j == i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
