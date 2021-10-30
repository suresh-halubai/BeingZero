package com.beingzero.org;

import java.util.Scanner;

public class MatrixColumnSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = input.nextInt();
        System.out.println("Enter the columns");
        int m = input.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("enter the elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        findMatrixColumnSum(arr, n, m);
    }

    public static void findMatrixColumnSum(int[][] arr, int n, int m) {

        for (int i = 0 ; i < m ; i++) {
            int sum =0;
            for (int j = 0; j < n ; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }

    }
}
