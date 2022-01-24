package com.company;

import java.util.*;

public class Loop_Pattern4 {
    public static void main(String[] args){
        System.out.print("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
/*
// Half Pyramid Homework
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number - i ; j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
 */
 // Inveted Half Pyramid Homework
        for (int i = 1; i<= number; i++ ){
            for(int j = 0; j <= number - i ; j++){  // j is intialize by 0 here
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
