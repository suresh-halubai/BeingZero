package com.beingzero.org;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(findFact(num));
    }

    public static int findFact(int num) {
        int fact = 1;
        if (num == 0)
            return 1;
       for(int i = num; i>0 ; i--){
           fact = fact*i;
       }
       return fact;
    }
}
