package com.company;

import java.util.*;

public class twoDArrayHandsOn {

    public static void main(String [] args) {

//   1. picking number from matrix in Spiral order/pattern.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols in matrix: ");
        int cols = sc.nextInt();

        System.out.println("Enter the elements in matrix:");
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows ; i++ ){
            for(int j = 0 ; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = cols - 1;

        System.out.print("Element of matrix in spiral pattern is: ");

        while( rowStart <= rowEnd && colStart <= colEnd){
//  1.
            for(int j = colStart; j <= colEnd; j++){
                System.out.print( matrix[rowStart][j]+ " ");
            }
            rowStart++;
//  2.
            for(int i = rowStart; i <= rowEnd; i++){
                System.out.print(matrix[i][colEnd]+ " ");
            }
            colEnd--;
//  3.
            for(int j = colEnd ; j >= colStart; j--){
                System.out.print( matrix[rowEnd][j]+ " ");
            }
            rowEnd--;
//  4.
            for(int i = rowEnd; i >= rowStart; i--){
                System.out.print(matrix[i][colStart]+ " ");
            }
            colStart++;
        }
    }
}
