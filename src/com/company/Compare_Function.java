package com.company;

import java.util.*;

public class Compare_Function {
    // Compare Function
    public static void compareNumber(int a, int b){
        if( a > b ){
            System.out.println("a is greater than b"  );
        }
        else{
            System.out.println("b is greater than a" );
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        compareNumber(a,b); // Function call
    }
}
