package com.company;

import java.util.*;

public class twoDArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : " );
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols : " );
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];     // 2D array syntax

        for(int i = 0; i < rows; i++){
            for(int j =0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
//  1. Printing input number in matrix form
        for(int i =0 ; i < rows; i++){
            for(int j = 0; j < cols; j++  ){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//  2. Searching number x in matrix array
        System.out.print("Enter the number to be searched: ");
        int x = sc.nextInt();
        for(int i =0 ; i < rows; i++){
            for(int j = 0; j < cols; j++  ){
                if(matrix[i][j] == x) {
                    System.out.println(x + " is at index matrix["+ i + "][" + j +"]" );
                }
            }
        }
    }
}
