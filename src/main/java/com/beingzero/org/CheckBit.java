package com.beingzero.org;

import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();
        in.close();
        DecToBinary(num,k);

    }

    public static void  DecToBinary(int num, int k) {
            int[] binNum = new int[32];
            int i =0;

            while(num >0){
                binNum[i] = num % 2;
                i++;
                num = num/2;
            }

            if(binNum[k] == 1)
                System.out.println("true");
            else
                System.out.println("false");
    }
}
