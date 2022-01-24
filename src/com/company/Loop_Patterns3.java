package com.company;

import java.util.*;

public class Loop_Patterns3 {
    public static void main(String[] args) {
    // Butterfly Pattern
        System.out.print("Enter The value of N = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
/*
     1st half of pattern
        for (int i = 1; i <= n; i++) {              // Outer Loop
            for (int j = 1 ; j <= i; j++  ){        // Inner Loop 1
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++){     // Inner Loop 2
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){            // Inner Loop 3
                System.out.print("*");
            }
            System.out.println();
        }
    2nd Half Pattern
        for (int i = n; i >= 1; i--) {              // Outer Loop 2
            for (int j = 1; j <= i; j++) {          // Inner Loop 4
                System.out.print("*");
            }
            for (int j = 1;j <= 2*(n - i); j++){    // Inner Loop 5
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {          // Inner Loop 6
                System.out.print("*");
            }
            System.out.println();
        }

    // Hollow Butterfly Pattern
        // Upper Half
        for(int i = 1; i <= n; i++){
            for (int j = 1;j <= i ; j++){
                if(i== 1 || j == 1 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
                }
            for(int j = 1; j<=i ;j++ ){
                if(i== 1 || j == 1 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    // Lower Half of Pattern
        for(int i = n; i >= 1; i--){
            for (int j = 1;j <= i ; j++){
                if(i== 1 || j == 1 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ;j++ ){
                if(i== 1 || j == 1 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
//Home work(Hollow Rhombus)
        for (int i =1;  i<=n ; i++){
            for (int j = 1; j <=n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++){
                if( i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }System.out.println();
        }
        */
// home work Problem (pascal Triangle)
        for (int i = 0; i < n ;i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            int a =1 ;
            for (int j = 0 ; j <= i ; j++ ) { 
                if(i==1){
                    System.out.print("1 ");
                }
                else {
                    System.out.print(a + " ");
                    a = a * (i - j) / (j + 1);
                }
            }
            System.out.println();
        }
    }
}
