package com.beingzero.org;

import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = input.nextInt();
        System.out.println("Enter the columns");
        int m = input.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("enter the elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        findMatrixRowSum(arr,n,m);
    }

    public static void findMatrixRowSum(int[][] arr, int n, int m) {

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m ; j++) {
                /*System.out.println(arr[i][j])*/;
                sum = sum+arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
