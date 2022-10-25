package com.beingzero.org;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i < num ; i++) {
          if (i % 2 != 0) {
              for (int j = 1; j <=i ; j++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
        }
    }
}
