package com.beingzero.org;

import java.util.Scanner;

public class NarciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len =  String.valueOf(num).length();
        findNarciNumber(num,len);
    }

    public static void findNarciNumber(int num, int len) {
        int sum = 0 ;
        int temp = num;
        while(num != 0){
            int rem = num%10;
            sum = sum+ (int) Math.pow(rem,len);
            num/=10;
        }
        if(temp == sum) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
