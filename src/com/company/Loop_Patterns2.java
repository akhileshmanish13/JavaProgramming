package com.company;

import java.util.*;

public class Loop_Patterns2 {
    public static void main(String[] args) {
// First Pattern
        /*
        for( int i = 0 ; i < 4; i++){
            for(int j = 0 ; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
// Second Pattern
        /*
        for( int i = 1 ; i <= 4; i++){
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
//Third Pattern
        /*
        for(int i=1; i<=4; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
//Fourth Pattern
        /*
        for(int i=4; i>=1; i--){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
//Fifth Pattern
        /*
        for(int i = 1; i<=4; i++){
            for (int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
 // Sixth Problem
        /*
        for(int i = 1; i <= 6 ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
//Seventh Problem
        /*
        for(int i=1 ; i <= 6; i++){
            for(int j = 1 ; j <= 6-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
         */
// Eighth Problem
        /*
        for (int i = 1; i <= 6; i++){
            for(int j = 1; j <= i ; j++){
                int sum =i+j;
                if(sum % 2 ==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
         */
//Home work problem (Rhombus)
        /*
        for (int i = 1; i <= 6; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(int j= 1; j <= 6 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
// Home Work Problem 2 (Number Pyramid)
        /*
        for(int i = 1; i <= 6; i++){
            for(int j = 5; j >=i ; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
         */

// Home Work Problem (Palindrome number Pyramid)

        for (int i = 1; i<=6; i++){
            for ( int j = 5; j>=i ; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i-j+1);
            }
            for (int j = 2; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
