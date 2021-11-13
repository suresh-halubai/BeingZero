package com.beingzero.org;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        long test = Long.parseLong(str);
        long num = test;
        long cube = 0;

        while(num !=0){
            long rem = num%10;
            cube += (rem*rem*rem);
            num = num/10;
        }

        String flag = (cube == test) ? "Yes": "No" ;

        System.out.println(flag);

    }
}
