package com.beingzero.org;

import java.util.Scanner;

public class TransposeOfMatrix {
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
        findTransposeOfAMatrix(arr,n,m);
    }

    public static void findTransposeOfAMatrix(int[][] arr,int row, int col) {
        int[][] temp = new int[col][row];
        for (int i = 0; i < col ; i++) {
            for (int j = 0; j < row ; j++) {
                temp[i][j] = arr[j][i];
            }
        }
        for(int i= 0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
