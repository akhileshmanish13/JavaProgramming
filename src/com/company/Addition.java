package com.company;

import java.util.*;

public class Addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        float div = (a/b) ;
        System.out.println("Sum  a & b = " + (a+b));// Addition
        System.out.println("Diff a & b = " + (a-b));//Difference
        System.out.println("Mul a & b = " + (a*b));// Multiplication
        System.out.println("Div a & b = " + div);// Division
    }
}
