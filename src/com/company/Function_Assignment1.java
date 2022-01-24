package com.company;

import java.util.*;

public class Function_Assignment1 {
//Average Function
    public static float average(int a, int b, int c){
        return (a+b+c)/3f;
    }
//==================================================================================================
//Sum of all odd number from 1 to n
    public static int oddSum(int n){
        int sum = 0;
        for(int i = 1 ; i <= n; i++){
            if( i%2 == 1) {
                sum += i ;
            }
        }
        return sum;
    }
//==================================================================================================
//Main Function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        System.out.println("Average of a, b and c is : " + average(a,b,c));
        System.out.print("Enter the value upto which you need oddSum: ");
        int n = sc.nextInt();
        System.out.println("Sum of all odd number upto " + n + " is: " +oddSum(n) );
    }
}
