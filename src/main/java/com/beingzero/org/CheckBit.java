package com.beingzero.org;

import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        DecToBinary(num);

    }

    public static void  DecToBinary(int num) {
            int[] binNum = new int[32];
            int i =0;

            while(num >0){
                binNum[i] = num % 2;
                i++;
                num = num/2;
            }

            /*for (int j = i-1; j >=0 ; j--) {

                System.out.print(binNum[j]);
            }*/

            if(binNum[i-1] == 1)
                System.out.println("true");

    }
}
